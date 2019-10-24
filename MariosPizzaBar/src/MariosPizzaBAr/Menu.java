
package MariosPizzaBAr;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu {
    private Ordrer order;
        
        /*int nr;
        String name;
        String ingredientser;
        int pris;*/
    public Menu() {
        
        /*this.nr = get;
        this.name = name;
        this.ingredientser = ingredientser;
        this.pris = pris;*/
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
    public void makePizza(){
        String filename= "Data/Pizzaer.txt";
        File textfile = new File(filename); 
        String line ="";
        try {
            Scanner in = new Scanner(textfile);
            while (in.hasNextLine()){
                line= in.nextLine();
                String[] myArr=line.split(";");
                Pizza tmpPizza= new Pizza(Integer.parseInt(myArr[0]), myArr[1], myArr[2], Integer.parseInt(myArr[3]));
                order.addPizza(tmpPizza);  
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Can't find file");;
        }
    }
}