
package MariosPizzaBAr;

public class Pizza {
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
    
    
}
