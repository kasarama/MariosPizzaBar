
package MariosPizzaBAr.Database;
import MariosPizzaBAr.Model.Pizza;
import MariosPizzaBAr.Util.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

public class PizzaToSQL {

    public PizzaToSQL() {
    }

    public void SendPizzaToDB(Pizza pizza) throws ClassNotFoundException, SQLException {
        Calendar calendar = Calendar.getInstance();

        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);

        String date = year + "." + month + "." + day;

        //TODO get movie from DB
        Connection myConnector = null;
        myConnector = DBConnector.getConnection();
        PreparedStatement pstmt = null;
        String query = "Insert into mariodb.odrerinfo (pizzaNr, dato) "
                + "values ("+pizza.getPosition()+", \" "+date +" \")";

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
