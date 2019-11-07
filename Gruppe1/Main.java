/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;
import movies.Controller.MainController;
import movies.Util.DBConnector;
import java.sql.*;

/**
 *
 * @author thor
 */
public class Main {
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Statement statement = null;
		//MainController.mainControllerLooop();
		connection = DBConnector.getConnection();
		String q = "Select * from movies";
		statement = connection.createStatement();
		statement.execute(q);
		ResultSet resultSet = statement.executeQuery("SELECT * from movies");

                ResultSetMetaData rsmd = resultSet.getMetaData();
int columnsNumber = rsmd.getColumnCount();
while (resultSet.next()) {
    for (int i = 1; i <= columnsNumber; i++) {
        if (i > 1) System.out.print(",  ");
        String columnValue = resultSet.getString(i);
        System.out.print(columnValue + " " + rsmd.getColumnName(i));
    }
    System.out.println("");
}
	}
	
}
