package MariosPizzaBAr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

/*
Laves en metode som tager en integar som er pizzanummer og ved kun brug 
af den pizzanummer tilføjej ny pizzaobjekt til en order
 */
public class Ordrer {
    private int nummer;
    private int sum;
    private String afTid;
    private ArrayList<Pizza> ordrer = new ArrayList();

    //Constructor:
    public Ordrer(int nummer, int sum, String afTid) {
        this.nummer = nummer;
        this.sum = sum;
        this.afTid = afTid;
    }

    //Tilføjer en pizza til ArrayListen "ordrer".
    public void addPizza(Pizza pizza) {
        ordrer.add(pizza);
    }

    //Regner den samlede sum ud af alle pizzaer i en skabt ordre.
    public int sum() {
        int prisSum = 0;

        for (Pizza pizza : ordrer) {
        int tmpPrisSum=prisSum;
            prisSum = tmpPrisSum + pizza.getPris();
        }
        return prisSum;
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
        return ordrer;
    }
    
    public void sendToArkiv() {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        File file = new File(day + "." + month + "." + getNummer() + ".txt");

        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            br.write(toString());
            br.newLine();
        } catch (IOException e) {
            System.out.println("Unable to read file " + file.toString());
        }
    }
    
    /*Udskriver en string med alle ordrer i ArrayListen "ordrer".
    Giver information om pizzaerne, plus deres afhentningstid og samlede pris.*/
    @Override
    public String toString() {
        String result = "";
        for (Pizza pizza : ordrer) {
            result += pizza.toString()+"\n";
        }
        return "Ordrer " + getNummer() + ":" + "\n"
                + result + "\n"
                + "Afhentnings tid: " + getAfTid()
                + "\t\tSamletPris: " + sum() + "\n";
    }

}
