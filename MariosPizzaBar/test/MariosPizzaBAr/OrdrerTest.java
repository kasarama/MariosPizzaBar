/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MariosPizzaBAr;

import java.util.ArrayList;
import java.util.Calendar;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author John
 */
public class OrdrerTest {

    OrderFactory myOrderFactory = new OrderFactory();
    Ordrer order = myOrderFactory.orderMaker();
    PizzaFactory myFactory = new PizzaFactory("Data/Pizzaer.txt");
    Pizza pizza1 = myFactory.getPizzaByPosition(8);
    Pizza pizza2 = myFactory.getPizzaByPosition(2);
    Pizza pizza3 = myFactory.getPizzaByPosition(3);
    Pizza pizza4 = myFactory.getPizzaByPosition(5);

    public OrdrerTest() {
    }

    @Test
    public void TestpickUpTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, +(30));
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println(hour + ":" + minute + ":" + second);

        //hvis det giver + 30 min så det rigtigt whuuhuu!!
    }

    /**
     * Test of addPizza method, of class Ordrer.
     */
    @Test
    public void testAddPizza() {
    }

    /**
     * Test of sum method, of class Ordrer.
     */
    @Test
    public void testSum() {
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
     * Test of toString method, of class Ordrer.
     */
    @Test
    public void testToString() {
        
    }
}
