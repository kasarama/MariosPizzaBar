/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MariosPizzaBAr.Util;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author John
 */
public class DBConnectorTest {
    
    public DBConnectorTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getConnection method, of class DBConnector.
     */
    @Test
    public void testGetConnection() throws Exception {
        System.out.println("getConnection");
        Connection expResult = null;
        Connection result = DBConnector.getConnection();
        Statement st = result.createStatement();
        String query="select * from pizzaer limit 1";
        ResultSet res = (ResultSet) st.executeQuery(query);
        System.out.println(res.getRow());
        assertTrue(result!=null);
        
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
