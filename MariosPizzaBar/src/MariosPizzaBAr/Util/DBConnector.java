package MariosPizzaBAr.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    public static Connection getConnection() throws ClassNotFoundException, SQLException{


        Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/mariodb?";
        url += "serverTimezone=UTC&allowPublicKeyRetrieaval=true&";
        url += "useSSL=false";
        String password = "Matti12345h";
        String user = "root";

        //Class.forName("com.mysql.cj.jdbc.Driver");


        try {
            connection = DriverManager.getConnection(url,user,password);
        } catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
