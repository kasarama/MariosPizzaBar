package MariosPizzaBAr;

//@Cathrine, Vibeke, Matti og Magdalena
import java.util.ArrayList;

public class BestillingsListe {

    ArrayList<Order> bestillingsliste = new ArrayList();

    public BestillingsListe() {

    }

    @Override
    public String toString() {
        String result = "";
        for (Order o : bestillingsliste) {
            result += o.toString() + "\n";
        }
        return result;
    }

    public void addOrder(Order o) {
        bestillingsliste.add(o);
    }

    public void fjernOrdre(Order o) {
        bestillingsliste.remove(o);
    }

    public Order findEfterNummer(int n) {

        Order tmpOrder = null;
        for (Order order : bestillingsliste) {
            if (n == order.getNummer()) {
                 tmpOrder=order;
            }

        }return tmpOrder;
    }
}
