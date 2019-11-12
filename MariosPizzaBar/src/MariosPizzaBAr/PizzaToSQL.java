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
import java.util.Calendar;

/**
 *
 * @author Magdalena
 */
public class PizzaToSQL {
    
    

       public void SendPizzaToDB(Order order, Pizza pizza) throws ClassNotFoundException, SQLException {
    Calendar calendar = Calendar.getInstance();

            
        calendar.add(Calendar.MONTH, +(1));
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);

        String date = year + "." + month + "." + day;

        //TODO get movie from DB

        Connection myConnector = null;
        myConnector = DBConnector.getConnection();
        PreparedStatement pstmt = null;       
        String query = "Insert into pizza.odrerinfo (pizzaNr, dato) "
                + "values (pizza.getPosition(), \"" + date + "\")";

        /*String query = "Insert into ordrer (idOrdrer, Tid, Dato, Sum) "
                + "values (" + order.getNummer() +",\""+ order.getAfTid()+"\"," + "\"" + date() + "\"," + order.getSum()
                + ") where idOrdrer = " + order.getNummer();*/
        myConnector = DBConnector.getConnection();
        pstmt = myConnector.prepareStatement(query);
        pstmt.executeUpdate(query);

        //resultSet.close();
        pstmt.close();
        myConnector.close();

    }
    
}
