package MariosPizzaBAr;

import java.util.ArrayList;

public class BestillingsListe {

    ArrayList<Ordrer> bestillingsliste = new ArrayList();

    public void addPizza(Ordrer o) {
        bestillingsliste.add(o);

    }

    public void fjernOrdre(Ordrer o) {
        bestillingsliste.remove(o);
    }
}
