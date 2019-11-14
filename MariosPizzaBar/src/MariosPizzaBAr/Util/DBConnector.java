package MariosPizzaBAr.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    public static Connection getConnection() throws ClassNotFoundException, SQLException{

// 1) Matti X 2) TestX 3) diagramX 4)SQL script dump? 5)Interface
        
        Connection connection = null;
        
        String url = "jdbc:mysql://localhost:3306/mariodb?";
        url += "serverTimezone=UTC&allowPublicKeyRetrieaval=true&";
        url += "useSSL=false";
        String user = "root";
        String password = "1234";

        //Class.forName("com.mysql.cj.jdbc.Driver");


        try {
            connection = DriverManager.getConnection(url,user,password);
        } catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
