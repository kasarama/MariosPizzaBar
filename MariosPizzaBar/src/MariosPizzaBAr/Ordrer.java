package MariosPizzaBar;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class Ordrer {

    private static int nummerMax = 0;
    private int nummer;
    private int samletPris;
    private Date afTid;
    private ArrayList<Pizza> ordrer = new ArrayList();

    public void tilføjPizza(Pizza pizza) {
        ordrer.add(pizza);
    }

    public double samletPris() {
        double prisSum = 0;

        for (Pizza pizza : ordrer) {
            prisSum = prisSum + pizza.getPizzaPrice();
        }
        return prisSum;
    }

    public void pickUpTime() {
        Calendar calendar = Calendar.getInstance();

        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE) + 30;
        int second = calendar.get(Calendar.SECOND);
        System.out.println(hour + ":" + minute + ":" + second);

    }

    public Ordrer() {
        this.nummer = nummerMax++;
        this.ordrer = ordrer;
        afTid = new Date();
        this.samletPris = ordrer.SamletPris();
        //Date date = new Date();
        //System.out.println(new Timestamp(date.getTime()));

    }

    @Override
    public String toString() {
        String result = "";
        for (Pizza pizza : ordrer) {
            result += pizza.toString();
        }
        return "Ordrer " + nummer + ":" + "" + "\n"
                + result + "SamletPris: " + samletPris + ", afTid=" + afTid + ", ordrer=" + ordrer + '}';
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

    public Date getAfTid() {
        return afTid;
    }

    public ArrayList<Pizza> getOrdrer() {
        return ordrer;
    }

}
