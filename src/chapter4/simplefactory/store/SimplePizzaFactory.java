package chapter4.simplefactory.store;

import chapter4.simplefactory.pizzas.CheesePizza;
import chapter4.simplefactory.pizzas.ClaimPizza;
import chapter4.simplefactory.pizzas.PepperoniPizza;
import chapter4.simplefactory.pizzas.Pizza;
import chapter4.simplefactory.pizzas.PizzasEnum;
import chapter4.simplefactory.pizzas.VeggiePizza;

/**
 * Simple Factory that returns the correct Pizza
 */
public class SimplePizzaFactory {

    /**
     * Empty Constructor
     */
    public SimplePizzaFactory() {
        // empty
    }

    /**
     * Creates the correct Pizza
     *
     * @param pizzaType the pizza type
     * @return the correct pizza
     */
    Pizza createPizza(PizzasEnum pizzaType) {
        return switch (pizzaType) {
            case CHEESE -> new CheesePizza();
            case PEPPERONI -> new PepperoniPizza();
            case CLAM -> new ClaimPizza();
            case VEGGIE -> new VeggiePizza();
            default -> throw new IllegalArgumentException("This Pizza does not exist");
        };
    }
}
