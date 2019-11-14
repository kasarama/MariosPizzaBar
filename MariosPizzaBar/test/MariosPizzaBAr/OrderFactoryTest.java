package MariosPizzaBAr;

import MariosPizzaBAr.Factory.PizzaFactory;
import MariosPizzaBAr.Factory.OrderFactory;
import MariosPizzaBAr.Model.Order;
import MariosPizzaBAr.Model.Pizza;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrderFactoryTest {

<<<<<<< HEAD
    @Test
    public void testSum() throws ClassNotFoundException, SQLException {
        PizzaFactory pf = new PizzaFactory();
        Pizza pizza1 = pf.getPizzaByPosition(1);
        Pizza pizza2 = pf.getPizzaByPosition(1);
        OrderFactory o = new OrderFactory();
=======
        public void testSum() {
>>>>>>> d97b18ae8f26ec62e0771e3a5e997d27d87aca8f
        Order or = o.orderMaker();
        or.addPizza(pizza1);
        or.addPizza(pizza2);
        int expResult = 130;
        int result = or.sum();
        assertEquals(expResult, result);

    }

}
