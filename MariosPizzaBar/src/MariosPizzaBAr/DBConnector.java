package MariosPizzaBAr;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
    public static Connection getConnection(){

        Connection connection = null;

        String url = "jdbc:mysql://localhost:3306/pizza?serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false";
        String user = "root";
        String kodeord = "Matti12345h";

        try {
            connection = DriverManager.getConnection(url,user,kodeord);
        } catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}