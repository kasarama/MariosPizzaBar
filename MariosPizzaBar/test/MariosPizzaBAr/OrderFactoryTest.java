package MariosPizzaBAr;


import org.junit.Test;
import static org.junit.Assert.*;

public class OrderFactoryTest {
    OrderFactory myOrderFactory = new OrderFactory();
    Order order = myOrderFactory.orderMaker();
    PizzaFactory myFactory = new PizzaFactory("Data/Pizzaer.txt");
    Pizza pizza1 = myFactory.getPizzaByPosition(8);
    Pizza pizza2 = myFactory.getPizzaByPosition(2);
    Pizza pizza3 = myFactory.getPizzaByPosition(3);
    Pizza pizza4 = myFactory.getPizzaByPosition(5);
    
    
    public OrderFactoryTest() {
        order.addPizza(pizza1);
        order.addPizza(pizza2);
        order.addPizza(pizza3);
        order.addPizza(pizza4);
    }

    @Test
    public void testPickUpTime() {
        
        String expected = "10:51";
        String actual = myOrderFactory.pickUpTime();
        assertEquals(expected, actual);
    }

    /**
     * Test of sendToArkiv method, of class OrderFactory.
     */
    @Test
    public void testSendToArkiv() {               
    }

    /**
     * Test of toString method, of class OrderFactory.
     */
    @Test
    public void testToString() {
    }

    /**
     * Test of sum method, of class OrderFactory.
     */
    @Test
    public void testSum() {
        order.addPizza(pizza1);
        order.addPizza(pizza2);
        order.addPizza(pizza3);
        order.addPizza(pizza4);
        int expected = 290;
        int actual = order.getSum();
        assertEquals(expected, actual);
    }

    /**
     * Test of nextOrder method, of class OrderFactory.
     */
    @Test
    public void testNextOrder() {
    }

    /**
     * Test of getNummer method, of class OrderFactory.
     */
    @Test
    public void testGetNummer() {
    }

    /**
     * Test of getSum method, of class OrderFactory.
     */
    @Test
    public void testGetSum() {
    }

    /**
     * Test of getAfTid method, of class OrderFactory.
     */
    @Test
    public void testGetAfTid() {
    }

    /**
     * Test of getOrdrer method, of class OrderFactory.
     */
    @Test
    public void testGetOrdrer() {
    }
    
}
