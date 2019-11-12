package MariosPizzaBAr;

//@Cathrine, Vibeke, Matti og Magdalena
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;

public class PizzaFactory {

    String filename;
    private int position;
    private String navn;
    private String ingredienser;
    private int pris;

    public PizzaFactory() {
    }

    /*Initialiserer et "tom" pizza objekt. 
    Læser menufilen "Pizzaer" og opdeler informationerne i forskellige variabler.
    Her bliver menunummer og pris også lavet om til integers.
    Til sidst bliver et nyt pizza objekt instantieret med informationer fra filen
    Metoden returnerer også den skabte pizza.*/
    public Pizza getPizzaByPosition(int n) {
        Pizza pizza = null;
        try {
            String fileame = "Data/Pizzaer.txt";
            String line = Files.readAllLines(Paths.get(filename)).get(n);
            String[] myArr = line.split(";");
            this.position = Integer.parseInt(myArr[0]);
            this.navn = myArr[1];
            this.ingredienser = myArr[2];
            this.pris = Integer.parseInt(myArr[3]);
            pizza = new Pizza(Integer.parseInt(myArr[0]), myArr[1], myArr[2], Integer.parseInt(myArr[3]));
        } catch (IOException ex) {
            System.out.println("Fejl - kan ikke finde " + filename);
        }
        return pizza;
    }


<<<<<<< HEAD
    public Pizza GetPizzaByID(int id) throws SQLException, ClassNotFoundException {
=======
    public static Pizza GetPizzaByID(int id) throws SQLException, ClassNotFoundException {
>>>>>>> 6491cb4b0e5154588f7de78a48033f27a969d690
        Pizza retValPizza = null;
        String query = "SELECT * FROM pizzaer WHERE NR = ?";
        Connection myConnector = null;
        PreparedStatement pstmt = null;
        //Statement pstmt = null;
        ResultSet resultSet = null;
        myConnector = DBConnector.getConnection();

        pstmt = myConnector.prepareStatement(query);
        pstmt.setInt(1, id);
        resultSet = pstmt.executeQuery();

        while (resultSet.next()) {
            int nr = resultSet.getInt("NR");
            String navn = resultSet.getString("Navn");
            String ingredienser = resultSet.getString("Ingredienser");
            int pris = resultSet.getInt("Pris");
            retValPizza = new Pizza(nr, navn, ingredienser, pris);
        }
        resultSet.close();
        pstmt.close();
        myConnector.close();

        return retValPizza;
    }

}
