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
import org.junit.Before;

public class OrdrerTest {

    OrderFactory myOrderFactory = new OrderFactory();
    Ordrer order = myOrderFactory.orderMaker();
    PizzaFactory myFactory = new PizzaFactory("Data/Pizzaer.txt");
    Pizza pizza1 = myFactory.getPizzaByPosition(8);
    Pizza pizza2 = myFactory.getPizzaByPosition(2);
    Pizza pizza3 = myFactory.getPizzaByPosition(3);
    Pizza pizza4 = myFactory.getPizzaByPosition(5);
    String time;

    public OrdrerTest() {
    }

    @Before
    public void setUp() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, +(30));

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        // int second = calendar.get(Calendar.SECOND);
        // return hour + ":" + minute + ":" + second;
        time= hour + ":" + minute;
    }

    @Test
    public void TestpickUpTime() { 
        
        String expected=time;
        String actual=order.getAfTid();
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
        int expected=145;
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
