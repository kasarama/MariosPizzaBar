/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MariosPizzaBAr.Factory;

import MariosPizzaBAr.Model.Pizza;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vnord
 */
public class PizzaFactoryTest2 {
    
    public PizzaFactoryTest2() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getPizzaByPosition method, of class PizzaFactory.
     */
    @Test
    public void testGetPizzaByPosition() {
        System.out.println("getPizzaByPosition");
        int n = 0;
        PizzaFactory instance = new PizzaFactory();
        Pizza expResult = null;
        Pizza result = instance.getPizzaByPosition(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetPizzaByID method, of class PizzaFactory.
     */
    @Test
    public void testGetPizzaByID() throws Exception {
        System.out.println("GetPizzaByID");
        int id = 1;
        PizzaFactory instance = new PizzaFactory();
        int expResult = 65;
        int actual = instance.GetPizzaByID(id).getPris();
        assertEquals(expResult, actual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
