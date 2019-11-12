package MariosPizzaBAr;

//@Cathrine, Vibeke, Matti og Magdalena

import static java.lang.String.format;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class OrderFactory {

    private static int count = 1;
    private int nummer;
    private int sum;
    private String afTid;
    private ArrayList<Pizza> ordrer = new ArrayList();
    Calendar calendar = Calendar.getInstance();
    Archive arkiv = new Archive();

    public OrderFactory() {
    }

    
    
     //Regner nuværende tid ud og tilføjer 30 minutter til afhentningstidspunkt.
    public String pickUpTime() {
        calendar.add(Calendar.MINUTE, +(30));

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        return format("%d:%02d",hour,minute);
    }
    
    //Regner den samlede sum af pizza(er) i ordreren ud.
    public int sum() {
        int prisSum = 0;

        for (Pizza pizza : ordrer) {
            int tmpPrisSum = prisSum;
            prisSum = tmpPrisSum + pizza.getPris();
        }
        return prisSum;
    }

    //Laver et ordre objekt med id/nummer, afhentningstid og samlet sum.
    public Order orderMaker() {
        Order order = null;
        this.nummer = count++;
        this.afTid = pickUpTime();
        this.sum = sum();
        order = new Order(this.nummer, this.sum, this.afTid);

        return order;
    }

    /*Skaber en ordre hvor du kan indtaste den mængde pizzaer du skal bruge.
    Indtast et nummer fra menukortet og pizzaen bliver tilføjet.
    Derefter bliver ordreren gemt i Arkivet med BufferedWriter.
    Ordreren bliver så returneret så den kan tilføjet til ArrayListen.*/
    public Order newOrder() throws SQLException, ClassNotFoundException { // lav metoden ikke void , men returner ordre med nummer
        PizzaToSQL pizzaToSQL=new PizzaToSQL();
        Order ordre = orderMaker();
        System.out.println("Indtast nummeret af pizza(er) og gå videre ved at trykke \"0\":");
        PizzaFactory myFactory = new PizzaFactory();
        Scanner sc = new Scanner(System.in);
        String n = "";
        boolean quit = false;
        while (quit == false) {
            n = sc.nextLine();
            if (Integer.parseInt(n) == 0) {
                quit = true;
            } else if (Integer.parseInt(n) > 0 && Integer.parseInt(n) <= 30) {
                myFactory.GetPizzaByID(Integer.parseInt(n)).toString();
                ordre.addPizza(myFactory.GetPizzaByID(Integer.parseInt(n)));
                pizzaToSQL.SendPizzaToDB(myFactory.GetPizzaByID(Integer.parseInt(n)));
                
                
            } else if (Integer.parseInt(n) > 30) {
                System.out.println("Pizzanummeret findes ikke, prøv igen");
                newOrder();
            } else {
                System.out.println("Dette er ikke et tal, prøv igen");
                newOrder();
            }

        }
        System.out.println(ordre.toString());
        System.out.println("^ Denne ordre er tilføjet");
        return ordre;
    }
/*
    public int getNummer() {
        return count;
    }

    public int getSum() {
        return sum;
    }

    public String getAfTid() {
        return afTid;
    }

    public ArrayList<Pizza> getOrdrer() {
        return ordrer;
    }
*/
}