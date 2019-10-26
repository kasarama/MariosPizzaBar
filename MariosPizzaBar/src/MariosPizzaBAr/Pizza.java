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
    public int getPris() {
        return this.pris;
    }

     public String toString() {
        return getPosition() + "." + getNavn() + " (" + getIngredienser();
        
    }
}
