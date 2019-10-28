package MariosPizzaBAr;
//@Cathrine, Vibeke, Matti og Magdalena

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

    public String toString() {
        return getPosition() + "." + getNavn() + " (" + getIngredienser() + " )";

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
        return this.pris;
    }
}
