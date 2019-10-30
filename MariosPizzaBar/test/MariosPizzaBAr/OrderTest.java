package MariosPizzaBAr;

import java.util.Calendar;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class OrderTest {
    OrderFactory myOrderFactory = new OrderFactory();
    Order order = myOrderFactory.orderMaker();
    PizzaFactory myFactory = new PizzaFactory();
    Pizza pizza1 = myFactory.getPizzaByPosition(8);
    Pizza pizza2 = myFactory.getPizzaByPosition(2);
    Pizza pizza3 = myFactory.getPizzaByPosition(3);
    Pizza pizza4 = myFactory.getPizzaByPosition(5);
    String time;

    @Before
    public void setUp() throws Exception{
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, +(30));

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        time = hour + ":" + minute;
    }
    
    @Test
    public void TestpickUpTime() throws Exception {
        setUp();
        String expected = time;
        String actual = order.getAfTid();
        assertEquals(expected, actual);
    }

    @Test
    public void testAddPizza() {
        order.addPizza(pizza1);
        order.addPizza(pizza2);
        System.out.println(order.toString());
        
        int expected = 145;
        int actual = order.sum();
        assertEquals(expected, actual);

    }

    /**
     * Test of toString method, of class Order.
     */
    @Test
    public void testToString() {
    }

    /**
     * Test of sum method, of class Order.
     */
    @Test
    public void testSum() {
        order.addPizza(pizza2);
        order.addPizza(pizza3);
        int expected = 140;
        int actual = order.sum();
        assertEquals(expected, actual);
        
    }

    /**
     * Test of getNummer method, of class Order.
     */
    @Test
    public void testGetNummer() {
    }

    /**
     * Test of getSum method, of class Order.
     */
    @Test
    public void testGetSum() {
        order.addPizza(pizza2);
        order.addPizza(pizza1);
        order.addPizza(pizza4);
        System.out.println(order.toString());
        System.out.println("Samlet pris: " + order.getSum());
        int expected = 220;
        int actual = order.getSum();
        assertEquals(expected, actual);
    }

    /**
     * Test of getAfTid method, of class Order.
     */
    @Test
    public void testGetAfTid() {
    }

    /**
     * Test of getOrdrer method, of class Order.
     */
    @Test
    public void testGetOrdrer() {
    }
    

    

}
