package MariosPizzaBAr;

//@Cathrine, Vibeke, Matti og Magdalena
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Menu {

    public Menu() {
    }

    //Læser filen "Pizzaer" som er menukortet til restauranten og udskriver det.
    public void readFiles() throws SQLException, ClassNotFoundException {


        
        Connection myConnection = null;
        myConnection = DBConnector.getConnection();
        Statement statement = null;
        ResultSet resultSet = null;
        String query = "SELECT * FROM marioDB.pizzaer";
        statement = myConnection.createStatement();
        resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            int nr = resultSet.getInt("NR");
            String navn = resultSet.getString("Navn");
            String ingredienser = resultSet.getString("Ingredienser");
            int pris = resultSet.getInt("Pris");
            System.out.println(nr + ". " + navn + " (" + ingredienser + "), pris: " + pris + " kr.");
        }

        /*lukker efter mig*/
        resultSet.close();
        statement.close();
        myConnection.close();
        
        
    }

    
}
