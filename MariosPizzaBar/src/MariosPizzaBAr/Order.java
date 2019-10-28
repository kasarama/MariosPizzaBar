package MariosPizzaBAr;

//@Cathrine, Vibeke, Matti og Magdalena
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;


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
