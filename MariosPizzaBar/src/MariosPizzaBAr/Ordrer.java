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
    static int count;
    private int nummer;
    private int sum;
    private String afTid;
    private ArrayList<Pizza> ordrer = new ArrayList();

    public Ordrer(int nummer, int sum, String afTid) {
        this.nummer = nummer;
        this.sum = sum;
        this.afTid = afTid;
    }

    public void addPizza(Pizza pizza) {
        ordrer.add(pizza);
    }

    
    public int sum() {
        int prisSum = 0;

        for (Pizza pizza : ordrer) {
        int tmpPrisSum=prisSum;
            prisSum = tmpPrisSum + pizza.getPris();
        }
        return prisSum;
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
