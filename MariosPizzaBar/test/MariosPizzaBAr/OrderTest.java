package MariosPizzaBAr;

import java.util.Calendar;
import static org.junit.Assert.assertEquals;
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

    public OrderTest() {
    }

      public void setUp() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, +(30));

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        // int second = calendar.get(Calendar.SECOND);
        // return hour + ":" + minute + ":" + second;
        time = hour + ":" + minute;
    }

    @Test
    public void TestpickUpTime() {

        String expected = time;
        String actual = order.getAfTid();
        assertEquals(expected, actual);
        //Indtast aktuel tid + 30 minutter i actual
    }

    /**
     * Test of addPizza method, of class Ordrer.
     */
    @Test
    public void testAddPizza() {
        order.addPizza(pizza1);
        order.addPizza(pizza2);
        int expected = 145;
        int actual = order.sum();
        assertEquals(expected, actual);

    }

    /**
     * Test of sum method, of class Ordrer.
     */
    @Test
    public void testSum() {
        order.addPizza(pizza3);
        order.addPizza(pizza3);
        int expected = 140;
        int actual = order.sum();
        assertEquals(expected, actual);
    }

    /**
     * Test of getNummer method, of class Ordrer.
     */
    @Test
    public void testGetNummer() {
    }

    /**
     * Test of getSum method, of class Ordrer.
     */
    @Test
    public void testGetSum() {
    }

    /**
     * Test of getAfTid method, of class Ordrer.
     */
    @Test
    public void testGetAfTid() {
    }

    /**
     * Test of getOrdrer method, of class Ordrer.
     */
    @Test
    public void testGetOrdrer() {
    }

    /**
     * Test of sendToArkiv method, of class Ordrer.
     */
    @Test
    public void testSendToArkiv() {
    }

    /**
     * Test of toString method, of class Ordrer.
     */
    @Test
    public void testToString() {
    }

}
