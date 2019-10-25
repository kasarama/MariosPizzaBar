package MariosPizzaBAr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Pizza {

    public Pizza(int number) {
        PizzaPosition(number);
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

    public String toString() {
        return getPosition() + "." + getNavn() + " (" + getIngredienser() + " )";
    }

    /*
    private int position;
    private String pizzaNavn;
    private String ingredienser;
    private int pizzaPrice;

    public Pizza(int position, String pizzaNavn, String ingredienser, int pizzaPrice) {
        this.position = position;
        this.pizzaNavn = pizzaNavn;
        this.ingredienser = ingredienser;
        this.pizzaPrice = pizzaPrice;
    }
    
    

    public int getPosition() {
        return position;
    }

    public String getPizzaNavn() {
        return pizzaNavn;
    }

    public String getIngredientser() {
        return ingredienser;
    }

    public int getPizzaPrice() {
        return pizzaPrice;
    }

    @Override
    public String toString() {
        return "Pizza{" + "position = " + position + ", pizzaNavn = " + pizzaNavn + ", ingredienser = " + ingredienser + '}';
    }
    
     */
}
