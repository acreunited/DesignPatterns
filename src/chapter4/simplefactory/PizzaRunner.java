package chapter4.simplefactory;

import chapter4.simplefactory.pizzas.PizzasEnum;
import chapter4.simplefactory.store.PizzaStore;
import chapter4.simplefactory.store.SimplePizzaFactory;

/**
 * The type Pizza runner.
 */
public final class PizzaRunner {

    /**
     * Private empty Constructor
     */
    private PizzaRunner() {
        // empty
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza(PizzasEnum.CHEESE);
        pizzaStore.orderPizza(PizzasEnum.PEPPERONI);
    }
}
