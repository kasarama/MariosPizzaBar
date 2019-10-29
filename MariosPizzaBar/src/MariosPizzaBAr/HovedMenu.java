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
    Archive arkiv = new Archive();

    public HovedMenu() {
    }

    //Metode til at køre hovedmenuen. Hver del er skrevet som en case i en switch.
    public void startProgram() {
        while (quit == false) {
                visHovedmenu();
                String brugerInput = scan.nextLine();
                switch (brugerInput) {
                    
                    //Viser hele menukortet fra "Pizzaer" filen.
                    case "1": {
                        try {
                            menu.readFiles();
                            System.out.println("\nIndtast et tilfældigt bogstav eller nummer og tryk enter for at kommer "
                                + "tilbage til Hovedmenu");
                        scan.next().charAt(0);
                        scan.nextLine();
                        } catch (FileNotFoundException ex) {
                            System.out.println("Fejl - Menu-filen ikke fundet!");
                        }
                    }
                    break;

                 //Tilføjer en ordre til ArrayListen og arkivet.
                case "2":
                    try{
                    Order nyOrdre = myOrderFactory.newOrder();
                    bestListe.addOrder(nyOrdre);
                    arkiv.sendToArkiv(nyOrdre);}
                    catch(NumberFormatException ex){
                        System.out.println("Fejl - Dette er ikke et pizzanr. Du vender tilbage til hovedmenuen og starte "
                                + "forfra på denne ordre og den gemmes heller ikke i arkiv!");
                    }
                    break;

                //Viser ArrayListens indhold.
                case "3":
                    System.out.println("Bestillings Liste\n" + bestListe.toString());
                    System.out.println("\nIndtast et tilfældigt bogstav eller nummer og tryk enter for at kommer "
                                + "tilbage til Hovedmenu");
                        scan.next().charAt(0);
                        scan.nextLine();
                    break;

                //Fjerner en ordre fra ArrayListen.
                case "4":
                    try{
                    System.out.println("Skriv ordrenummer og tryk enter for at tilføje pizza til ordre");
                    int ordreNummer = scan.nextInt();
                    scan.nextLine();
                    bestListe.fjernOrdre(bestListe.findEfterNummer(ordreNummer));
                    }
                    catch (NullPointerException ex){
                        System.out.println("Fejl - Der er ingen ordre med dette nummer at slette i bestillingslisten!");
                    }
                    break;

                //Udskriver "Arkiv" filen med gemte ordrer.
                case "5": 
                    System.out.println("Arkiv");
                    arkiv.showArchive();
                    System.out.println("\nIndtast et tilfældigt bogstav eller nummer og tryk enter for at kommer "
                                + "tilbage til Hovedmenu");
                        scan.next().charAt(0);
                        scan.nextLine();
                    break;

                //Lukker programmet igen.
                case "6":
                    quit = true;
                    System.out.println("Programmet afsluttes...");
                    break;
                default: {
                    System.out.println("Systemet gik ned... \n- Du er tilbage på Hovedmenuen");
                }
            }
        }
    }

    //Instruktioner til at betjene hovedmenuen og kommandoerne i metoden startProgram.
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
