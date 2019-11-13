package MariosPizzaBAr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    public static Connection getConnection() throws ClassNotFoundException, SQLException{


        Connection connection = null;
        
       Connection connector = null;
        String url = "jdbc:mysql://localhost:3306/pizza?";
        url += "serverTimezone=UTC&allowPublicKeyRetrieaval=true&";
        url += "useSSL=false";
        String user = "root";

        String password = "gadaMagda88";;


        try {
            connection = DriverManager.getConnection(url,user,password);
        } catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
