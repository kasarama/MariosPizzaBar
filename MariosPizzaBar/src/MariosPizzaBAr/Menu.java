package MariosPizzaBAr;

//@Cathrine, Vibeke, Matti og Magdalena
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {
        
       
    public Menu() {
    }
    
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
    
    public void readArkiv() throws FileNotFoundException{
     String filename= "Arkiv.txt";
                File textfile = new File(filename); 
                Scanner in = new Scanner(textfile);
                  
                while(in.hasNextLine()){  
                    String line = in.nextLine();
                    System.out.println(line);
                    
                }
                in.close();   
    }
    // https://www.codespeedy.com/read-a-specific-line-from-a-text-file-in-java/
    
    
}