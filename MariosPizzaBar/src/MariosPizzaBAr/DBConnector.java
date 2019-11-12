package MariosPizzaBAr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    public static Connection getConnection() throws ClassNotFoundException, SQLException{

        Connection connection = null;
        
        String url = "jdbc:mysql://localhost:3306/pizza?";
        url += "serverTimezone=UTC&allowPublicKeyRetrieval=true&";
        url += "useSSL=false";
        String user = "root";
        String password = "AtM12K13BoC185";
        
        //Class.forName("com.mysql.cj.jdbc.Driver");

        try {
            connection = DriverManager.getConnection(url,user,password);
        } catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
