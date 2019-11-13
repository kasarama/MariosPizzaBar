package MariosPizzaBAr;

import java.sql.SQLException;
import java.util.Calendar;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class OrderTest {
    OrderFactory myOrderFactory = new OrderFactory();
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
        Order order = myOrderFactory.orderMaker();
        setUp();
        String expected = time;
        String actual = order.getAfTid();
        assertEquals(expected, actual);
    }

    @Test
    public void testAddPizza() throws ClassNotFoundException, SQLException {
        Order order = myOrderFactory.orderMaker();
        order.addPizza(pizza1);
        order.addPizza(pizza2);
        System.out.println(order.toString());
        
        int expected = 145;
        int actual = order.sum();
        assertEquals(expected, actual);

    }

    @Test
    public void testSum() throws ClassNotFoundException, SQLException {
        Order order = myOrderFactory.orderMaker();
        order.addPizza(pizza2);
        order.addPizza(pizza3);
        int expected = 140;
        int actual = order.sum();
        assertEquals(expected, actual);
        
    }
    
}
