/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MariosPizzaBAr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Magdalena
 */
public class PizzaToSQL {
    
    

       public void SendPizzaToDB(Order order, Pizza pizza) throws ClassNotFoundException, SQLException {

            

        //TODO get movie from DB
       
        String query = "Insert into pizza.odrerinfo (pizzaNr, dato) "
                + "values (\"" + order.getAfTid() + "\"," + "\"" + date() + "\"," + order.getSum()
                + ")";

        /*String query = "Insert into ordrer (idOrdrer, Tid, Dato, Sum) "
                + "values (" + order.getNummer() +",\""+ order.getAfTid()+"\"," + "\"" + date() + "\"," + order.getSum()
                + ") where idOrdrer = " + order.getNummer();*/
        myConnector = DBConnector.getConnection();
        pstmt = myConnector.prepareStatement(query);
        pstmt.executeUpdate(query);

        //resultSet.close();
        pstmt.close();
        myConnector.close();*/

    }
    
}
