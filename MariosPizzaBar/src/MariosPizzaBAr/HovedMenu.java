package MariosPizzaBAr;

//@Cathrine, Vibeke, Matti og Magdalena
import java.io.File;
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
        try{
            visHovedmenu();
            String brugerInput = scan.nextLine();
            switch (brugerInput) {

                case "1": {
                    try {
                        menu.readFiles();
                    } catch (FileNotFoundException ex) {
                        System.out.println("Fejl! Menu-fil ikke fundet");
                    }
                }
                System.out.println("\nTryk på vilkårlig tast(andet end enter) og dernæst enter for at komme til "
                        + "hovedmenuen");
                scan.next().charAt(0);
                break;
                
                case "2":
                    Order nyOrdre = myOrderFactory.newOrder();
                    bestListe.addOrder(nyOrdre);
                    break;

                case "3":
                    System.out.println("Bestillings Liste\n" + bestListe.toString());
                    break;

                case "4":
                    System.out.println("Skriv ordrenummer og tryk enter for at tilføje pizza til ordre");
                    int ordreNummer = scan.nextInt();
                    bestListe.fjernOrdre(bestListe.findEfterNummer(ordreNummer));
                    break;

                case "5": // ?? Skal der ikke være en metode istedet vi kalder på ?? - kig f.eks. i Menu selvom den nok
                    //skal være i Order
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
                    break;

                case "6":
                    quit = true;
                    System.out.println("Programmet afsluttes...");
                    break;
                default: {
                    System.out.println("Systemet gik ned... \n- Du er tilbage på Hovedmenuen");
                    startProgram();
                }
            }
        
        }catch (FileNotFoundException ex) {
                System.out.println("Fejl! Menu-filen er ikke fundet");;
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
