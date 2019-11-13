/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MariosPizzaBAr;

import MariosPizzaBAr.Database.OrderToSQL;
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
 calendar.add(Calendar.MONTH, +(1));
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
        System.out.println();
        
    }

    /**
     * Test of date method, of class OrderToSQL.
     */
    @Test
    public void testDate() {
           OrderToSQL orderToSQL = new OrderToSQL();
        String expResult ="2019.11.12";
        String result = date;
        assertEquals(expResult, result);

    }

}
