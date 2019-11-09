package MariosPizzaBAr;

//@Cathrine, Vibeke, Matti og Magdalena

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class Menu {
        
       
    public Menu() {
    }
    
    //Læser filen "Pizzaer" som er menukortet til restauranten og udskriver det.
    public void readFiles() throws SQLException{
      
		Connection connection = null;
		Statement statement = null;
		//MainController.mainControllerLooop();
		connection = DBConnector.getConnection();
		String q = "Select * from pizzaer";
		statement = connection.createStatement();
		statement.execute(q);
		ResultSet resultSet = statement.executeQuery("SELECT * from pizzaer");

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
    

