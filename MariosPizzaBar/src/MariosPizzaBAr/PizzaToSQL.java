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

/**
 *
 * @author Magdalena
 */
public class PizzaToSQL {
    
    public void SendOrderToDB(Order order) throws SQLException {

        Connection myConnector = null;
        myConnector = DBConnector.getConnection();
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;
        String query = "Insert into ordrer (idOrdrer, Tid, Dato, Sum) "
                + "values (" + order.getNummer() + order.getAfTid() + "\"" + date() + "\"" + order.getSum()
                + ")";

        myConnector = DBConnector.getConnection();
        pstmt = myConnector.prepareStatement(query);
        resultSet = pstmt.executeQuery();

        resultSet.close();
        pstmt.close();
        myConnector.close();

    }
    
}
