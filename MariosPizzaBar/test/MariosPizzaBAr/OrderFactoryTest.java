
package MariosPizzaBAr;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class OrderFactoryTest {

    PizzaFactory pf = new PizzaFactory();
    Pizza pizza1 = pf.getPizzaByPosition(1);
    Pizza pizza2 = pf.getPizzaByPosition(1);
    OrderFactory o = new OrderFactory();
    Order or = o.orderMaker();

    public OrderFactoryTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testSum() {
        or.addPizza(pizza1);
        or.addPizza(pizza2);
        int expResult = 130;
        int result = or.sum();
        assertEquals(expResult, result);

    }

}
