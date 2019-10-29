package MariosPizzaBAr;

//@Cathrine, Vibeke, Matti og Magdalena
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {
        
       
    public Menu() {
    }
    
    //Læser filen "Pizzaer" som er menukortet til restauranten og udskriver det.
    public void readFiles() throws FileNotFoundException{
     String filename= "Data/Pizzaer.txt";
                File textfile = new File(filename); 
                Scanner in = new Scanner(textfile);
                  
                while(in.hasNextLine()){  
                    String line = in.nextLine();
                    System.out.println(line);
                    
                }
                in.close();   
    }
    
}