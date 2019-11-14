package MariosPizzaBAr.ArchiveFiles;

import MariosPizzaBAr.Model.Order;
import MariosPizzaBAr.Factory.OrderFactory;
import MariosPizzaBAr.Util.DBConnector;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Calendar;
import java.util.Scanner;

public class Archive {

    Calendar calendar = Calendar.getInstance();
    private String fileNameForTXT = "Data/Arkiv.txt";//New !!!!
    private File fileNameForHTML = new File("Data/ArkivHTML.html"); //New !!!!
    private File fileNameForEcxel = new File("Data/ArkivExcel.xlsx"); //New !!!
    OrderFactory oF = new OrderFactory();
    ArrayList<String> pickUpDates = new ArrayList();//NEW !!
    //Order o = new Order();
  

    public Archive() {
    }

    //Viser arkiv-fil
    public void showArchive() {
        //String fileName = "Data/Arkiv.txt";

        File txtFile = new File(fileNameForTXT);

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
        String query = "SELECT * FROM MarioDB.ordrer";
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
        
    }

    //Sender ordre til arkiv
    public void sendToArkiv(Order o) {
        //File f = new File("Data/Arkiv.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileNameForTXT, true))) {

            bw.write(o.toString());
            bw.write("\n");

            bw.close();
        } catch (IOException ex) {
            System.out.println("Fejl: Kan ikke tilføje til fil!");
        }
    }
    //https://www.codespeedy.com/read-a-specific-line-from-a-text-file-in-java/

}
