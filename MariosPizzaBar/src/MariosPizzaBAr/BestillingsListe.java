package MariosPizzaBAr;

//@Cathrine, Vibeke, Matti og Magdalena
import java.util.ArrayList;

public class BestillingsListe {

    ArrayList<Order> bestillingsliste = new ArrayList();

    public BestillingsListe() {
    }

    //Udskriver alle skabte og gemte ordrer i ArrayListen "bestillingsliste".
    @Override
    public String toString() {
        String result = "";
        for (Order o : bestillingsliste) {
            result += o.toString() + "\n";
        }
        return result;
    }
    
    //Tilføjer en skabt ordre til ArrayListen.
    public void addOrder(Order o) {
        bestillingsliste.add(o);
    }

    //Fjerner en ordre fra ArrayListen.
    public void fjernOrdre(Order o) {
        bestillingsliste.remove(o);
        System.out.println("Ordren nr " + o.getNummer() + " er slettet");
    }
    
    /*Find en skabt ordre i ArrayListen ud fra et givent nummer; ordrenummer.
    Bliver ikke brugt alene, men sammen med fjernOrdre ovenover for at fjerne
    en ordre fra ArrayListen.*/
    public Order findEfterNummer(int n) {

        Order tmpOrder = null;
        for (Order order : bestillingsliste) {
            if (n == order.getNummer()) {
                tmpOrder = order;
            } else {
                System.out.println("Ordren findes ikke");
            }

        }
        return tmpOrder;
    }
}
