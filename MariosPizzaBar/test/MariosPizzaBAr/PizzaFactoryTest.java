/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MariosPizzaBAr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Magdalena
 */
public class PizzaFactoryTest {

    public PizzaFactoryTest() {
    }

    /**
     * Test of toString method, of class PizzaFactory.
     */
    @Test
    public void testToString() {
        OrderFactory myOrderFactory = new OrderFactory();
        Ordrer order = myOrderFactory.nextOrder();
        PizzaFactory myFactory = new PizzaFactory("Data/Pizzaer.txt");
        Pizza pizza1 = myFactory.getPizzaByPosition(8);
        Pizza pizza2 = myFactory.getPizzaByPosition(2);
        Pizza pizza3 = myFactory.getPizzaByPosition(3);
        Pizza pizza4 = myFactory.getPizzaByPosition(5);

    }

    /**
     * Test of getPizzaByPosition method, of class PizzaFactory.
     */
    @Test
    public void testGetPizzaByPosition() {
    }

    /**
     * Test of getPosition method, of class PizzaFactory.
     */
    @Test
    public void testGetPosition() {
    }

    /**
     * Test of getNavn method, of class PizzaFactory.
     */
    @Test
    public void testGetNavn() {
    }

    /**
     * Test of getIngredienser method, of class PizzaFactory.
     */
    @Test
    public void testGetIngredienser() {
    }

    /**
     * Test of getPris method, of class PizzaFactory.
     */
    @Test
    public void testGetPris() {
        try {
            String filename = "Data/Pizzaer.txt";
            String line = Files.readAllLines(Paths.get(filename)).get(2);
            String[] myArr = line.split(";");
            int expected = 70;
            int actual = Integer.parseInt(myArr[3]);
            assertEquals(expected, actual);
        } catch (IOException ex) {
            Logger.getLogger(PizzaFactoryTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
