package MariosPizzaBAr;

//@Cathrine, Vibeke, Matti og Magdalena
import static MariosPizzaBAr.SystemUI.visHovedmenu;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class HovedMenu {

    OrderFactory myOrderFactory = new OrderFactory();
    Scanner scan = new Scanner(System.in);
    Menu menu = new Menu();
    BestillingsListe bestListe = new BestillingsListe();
    private boolean quit = false;
    Archive arkiv = new Archive();
    OrderToSQL orderToSQL = new OrderToSQL();
    DBStatistik dbStat = new DBStatistik();

    public HovedMenu() {
    }

    //Metode til at køre hovedmenuen. Hver del er skrevet som en case i en switch.
    public void startProgram() throws ClassNotFoundException, SQLException {
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
                    } catch (SQLException ex) {
                        System.out.println("Fejl - Menu-filen ikke fundet!");
                    }
                }
                break;

                //Tilføjer en ordre til ArrayListen og arkivet.
                case "2":
                    try {
                        Order nyOrdre = myOrderFactory.newOrder();
                        if (nyOrdre == null) {
                            break;
                        } else {
                            bestListe.addOrder(nyOrdre);
                            arkiv.sendToArkiv(nyOrdre);
                            orderToSQL.SendOrderToDB(nyOrdre);
                        }

                    } catch (NumberFormatException ex) {
                        System.out.println("Fejl - Dette er ikke et pizzanr. Du vender tilbage til hovedmenuen og starte "
                                + "forfra på denne ordre og den gemmes heller ikke i arkiv!");
                    }
                    break;

                //Viser ArrayListens indhold.
                case "3":
                    System.out.println("Bestillings Liste\n" + bestListe.toString() + "\n");
                    System.out.println("\nIndtast et tilfældigt bogstav eller nummer og tryk enter for at kommer "
                            + "tilbage til Hovedmenu");
                    scan.next().charAt(0);
                    scan.nextLine();
                    break;

                //Fjerner en ordre fra ArrayListen.
                case "4":
                    try {
                        System.out.println("Skriv ordrenummer og tryk enter for at tilføje pizza til ordre");
                        int ordreNummer = scan.nextInt();
                        scan.nextLine();
                        bestListe.fjernOrdre(bestListe.findEfterNummer(ordreNummer));
                    } catch (NullPointerException ex) {
                        System.out.println("Fejl - Der er ingen ordre med dette nummer at slette i bestillingslisten!");
                    }
                    break;

                //Udskriver "Arkiv" filen med gemte ordrer.
                case "5":
                    System.out.println("Arkiv");
                    arkiv.showDBArchive();
                    System.out.println("\nIndtast et tilfældigt bogstav eller nummer og tryk enter for at kommer "
                            + "tilbage til Hovedmenu");
                    scan.next().charAt(0);
                    scan.nextLine();
                    break;

                //Kører statistik metoderne.
                case "6":
                    System.out.println("Statistik:");
                    dbStat.LæsStatistikDagSnitPris();
                    dbStat.LæsStatistikPizzaAntal();
                    dbStat.LæsStatistikSnitPris();
                    
                    System.out.println("\nIndtast et tilfældigt bogstav eller nummer og tryk enter for at kommer "
                                + "tilbage til Hovedmenu");
                        scan.next().charAt(0);
                        scan.nextLine();
                    break;
                    
                //Lukker programmet igen.
                case "7":
                    quit = true;
                    System.out.println("Programmet afsluttes...");
                    break;
                default: {
                    System.out.println("Systemet gik ned... \n- Du er tilbage på Hovedmenuen");
                }
            }
        }
    }
}
