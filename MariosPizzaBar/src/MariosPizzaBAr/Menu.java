package MariosPizzaBAr;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {
    //private Ordrer order;
        
       
    public Menu() {
        
        /*public static void makePizza(){
        String filename= "Data/Pizzaer.docx";
        File textfile = new File(filename); 
        String line ="";
        try {
            Scanner in = new Scanner(textfile);
            while (in.hasNextLine()){
                line= in.nextLine();
                String[] myArr=line.split(";");
                Pizza tmpPizza= new Pizza(Integer.parseInt(myArr[0]), myArr[1], myArr[2], Integer.parseInt(myArr[3]));
                 
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Can't find file");
        }*/
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
    
    //Læser filen "Arkiv" som indeholder alle skabte ordrer i programmet og udskriver det.
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