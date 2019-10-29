package MariosPizzaBAr;

//@Cathrine, Vibeke, Matti og Magdalena
import java.util.ArrayList;


public class Order {
    private int nummer;
    private int sum;
    private String afTid;
    private ArrayList<Pizza> ordrer;

    public Order(int nummer, int sum, String afTid) {
        this.nummer = nummer;
        this.sum = sum;
        this.afTid = afTid;
        ordrer = new ArrayList();
    }
    
    @Override
    public String toString() {
        String result = "";
        for (Pizza pizza : ordrer) {
            result += pizza.toString()+"\n";
        }
        return "Order nr. " + getNummer() + ":" + "\n"
                + result + "\n"
                + "Afhentnings tid: " + getAfTid()
                + "\t\tSamletPris: " + sum() + "\n";
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

}
