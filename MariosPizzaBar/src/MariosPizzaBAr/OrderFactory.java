/*<<<<<<< HEAD
package MariosPizzaBAr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderFactory {
    
    private static int count = 0;
    private int nummer;
    private int sum;
    private String afTid;
    private ArrayList<Pizza> order = new ArrayList();

    public OrderFactory() {
    }

    public String pickUpTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, +(30));

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        // int second = calendar.get(Calendar.SECOND);
        // return hour + ":" + minute + ":" + second;
        return hour + ":" + minute;
    }


    public void sendToArkiv() {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        File file = new File(day+"."+month+"."+getNummer() + ".txt");

        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            br.write(toString());
            br.newLine();
        } catch (IOException e) {
            System.out.println("Unable to read file " + file.toString());
        }
    }


    @Override
    public String toString() {
        String result = "";
        for (Pizza pizza : order) {
            result += pizza.toString();
        }
        return "Ordrer " + getNummer() + ":" + "\n"
                + result + "\n"
                + "Afhentnings tid: " + getAfTid()
                + "\t\tSamletPris: " + getSum() + "\n";
    }

    public int sum() {
        int prisSum = 0;

        for (Pizza pizza : order) {
            int tmpPrisSum = prisSum;
            prisSum = tmpPrisSum + pizza.getPris();
        }
        return prisSum;
    }

    public Ordrer orderMaker() {
        Ordrer order = null;
        this.nummer = count++;
        this.afTid = pickUpTime();
        this.sum = sum();
        order = new Ordrer(this.nummer, this.sum, this.afTid);

        return order;
    }


    public Ordrer newOrder() { // lav metoden ikke void , men returner ordre med nummer

        Ordrer ordre = orderMaker();
        System.out.println("Indtast nummeret af pizza(er) og gå videre ved at trykke \"0\":");
        PizzaFactory myFactory = new PizzaFactory("Data/Pizzaer.txt");
        Scanner sc = new Scanner(System.in);
        String n = "";
        boolean quit = false;
        while (quit == false) {
            n = sc.nextLine();
            if (Integer.parseInt(n) == 0) {
                quit = true;
            } else if (Integer.parseInt(n) > 0 && Integer.parseInt(n) <= 30) {
                myFactory.getPizzaByPosition(Integer.parseInt(n)).toString();
                ordre.addPizza(myFactory.getPizzaByPosition(Integer.parseInt(n)));
            } else if (Integer.parseInt(n) > 30) {
                System.out.println("Pizzanummeret findes ikke, prøv igen");
                newOrder();
            } else {
                System.out.println("Dette er ikke et tal, prøv igen");
                newOrder();
            }
            
        }
        File f = new File("Data/Arkiv.txt");
        
        try (BufferedWriter bw= new BufferedWriter(new FileWriter(f,true))){
            
                
                     
            bw.write(ordre.toString());
            bw.write("\n");
        } catch (IOException ex) {
            System.out.println("Error: Kan ikke tilføje til fil");
        }

        System.out.println(ordre.toString());
        System.out.println("^ Denne ordre er tilføjet");
        //returner ordre med nummer
        return ordre;
    }


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
        return order;
    }
}
=======*/

package MariosPizzaBAr;

//@Cathrine, Vibeke, Matti og Magdalena
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

    //String til at udskrive skabte ordre med dens tilføjede pizza(er).
    @Override
    public String toString() {
        String result = "";
        for (Pizza pizza : ordrer) {
            result += pizza.toString();
        }
        return "Ordrer " + getNummer() + ":" + "\n"
                + result + "\n"
                + "Afhentnings tid: " + getAfTid()
                + "\t\tSamletPris: " + getSum() + "\n";
    }
    
     //Regner nuværende tid ud og tilføjer 30 minutter til afhentningstidspunkt.
    public String pickUpTime() {
        calendar.add(Calendar.MINUTE, +(30));

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        return hour + ":" + minute;
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
    public Order newOrder() { // lav metoden ikke void , men returner ordre med nummer

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
                myFactory.getPizzaByPosition(Integer.parseInt(n)).toString();
                ordre.addPizza(myFactory.getPizzaByPosition(Integer.parseInt(n)));
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
}
//>>>>>>> d8d0308d438b3790c7454d85a4ae447a11a4e4a5
