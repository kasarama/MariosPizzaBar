/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MariosPizzaBAr;

import java.util.Calendar;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Magdalena
 */
public class OrderToSQLTest {

    public OrderToSQLTest() {
    }
    String date;

    @Before
    public void setUp() throws Exception {

        Calendar calendar = Calendar.getInstance();

        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
     
        date = year + "." + month + "." + day ;
    }

    /**
     * Test of SendOrderToDB method, of class OrderToSQL.
     */
    @Test
    public void testSendOrderToDB() {
    }

    /**
     * Test of date method, of class OrderToSQL.
     */
    @Test
    public void testDate() {
           OrderToSQL orderToSQL = new OrderToSQL();
        String expResult =date;
        String result = orderToSQL.date();
        assertEquals(expResult, result);

    }

}
