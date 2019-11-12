package MariosPizzaBAr;

import static java.lang.String.format;
import java.sql.*;
import java.util.Calendar;

public class OrderToSQL {

    public OrderToSQL() {
    }
    
    
    Calendar calendar = Calendar.getInstance();

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

    public String date() {
        String date = "";
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);

        return date = year + "." + month + "." + day;
    }
}
