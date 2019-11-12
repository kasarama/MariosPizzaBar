package MariosPizzaBAr;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import java.sql.SQLException;
import java.sql.Statement;

public class DBStatistik {
public void LæsStatistikSnitPris() throws SQLException, ClassNotFoundException {
        Connection connection = null;
        Statement statement = null;
        //MainController.mainControllerLooop();
        connection = DBConnector.getConnection();
        String q = "SELECT AVG(sum) FROM pizza.ordrer;";
        statement = connection.createStatement();
        statement.execute(q);
        ResultSet resultSet = statement.executeQuery("SELECT AVG(sum) FROM pizza.ordrer;");
        ResultSetMetaData rsmd = resultSet.getMetaData();
        while (resultSet.next()) {
                String columnValue = resultSet.getString(1);
                System.out.print(columnValue + " " + rsmd.getColumnName(1));
            }
            System.out.println("");
        }
public void LæsStatistikDagSnitPris(String dato) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        Statement statement = null;
        //MainController.mainControllerLooop();
        connection = DBConnector.getConnection();
        
        String q = "SELECT AVG(sum) FROM pizza.ordrer where Dato=\"2019.10.12\";";
        statement = connection.createStatement();
        statement.execute(q);
        ResultSet resultSet = statement.executeQuery("SELECT AVG(sum) FROM pizza.ordrer where dato?;");
        ResultSetMetaData rsmd = resultSet.getMetaData();
        while (resultSet.next()) {
                String columnValue = resultSet.getString(1);
                System.out.print(columnValue + " " + rsmd.getColumnName(1));
            }
            System.out.println("");
        }
    }


        


