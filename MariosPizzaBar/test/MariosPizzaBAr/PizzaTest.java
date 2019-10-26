/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MariosPizzaBAr;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author John
 */
public class PizzaTest {
    Pizza pizza;    
    PizzaFactory myFactory = new PizzaFactory("Data/Pizzaer.txt");
    Pizza tmpPizza = myFactory.getPizzaByPosition(3);
    public PizzaTest() {
        int nr;
        String navn;
        String ingredienser;
        int pris;
    }
    
    
    @Before
    public void setUp() {
        pizza=new Pizza(1,"toto","takria",1);
        
    }

    /**
     * Test of getPosition method, of class Pizza.
     
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        Pizza instance = null;
        int expResult = 0;
        int result = instance.getPosition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
*/
    
     
    @Test
    public void testGetNavn() {
        System.out.println("getNavn");
        Pizza instance = pizza;
        String expResult = "";
        String result = instance.getNavn();
        assertEquals("toto", result);
        System.out.println(result + " is equal to the name expected");
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getIngredienser method, of class Pizza.
     */
    @Test
    public void testGetIngredienser() {
        System.out.println("getIngredienser");
        Pizza instance = pizza;
        String expResult = "";
        String result = instance.getIngredienser();
        assertEquals("takria", result);
        System.out.println("result is that ingredients are "+result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

   /*
    @Test
    public void testPizzaPosition() {
        System.out.println("PizzaPosition");
        int n = 0;
        Pizza instance = null;
        instance.PizzaPosition(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/

    /**
     * Test of getPosition method, of class Pizza.
     */
    @Test
    public void testGetPosition() {
    }

    /**
     * Test of getPris method, of class Pizza.
     */
    @Test
    public void testGetPris() {
        int expected = 70;
        int actual = tmpPizza.getPris();
        assertEquals(expected, actual);
                
    }

    /**
     * Test of toString method, of class Pizza.
     */
    @Test
    public void testToString() {
    }
    

    
}
