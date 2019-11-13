package MariosPizzaBAr;

import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrderFactoryTest {

    @Test
    public void testSum() throws ClassNotFoundException, SQLException {
        PizzaFactory pf = new PizzaFactory();
        Pizza pizza1 = pf.getPizzaByPosition(1);
        Pizza pizza2 = pf.getPizzaByPosition(1);
        OrderFactory o = new OrderFactory();
        Order or = o.orderMaker();
        or.addPizza(pizza1);
        or.addPizza(pizza2);
        int expResult = 130;
        int result = or.sum();
        assertEquals(expResult, result);

    }

}
