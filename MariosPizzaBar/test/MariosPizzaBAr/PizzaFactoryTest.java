/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MariosPizzaBAr;

import MariosPizzaBAr.Factory.PizzaFactory;
import MariosPizzaBAr.Model.Pizza;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vnord
 */
public class PizzaFactoryTest {
    
    public PizzaFactoryTest() {
    }
    
    @Before
    public void setUp() {
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
    }
    
}
