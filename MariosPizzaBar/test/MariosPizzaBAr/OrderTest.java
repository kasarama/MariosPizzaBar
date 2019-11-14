/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MariosPizzaBAr;

import MariosPizzaBAr.Model.Order;
import MariosPizzaBAr.Model.Pizza;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Magdalena
 */
public class OrderTest {

    Pizza pizza1 = new Pizza(31, "AAA", "a,b,c", 50);
    Pizza pizza2 = new Pizza(32, "BBB", "b,c,d", 60);
    Pizza pizza3 = new Pizza(33, "CCC", "d,e,f", 70);

    Order order1 = new Order(1, 180, "14:00");

    public OrderTest() {
    }

    @Before
    public void setUp() {
    }

    /**
     * Test of toString method, of class Order.
     */
    @Test
    public void testToString() {
    }

    /**
     * Test of addPizza method, of class Order.
     */
    @Test
    public void testAddPizza() {
        order1.addPizza(pizza1);
        order1.addPizza(pizza2);
        order1.addPizza(pizza3);

        int expected = 180;
        int actual = order1.sum();
        assertEquals(expected, actual);
    }

    /**
     * Test of sum method, of class Order.
     */
    @Test
    public void testSum() {
        order1.addPizza(pizza1);
        order1.addPizza(pizza2);
        int expected = 110;
        int actual = order1.sum();
        assertEquals(expected, actual);
    }

    /**
     * Test of getNummer method, of class Order.
     */
    @Test
    public void testGetNummer() {
        int expected = 1;
        int actual = order1.getNummer();
        assertEquals(expected, actual);
    }

    /**
     * Test of getSum method, of class Order.
     */
    @Test
    public void testGetSum() {
        int expected = 180;
        int actual = order1.getSum();
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
