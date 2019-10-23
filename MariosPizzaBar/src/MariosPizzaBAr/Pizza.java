
package MariosPizzaBAr;

public class Pizza {
    private int position;
    private String pizzaNavn;
    private String ingredeienser;
    private int pizzaPrice;

    public Pizza(int position, String pizzaNavn, String ingredeienser, int pizzaPrice) {
        this.position = position;
        this.pizzaNavn = pizzaNavn;
        this.ingredeienser = ingredeienser;
        this.pizzaPrice = pizzaPrice;
    }

    public int getPosition() {
        return position;
    }

    public String getPizzaNavn() {
        return pizzaNavn;
    }

    public String getIngredeienser() {
        return ingredeienser;
    }

    public int getPizzaPrice() {
        return pizzaPrice;
    }
    
    
}
