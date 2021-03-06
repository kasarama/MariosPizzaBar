
package MariosPizzaBAr.Database;
import MariosPizzaBAr.Model.Order;
import MariosPizzaBAr.Util.DBConnector;
import static java.lang.String.format;
import java.sql.*;
import java.util.Calendar;


public class OrderToSQL {

    public OrderToSQL() {
    }

    Calendar calendar = Calendar.getInstance();
        
        

    public void SendOrderToDB(Order order) throws SQLException, ClassNotFoundException {
        
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);

        String date = year + "." + month + "." + day;

        Connection myConnector = null;
        myConnector = DBConnector.getConnection();
        PreparedStatement pstmt = null;
        //ResultSet resultSet = null;

        /*String query = "Update ordrer set idOrdrer = " + order.getNummer() + ", Tid = \"" + order.getAfTid() 
                + "\", Dato = \"" + date() + "\", Sum = " + order.getSum() + " where idOrdrer = " + order.getNummer();*/
        String query = "Insert into mariodb.ordrer (Tid, Dato, Sum)" 
                + "values (\"" + order.getAfTid() + "\"," + "\"" + date + "\"," + order.sum()
                + ")";

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
