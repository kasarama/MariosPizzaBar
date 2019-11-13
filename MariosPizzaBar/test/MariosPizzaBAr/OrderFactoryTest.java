package MariosPizzaBAr;

import MariosPizzaBAr.Factory.PizzaFactory;
import MariosPizzaBAr.Factory.OrderFactory;
import MariosPizzaBAr.Model.Order;
import MariosPizzaBAr.Model.Pizza;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrderFactoryTest {
    PizzaFactory pf = new PizzaFactory();
    Pizza pizza1 = pf.getPizzaByPosition(1);
    Pizza pizza2 = pf.getPizzaByPosition(1);
    OrderFactory o = new OrderFactory();

        public void testSum() {
        Order or = o.orderMaker();
        or.addPizza(pizza1);
        or.addPizza(pizza2);
        int expResult = 130;
        int result = or.sum();
        assertEquals(expResult, result);

    }

}
