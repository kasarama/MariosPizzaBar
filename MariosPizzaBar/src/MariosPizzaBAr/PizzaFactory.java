package MariosPizzaBAr;

//@Cathrine, Vibeke, Matti og Magdalena
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PizzaFactory {

    String filename;
    private int position;
    private String navn;
    private String ingredienser;
    private int pris;

    public PizzaFactory() {
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
            System.out.println("Fejl - kan ikke finde " + filename);
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
