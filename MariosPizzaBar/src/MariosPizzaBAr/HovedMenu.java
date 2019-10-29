package MariosPizzaBAr;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
Skal Menu printes i hver case eller kan den printes en gang før switch og forblive på skræmen?
fra case 2 alle ordrer bliver send til bestillinsliste
 */
public class HovedMenu {

    OrderFactory myOrderFactory = new OrderFactory();
    Scanner scan = new Scanner(System.in);
    Menu menu = new Menu();
    Ordrer ordre = myOrderFactory.orderMaker();
    //   Pizza tmpPizza = myFactory.getPizzaByPosition(3); 
    BestillingsListe bestListe = new BestillingsListe();

    private boolean quit = false;

    public HovedMenu() {
    }

    //Metode til at køre hovedmenuen. Hver del er skrevet som en case i en switch.
    public void startProgram() {
        while (quit == false) {
            try {
                visHovedmenu();
                String brugerInput = scan.nextLine();
                switch (brugerInput) {
                    
                    //Viser hele menukortet fra "Pizzaer" filen.
                    case "1": {
                        try {
                            menu.readFiles();
                        } catch (FileNotFoundException ex) {
                            System.out.println("File not found");
                        }
                    }
                    System.out.println("\nTryk på vilkårlig tast(andet end enter) og dernæst enter for at komme til "
                            + "hovedmenuen");
                    scan.next().charAt(0);
                    break;
                    
                    //Tilføjer en ordre til ArrayListen og arkivet.
                    case "2":
                        Ordrer nyOrdre = myOrderFactory.newOrder();
                        bestListe.addOrder(nyOrdre);
                        
                        menu.toString();
//TO DO - Få lavet en ordre, så man kan tilføje pizzaer fra menu;
                        break;
                        
                    //Viser ArrayListens indhold.
                    case "3":
                        System.out.println("Bestillings Liste\n" + bestListe.toString());
                        break;
                        
                    //Fjerner en ordre fra ArrayListen.
                    case "4":
                        Scanner scaner = new Scanner(System.in);
                        System.out.println("skriv order nummer og tryk enter");
                        int orderNummer = scaner.nextInt();
                        bestListe.fjernOrdre(bestListe.findEfterNummer(orderNummer));
                        menu.toString();
                        break;
                        
                    //Udskriver "Arkiv" filen med gemte ordrer.
                    case "5":
                        System.out.println("Arkiv\n");
                        String fileName = "Data/Arkiv.txt";
                        
                        File txtFile = new File(fileName);
                        
                        Scanner in = new Scanner(txtFile);
                        int count = 1;
                        while (in.hasNextLine()) {
                            String line = in.nextLine();
                            System.out.println(line);
                            count++;
                        }
                        in.close();
                        
                        menu.toString();
//TODO - Vis arkivflier;
                        break;
                        
                    //Lukker programmet igen.
                    case "6":
                        quit = true;
                        break;
                    default: {
                        System.out.println("Systemet gik ned... \n- Du er tilbage på Hovedmenuen");
                        startProgram();
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HovedMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    //Instruktioner til at betjene hovedmenuen og kommandoerne i metoden startProgram.
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
