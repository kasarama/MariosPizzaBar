package MariosPizzaBAr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Pizza {

    private int position;
    private String navn;
    private String ingredienser;
    private int pris;

    public Pizza(int position, String navn, String ingredienser, int pris) {
        this.position = position;
        this.navn = navn;
        this.ingredienser = ingredienser;
        this.pris = pris;
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

    
    // https://www.codespeedy.com/read-a-specific-line-from-a-text-file-in-java/

    public void PizzaPosition(int n) {
        try {
            String filename = "Data/Pizzaer.txt";
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

    public int getPris() {
        return this.pris;
    }
    
    public String toString() {
        return getPosition() + "." + getNavn() + " (" + getIngredienser() + " )" + getPris();
    }
    
}