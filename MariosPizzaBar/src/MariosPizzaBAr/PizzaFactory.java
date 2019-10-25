package MariosPizzaBAr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Magdalena
 */
public class PizzaFactory {

    /*public PizzaFactory(int number) {
        PizzaPosition(number);
    }*/
    String filename;
    
    public PizzaFactory(String filename) {
        this.filename = filename;
    }

    private int position;
    private String navn;
    private String ingredienser;
    private int pris;

   

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
        // https://www.codespeedy.com/read-a-specific-line-from-a-text-file-in-java/


    public void PizzaPosition(int n) {
        try {
            /*String filename = "Data/Pizzaer.txt";*/
            String line = Files.readAllLines(Paths.get(filename)).get(n);
            String[] myArr = line.split(";");
            this.position = Integer.parseInt(myArr[0]);
            this.navn = myArr[1];
            this.ingredienser = myArr[2];
            this.pris = Integer.parseInt(myArr[3]);
        } catch (IOException ex) {
            System.out.println("Can't find file");
        }
        //return getPosition() + ". " + getNavn() + " (" + getIngredienser() + ")";
    }

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

}
