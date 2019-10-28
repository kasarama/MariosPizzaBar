package MariosPizzaBAr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class OrderFactory {

    private static int nummerMax = 1;
    private int nummer;
    private int sum;
    private String afTid;
    private ArrayList<Pizza> order = new ArrayList();

    public OrderFactory() {
    }

    public String pickUpTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, +(30));

        int hour = calendar.get(Calendar.HOUR);
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
        this.nummer = nummerMax++;
        this.afTid = pickUpTime();
        this.sum = sum();
        order = new Ordrer(this.nummer, this.sum, this.afTid);

        return order;
    }

    public void newOrder() { // lav metoden ikke void , men returner ordre med nummer
        //int prisSum = 0;
        ArrayList<Pizza> ordrer = new ArrayList();
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
                ordrer.add(myFactory.getPizzaByPosition(Integer.parseInt(n)));
            } else if (Integer.parseInt(n) > 30) {
                System.out.println("Pizzanummeret findes ikke, prøv igen");
                newOrder();
            } else {
                System.out.println("Dette er ikke et tal, prøv igen");
                newOrder();
            }
            
        }
        

        System.out.println(ordrer.toString());
        System.out.println("^ Denne ordre er tilføjet");
        //returner ordre med nummer
    }

   public void makeOrdrerObject() throws IOException{
        
        int prisSum = 0;
        ArrayList<Pizza> ordrer = new ArrayList();
        System.out.println("Press number of pizza");
        PizzaFactory myFactory = new PizzaFactory("Data/Pizzaer.txt");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
        
        
        myFactory.getPizzaByPosition(n).toString();
        ordrer.add(myFactory.getPizzaByPosition(n));    
        n=sc.nextInt();
        
    }
        
        for (Pizza pizza : ordrer) {
            prisSum += pizza.getPris();
        }
        System.out.println(prisSum);
        
        
        File f = new File("Arkiv.txt");
        
        try (BufferedWriter bw= new BufferedWriter(new FileWriter(f,true))){
            
                
                     
            bw.write(ordrer.toString());
            bw.write("\n");
        }
        System.out.println(ordrer.toString()+prisSum);
        System.out.println("ordrer is done");
    }

    public int getNummer() {
        return nummer;
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
