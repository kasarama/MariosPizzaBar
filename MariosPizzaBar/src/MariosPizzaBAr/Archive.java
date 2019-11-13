package MariosPizzaBAr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Scanner;

public class Archive {

    Calendar calendar = Calendar.getInstance();

    public Archive() {
    }

    //Viser arkiv-fil
    public void showArchive() {
        String fileName = "Data/Arkiv.txt";

        File txtFile = new File(fileName);

        Scanner in;
        try {
            in = new Scanner(txtFile);
            int count = 1;
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
                count++;
            }
            in.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fejl - kan ikke finde arkiv-fil!");;
        }

    }
    
    //Viser database arkiv
    public void showDBArchive() throws ClassNotFoundException, SQLException {
        
        Connection myConnection = null;
        myConnection = DBConnector.getConnection();
        Statement statement = null;
        ResultSet resultSet = null;
        String query = "SELECT * FROM marioDB.ordrer";
        statement = myConnection.createStatement();
        resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            int idOrdrer = resultSet.getInt("idOrdrer");
            String tid = resultSet.getString("Tid");
            String dato = resultSet.getString("Dato");
            int sum = resultSet.getInt("Sum");
            System.out.println("Order ID: \t"+idOrdrer + "\nAfh. tid: \t" + tid + "\nDato: \t\t" + dato + "\nSum: \t\t" + sum + "\n" );
        }
        



        /*lukker efter mig*/
        resultSet.close();
        statement.close();
        myConnection.close();
        
        
        /*
        Connection connection = null;
        Statement statement = null;
        //MainController.mainControllerLooop();
        connection = DBConnector.getConnection();
        String q = "Select * from pizza.ordrer";
        statement = connection.createStatement();
        statement.execute(q);
        ResultSet resultSet = statement.executeQuery(q);

        ResultSetMetaData rsmd = resultSet.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        while (resultSet.next()) {
            for (int i = 1; i <= columnsNumber; i++) {
                if (i > 1) {
                    System.out.print(",  ");
                }
                String columnValue = resultSet.getString(i);
                System.out.print(columnValue + " " + rsmd.getColumnName(i));
            }
            System.out.println("");
        }
*/
    }

    //Sender ordre til arkiv
    public void sendToArkiv(Order o) {
        File f = new File("Data/Arkiv.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f, true))) {

            bw.write(o.toString());
            bw.write("\n");
            bw.close();
        } catch (IOException ex) {
            System.out.println("Fejl: Kan ikke tilføje til fil!");
        }
    }
    //https://www.codespeedy.com/read-a-specific-line-from-a-text-file-in-java/
}
