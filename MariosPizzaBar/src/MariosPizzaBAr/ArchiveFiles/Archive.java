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
import java.sql.ResultSetMetaData;
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

   /* public void createHTMLFile() { //NEW !!! HELE METODEN !!!

        try {
            fileNameForHTML.createNewFile();
        } catch (IOException ex) {
            System.out.println(fileNameForHTML + " kan ikke blive oprettet");;
        }
    }

    public void writeToHTMLFile() { //NEW !!! HELE METODEN !!! DUER IKKE ENDU !!!
        String date = oF.pickUpDate();
        /*While ()*/
        
       /* try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileNameForHTML))) {

            bw.write("<!doctype html> \n"
                    + "<html>\n"
                    + "<head>\n"
                    + "<script src=\"https://cdn.jsdelivr.net/npm/chart.js@2.9.1/dist/Chart.min.js\"></script>"
                    + "<title>MarioPizzabar - Statestik</title>\n"
                    + "</head>\n"
                    + "<body>\n"
                    + "<div style='text-align:center'><h1>Marios Pizzabar</h1>\n"
                    + "<h2>- Statestik</h2></div>\n"
                    + "<canvas id=\"myChart\" width=\"400\" height=\"400\"></canvas>\n"
                    + "<script>\n"
                    + "var ctx = document.getElementById('myChart').getContext('2d');\n"
                    + "var myChart = new Chart(ctx, {\n"
                    + "    type: 'bar',\n"
                    + "    data: {\n"
                    + "        labels: ['Pizza1', 'Pizza2', 'Pizza3', 'Pizza4', 'Pizza5', 'Pizza6', 'Pizza7'],\n"
                    + "        datasets: [{\n"
                    + "            label: 'Antal købte pizzaer',\n"
                    + "            data: [12, 19, 3, 5, 2, 3, 2],\n"
                    + "            backgroundColor: [\n"
                    + "                'rgba(255, 99, 132, 0.2)',\n"
                    + "                'rgba(54, 162, 235, 0.2)',\n"
                    + "                'rgba(255, 206, 86, 0.2)',\n"
                    + "                'rgba(75, 192, 192, 0.2)',\n"
                    + "                'rgba(153, 102, 255, 0.2)',\n"
                    + "                'rgba(255, 159, 64, 0.2)'\n"
                    + "            ],\n"
                    + "            borderColor: [\n"
                    + "                'rgba(255, 99, 132, 1)',\n"
                    + "                'rgba(54, 162, 235, 1)',\n"
                    + "                'rgba(255, 206, 86, 1)',\n"
                    + "                'rgba(75, 192, 192, 1)',\n"
                    + "                'rgba(153, 102, 255, 1)',\n"
                    + "                'rgba(255, 159, 64, 1)'\n"
                    + "            ],\n"
                    + "            borderWidth: 1\n"
                    + "        }]\n"
                    + "    },\n"
                    + "    options: {\n"
                    + "        scales: {\n"
                    + "            yAxes: [{\n"
                    + "                ticks: {\n"
                    + "                    beginAtZero: true\n"
                    + "                }\n"
                    + "            }]\n"
                    + "        }\n"
                    + "    }\n"
                    + "});\n"
                    + "</script>\n"
                    + "</body>\n"
                    + "</html>\n"
            );

            bw.close();
        } catch (IOException ex) {
            System.out.println("Fejl: Kan ikke tilføje til HTML-fil!");
        }
    }*/

}
