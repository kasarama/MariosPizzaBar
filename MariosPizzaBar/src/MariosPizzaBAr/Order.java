package MariosPizzaBAr;

//@Cathrine, Vibeke, Matti og Magdalena
import java.util.ArrayList;

/*
Laves en metode som tager en integar som er pizzanummer og ved kun brug 
af den pizzanummer tilføjej ny pizzaobjekt til en order
 */
public class Order {
    private int nummer;
    private int sum;
    private String afTid;
    private ArrayList<Pizza> ordrer;

    //Constructor:
    public Order(int nummer, int sum, String afTid) {
        this.nummer = nummer;
        this.sum = sum;
        this.afTid = afTid;
        ordrer = new ArrayList();
    }
    
    /*Udskriver en string med alle ordrer i ArrayListen "ordrer".
    Giver information om pizzaerne, plus deres afhentningstid og samlede pris.*/
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

}
