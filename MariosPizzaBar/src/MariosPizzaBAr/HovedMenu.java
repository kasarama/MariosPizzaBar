package MariosPizzaBAr;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class HovedMenu {

    Scanner scan = new Scanner(System.in);
    Menu menu = new Menu();
    Ordrer ordre = new Ordrer();
    private boolean quit = false;

    public HovedMenu() {
    }

    public void startProgram() throws FileNotFoundException {
        while (quit == false) {
            visHovedmenu();
            char brugerInput = scan.next().charAt(0);
            switch (brugerInput) {
                case '1':
                    menu.readFiles();
                    System.out.println("\nTryk på vilkårlig tast(andet end enter) og dernæst enter for at komme til hovedmenuen");
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
                    System.out.println("Systemet gik ned... \n- Du er tilbage på Startsiden");
                    startProgram();
                }
            }

        }
    }

    public void visHovedmenu() {
        System.out.println();
        System.out.println("\t\t\"Startside\"");
        System.out.println();
        System.out.println("Skriv følgende tal og tryk dernæst enter for at gå ind i punktet: ");
        System.out.println();
        System.out.println("Tryk \"1\" for: Vis \"Menukort\"");
        System.out.println("Tryk \"2\" for: Lav ordre");
        System.out.println("Tryk \"3\" for: Vis ordrerliste");
        System.out.println("Tryk \"4\" for: Slet ordre");
        System.out.println("Tryk \"5\" for: Vis arkiv");
        System.out.println("Tryk \"6\" for: Afslut programmet");
        System.out.println();
    }
}
