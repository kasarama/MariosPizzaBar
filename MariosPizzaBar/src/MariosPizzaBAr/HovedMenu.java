package MariosPizzaBAr;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HovedMenu {

    Scanner scan = new Scanner(System.in);
    Menu menu = new Menu();
    Ordrer ordre = new Ordrer();
    private boolean quit = false;

    public HovedMenu() {
    }

    public void startProgram() {
        while (quit == false) {
            visHovedmenu();
            char brugerInput = scan.next().charAt(0);
            switch (brugerInput) {
                case '1':
            {
                try {
                    menu.readFiles();
                } catch (FileNotFoundException ex) {
                    System.out.println("File not found");;;
                }
            }
                    System.out.println("\nTryk på vilkårlig tast(andet end enter) og dernæst enter for at komme til "
                            + "hovedmenuen");
                    scan.next().charAt(0);
                    break;
                case '2':
                    menu.toString();
//TO DO - Få lavet en ordre, så man kan tilføje pizzaer fra menu;
                    break;
                case '3':
                    menu.toString();
//TODO - Vis ordrerliste;
                    break;
                case '4':
                    menu.toString();
//TODO - Fjern ordre fra Bestillingsliste;
                    break;
                case '5':
                    menu.toString();
//TODO - Vis arkivflier;
                    break;
                case '6':
                    quit = true;
                    break;
                default: {
                    System.out.println("Systemet gik ned... \n- Du er tilbage på Hovedmenuen");
                    startProgram();
                }
            }

        }
    }

    public void visHovedmenu() {
        System.out.println();
        System.out.println("\t\t\"Hovedmenuen\"");
        System.out.println();
        System.out.println("Skriv følgende tal og tryk dernæst enter for at gå ind i punktet: ");
        System.out.println();
        System.out.println("1) Vis \"Menukort\"");
        System.out.println("2) Lav ordre");
        System.out.println("3) Vis ordrerliste");
        System.out.println("4) Slet ordre");
        System.out.println("5) Vis arkiv");
        System.out.println("6) Afslut programmet");
        System.out.println();
    }
}
