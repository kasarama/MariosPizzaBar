/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MariosPizzaBAr;

import MariosPizzaBAr.Factory.OrderFactory;
import MariosPizzaBAr.Model.Order;
import MariosPizzaBAr.Model.Pizza;
import static java.lang.String.format;
import java.util.Calendar;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Magdalena
 */
public class OrderFactoryTest {

    Pizza pizza1 = new Pizza(33, "ABC", "abcde", 100);
    Pizza pizza2 = new Pizza(34, "BBBB", "ccddee", 100);
    Pizza pizza3 = new Pizza(35, "CC", "xyz", 100);

    Calendar calendar = Calendar.getInstance();
    Order order2 = new Order(2, 280, "15:00");
    OrderFactory ordFact = new OrderFactory();
    String time;

    public OrderFactoryTest() {
    }

    @Before
    public void setUp() {

        calendar.add(Calendar.MINUTE, +(30));
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        time = format("%d:%02d", hour, minute);
    }

    /**
     * Test of pickUpTime method, of class OrderFactory.
     */
    @Test
    public void testPickUpTime() {
        String expected = time;
        String actual = ordFact.pickUpTime();
        assertEquals(expected, actual);
    }

    /**
     * Test of sum method, of class OrderFactory.
     */
    @Test
    public void testSum() {
        order2.addPizza(pizza1);
        int expected = 100;
        int actual = order2.sum();
        assertEquals(expected, actual);

    }

}
