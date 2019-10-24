package MariosPizzaBAr;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class Ordrer {

    private static int nummerMax = 0;
    private int nummer;
    private int samletPris;
    private String afTid;
    private ArrayList<Pizza> ordrer = new ArrayList();

    public void tilføjPizza(Pizza pizza) {
        ordrer.add(pizza);
    }

    public int samletPris() {
        int prisSum = 0;

        for (Pizza pizza : ordrer) {
            prisSum = prisSum + pizza.getPizzaPrice();
        }
        return prisSum;
    }

    public String pickUpTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, +(30));

        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        return hour + ":" + minute + ":" + second;
        
    // System.out.println(hour + ":" + minute + ":" + second);

    }

    public Ordrer() {
        this.nummer = nummerMax++;
    //    this.ordrer = ordrer;
        afTid = pickUpTime();
        //this.samletPris = ordrer.samletPris();
        this.samletPris = samletPris();
        //Date date = new Date();
        //System.out.println(new Timestamp(date.getTime()));

    }

    @Override
    public String toString() {
        String result = "";
        for (Pizza pizza : ordrer) {
            result += pizza.toString();
        }
        return "Ordrer " + getNummer() + ":" + "\n"
                + result + "\n" + "SamletPris: " + getSamletPris() + "\n" + "Afhentnings tid: " + getAfTid();
    }

    public static int getNummerMax() {
        return nummerMax;
    }

    public int getNummer() {
        return nummer;
    }

    public int getSamletPris() {
        return samletPris;
    }

    public String getAfTid() {
        return afTid;
    }

    public ArrayList<Pizza> getOrdrer() {
        return ordrer;
    }

}
