package MariosPizzaBAr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class Archive {

    Calendar calendar = Calendar.getInstance();

    public Archive() {
    }

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
            System.out.println("Fejl - kan ikke finde arkiv-fil");;
        }

    }

    public void sendToArkiv(Order o) {
        File f = new File("Data/Arkiv.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f, true))) {

            bw.write(o.toString());
            bw.write("\n");
            bw.close();
        } catch (IOException ex) {
            System.out.println("Error: Kan ikke tilføje til fil");
        }
    }
    //https://www.codespeedy.com/read-a-specific-line-from-a-text-file-in-java/
}
