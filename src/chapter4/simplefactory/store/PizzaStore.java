package chapter4.simplefactory.store;

import chapter4.simplefactory.pizzas.Pizza;
import chapter4.simplefactory.pizzas.PizzasEnum;

/**
 * The Pizza store where the client can order pizzas
 */
public class PizzaStore {

    /**
     * The factory
     */
    private final SimplePizzaFactory factory;

    /**
     * Instantiates a new Pizza store.
     *
     * @param factory the factory
     */
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    /**
     * Makes a pizza using Factory
     *
     * @param pizzaType the tpe of the Pizza we want
     */
    public void orderPizza(PizzasEnum pizzaType) {
        Pizza pizza = this.factory.createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
