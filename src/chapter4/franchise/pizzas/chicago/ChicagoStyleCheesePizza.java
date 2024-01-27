package chapter4.franchise.pizzas.chicago;

import chapter4.franchise.pizzas.Pizza;
import chapter4.franchise.pizzas.PizzasEnum;

/**
 * The type Cheese pizza.
 */
public class ChicagoStyleCheesePizza extends Pizza {

    /**
     * Instantiates a new Cheese pizza.
     */
    public ChicagoStyleCheesePizza() {
        super(PizzasEnum.CHEESE);
        this.dough = "Extra Thick Crust Dough";
        this.sauce = "Plum Tomato sauce";
        this.toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
