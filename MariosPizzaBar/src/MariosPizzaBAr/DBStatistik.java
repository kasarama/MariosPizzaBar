package MariosPizzaBAr;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

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
        System.out.println("Write Dato, like this format example:2019:11:13");
        Scanner myScan = new Scanner(System.in);
        dato=myScan.nextLine();
        String q = "SELECT AVG(sum) FROM pizza.ordrer where Dato= " + dato +";";
        statement = connection.createStatement();
        statement.execute(q);
        ResultSet resultSet = statement.executeQuery(q);
        ResultSetMetaData rsmd = resultSet.getMetaData();
        while (resultSet.next()) {
                String columnValue = resultSet.getString(1);
                System.out.print(columnValue + " " + rsmd.getColumnName(1));
            }
            System.out.println("");
        }
    
public void LæsStatistikPizzaAntal() throws SQLException, ClassNotFoundException {
        Connection connection = null;
        Statement statement = null;
        //MainController.mainControllerLooop();
        connection = DBConnector.getConnection();
        
        String q = "select PizzaNR, count(*) from odrerinfo group by pizzaNR order by pizzaNR;";
        statement = connection.createStatement();
        statement.execute(q);
        ResultSet resultSet = statement.executeQuery(q);
        ResultSetMetaData rsmd = resultSet.getMetaData();
        while (resultSet.next()) {
                String columnValue = resultSet.getString(1);
                System.out.print(columnValue + " " + rsmd.getColumnName(1));
            }
            System.out.println("");
        }
}

    

        


