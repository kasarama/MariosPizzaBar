package MariosPizzaBAr;

//@Cathrine, Vibeke, Matti og Magdalena
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HovedMenu {

    OrderFactory myOrderFactory = new OrderFactory();
    Scanner scan = new Scanner(System.in);
    Menu menu = new Menu();
    BestillingsListe bestListe = new BestillingsListe();
    private boolean quit = false;
    String userInputString;
    Order newOrderObject;

    public HovedMenu() {
    }

    public void startProgram() {
        while (quit == false) {
            visHovedmenu();
            userInputString = scan.nextLine();
            switch (userInputString) {

                case "1": {
                    try {
                        menu.readFiles();
                    } catch (FileNotFoundException ex) {
                        System.out.println("Fejl: Filen fra menukort blev ikke fundet");
                    }
                }
                System.out.println("\nTryk på vilkårlig tast(andet end enter) og dernæst enter for at komme til "
                        + "hovedmenuen");
                scan.next().charAt(0);
                break;
                case "2":
                    newOrderObject = myOrderFactory.newOrder();
                    bestListe.addOrder(newOrderObject);
                    break;

                case "3":
                    System.out.println("Bestillingsliste\n" + bestListe.toString());
                    break;

                case "4":
                    System.out.println("Indtast order nummer og tryk dernæst enter");
                    int orderNummer = scan.nextInt();
                    bestListe.fjernOrdre(bestListe.findEfterNummer(orderNummer));
                    break;

                case "5":
                    System.out.println("");
                    //TODO - Vis arkivflier;!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                    break;

                case "6":
                    System.out.println("Programmet afsluttes...");
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
        System.out.println("\t\t\"Hovedmenu\"");
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
