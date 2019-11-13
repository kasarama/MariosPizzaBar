
package MariosPizzaBAr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;


public class UpdateOrderNumberFromDB {
    
      public static int UpdateOrderNumber() throws ClassNotFoundException, SQLException {
        //TODO get movie from DB
        int orderNumber = 0;
        String query = "Select idOrder from mariodb.ordrer order by idOrder";
        PreparedStatement pstmt = null;
        Connection myConnector = null;
        ResultSet resSet = null;
        myConnector = DBConnector.getConnection();
        
        String sql = "SELECT MAX(idordrer) AS result FROM mariodb.ordrer";
        ResultSet rs = DBConnector.getConnection().prepareStatement(sql).executeQuery();
        if(rs.next()){
            orderNumber = rs.getInt("result");
        }
        
       // resSet.close();
       // pstmt.close();
       // myConnector.close();
        
        return orderNumber;

        /*String query = "Insert into ordrer (idOrdrer, Tid, Dato, Sum) "
                + "values (" + order.getNummer() +",\""+ order.getAfTid()+"\"," + "\"" + date() + "\"," + order.getSum()
                + ") where idOrdrer = " + order.getNummer();*/

        
    }
}
