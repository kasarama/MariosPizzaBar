
package MariosPizzaBar;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Magdalena
 */
public class Ordrer {

    private Date afTid;
    ArrayList<Pizza> ordrer;

    public void tilføjPizza(Pizza pizza) {
        ordrer.add(pizza);
    }

    public Ordrer(ArrayList<Pizza> ordrer) {
        this.ordrer = ordrer;
        afTid = new Date();

    }

}
