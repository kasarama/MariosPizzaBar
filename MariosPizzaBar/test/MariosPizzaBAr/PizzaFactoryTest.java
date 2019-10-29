
package MariosPizzaBAr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaFactoryTest {

    @Test
    public void testToString() {
        OrderFactory myOrderFactory = new OrderFactory();
        Order order = myOrderFactory.orderMaker();
        PizzaFactory myFactory = new PizzaFactory();
        Pizza pizza1 = myFactory.getPizzaByPosition(8);
        Pizza pizza2 = myFactory.getPizzaByPosition(2);
        Pizza pizza3 = myFactory.getPizzaByPosition(3);
        Pizza pizza4 = myFactory.getPizzaByPosition(5);

    }

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
