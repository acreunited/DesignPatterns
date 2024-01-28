package chapter4.franchise.pizzas.newyork;

import chapter4.franchise.pizzas.Pizza;
import chapter4.franchise.pizzas.PizzasEnum;

/**
 * The type Cheese pizza.
 */
public class NYStyleCheesePizza extends Pizza {

    /**
     * Instantiates a new Cheese pizza.
     */
    public NYStyleCheesePizza() {
        super(PizzasEnum.CHEESE);
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara Sauce";
        this.toppings.add("Grated Reggiano Cheese");
    }
}
