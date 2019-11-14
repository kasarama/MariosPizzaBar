package MariosPizzaBAr.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    public static Connection getConnection() throws ClassNotFoundException, SQLException{

        Connection connection = null;

        String url = "jdbc:mysql://localhost:3306/MarioDB?";
        url += "serverTimezone=UTC&allowPublicKeyRetrieaval=true&";
        url += "useSSL=false";
        String password = "AtM12K13BoC185";
        String user = "root";




        try {
            connection = DriverManager.getConnection(url,user,password);
        } catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
