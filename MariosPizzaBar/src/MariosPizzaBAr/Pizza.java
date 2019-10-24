
package MariosPizzaBAr;

public class Pizza {
    private int position;
    private String pizzaNavn;
    private String ingredientser;
    private int pizzaPrice;

    public Pizza(int position, String pizzaNavn, String ingredientser, int pizzaPrice) {
        this.position = position;
        this.pizzaNavn = pizzaNavn;
        this.ingredientser = ingredientser;
        this.pizzaPrice = pizzaPrice;
    }

    public int getPosition() {
        return position;
    }

    public String getPizzaNavn() {
        return pizzaNavn;
    }

    public String getIngredientser() {
        return ingredientser;
    }

    public int getPizzaPrice() {
        return pizzaPrice;
    }
    
    
}
