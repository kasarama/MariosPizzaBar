    
package MariosPizzaBAr;

import MariosPizzaBAr.Factory.PizzaFactory;
import MariosPizzaBAr.Model.Pizza;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class PizzaTest {
    Pizza pizza;    
    PizzaFactory myFactory = new PizzaFactory();
    Pizza tmpPizza = myFactory.getPizzaByPosition(3);    
    
    @Before
    public void setUp() {
        pizza=new Pizza(1,"toto","takria",1);
    }
     
    @Test
    public void testGetNavn() {
        System.out.println("getNavn");
        Pizza instance = pizza;
        String expResult = "";
        String result = instance.getNavn();
        assertEquals("toto", result);
        System.out.println(result + " is equal to the name expected");
    }

    @Test
    public void testGetIngredienser() {
        System.out.println("getIngredienser");
        Pizza instance = pizza;
        String expResult = "";
        String result = instance.getIngredienser();
        assertEquals("takria", result);
        System.out.println("result is that ingredients are "+result);
    }

    @Test
    public void testGetPris() {
        int expected = 70;
        int actual = tmpPizza.getPris();
        assertEquals(expected, actual);
                
    }

    
}
