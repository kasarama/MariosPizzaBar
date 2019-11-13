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
                System.out.print(columnValue + " Gennemsnitspris for alle arkiverede ordrer");
            }
            System.out.println("");
        }
public void LæsStatistikDagSnitPris() throws SQLException, ClassNotFoundException {
        Connection connection = null;
        Statement statement = null;
        //MainController.mainControllerLooop();
        connection = DBConnector.getConnection();
        
        System.out.println("Write Dato, like this format example: 2019.11.13");
        Scanner myScan = new Scanner(System.in);
        String dato=myScan.nextLine();
        String q = "SELECT AVG(sum) FROM pizza.ordrer where Dato = \"" + dato +"\";";
        
        statement = connection.createStatement();
        statement.execute(q);
        ResultSet resultSet = statement.executeQuery(q);
        ResultSetMetaData rsmd = resultSet.getMetaData();
        while (resultSet.next()) {
                String columnValue = resultSet.getString(1);
                System.out.print(columnValue + " Gennemsnitspris for den valgte dag");
            }
            System.out.println("");
        }
    
public void LæsStatistikPizzaAntal() throws SQLException, ClassNotFoundException {
        Connection connection = null;
        Statement statement = null;
        //MainController.mainControllerLooop();
        connection = DBConnector.getConnection();
        System.out.println("");
        System.out.println("Antal solgte pizzaer organiseret efter pizzanr:");
        String q = "select PizzaNR, count(*) from odrerinfo group by pizzaNR order by pizzaNR;";
        statement = connection.createStatement();
        statement.execute(q);
        ResultSet resultSet = statement.executeQuery(q);
        ResultSetMetaData rsmd = resultSet.getMetaData();
        while (resultSet.next()) {
                String columnValue1 = resultSet.getString(1); //PizzaNR values
                String columnValue2 = resultSet.getString(2); //Count(*) values
                String text = rsmd.getColumnName(1) + " " + columnValue1 + " Antal: " + columnValue2;
                //System.out.println(columnValue + " hh " + rsmd.getColumnName(2));
                System.out.println(text);
            }
            System.out.println("");
        }
}

    

        


