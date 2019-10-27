package MariosPizzaBAr;

//import java.io.File;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
//import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/*
??
PizzaFactory craver filename som ikke bliver brugt senere - enten springer vi
det over eller giver vi bruger en mulighed for at læse menu fra en anden file 
*/


public class PizzaFactory {

    String filename;

    public PizzaFactory(String filename) {
        this.filename = filename;
    }

    private int position;
    private String navn;
    private String ingredienser;
    private int pris;

    // https://www.codespeedy.com/read-a-specific-line-from-a-text-file-in-java/
    public String toString() {
        return getPosition() + "." + getNavn() + " (" + getIngredienser() + " )";
    }

    public Pizza getPizzaByPosition(int n) {
        Pizza pizza = null;
        try {
            String filename = "Data/Pizzaer.txt";
            String line = Files.readAllLines(Paths.get(filename)).get(n);
            String[] myArr = line.split(";");
            this.position = Integer.parseInt(myArr[0]);
            this.navn = myArr[1];
            this.ingredienser = myArr[2];
            this.pris = Integer.parseInt(myArr[3]);
            pizza = new Pizza(Integer.parseInt(myArr[0]), myArr[1], myArr[2], Integer.parseInt(myArr[3]));
        } catch (IOException ex) {
            System.out.println("Can't find file");
        }
        return pizza;
    }

    public int getPosition() {
        return position;
    }

    public String getNavn() {
        return navn;
    }

    public String getIngredienser() {
        return ingredienser;
    }

    public int getPris() {
        return pris;
    }

}
