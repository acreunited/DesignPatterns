package chapter4.abstract_factory.store.pizzastore;

import chapter4.abstract_factory.pizzas.AbstractPizza;
import chapter4.abstract_factory.pizzas.PizzasEnum;

/**
 * The Pizza store where the client can order pizzas
 */
public abstract class AbstractPizzaStore {

    /**
     * Instantiates a new Abstract pizza store.
     */
    AbstractPizzaStore() {
        // empty
    }

    /**
     * Makes a pizza using Factory
     *
     * @param pizzaType the tpe of the Pizza we want
     * @return the abstract pizza
     */
    public AbstractPizza orderPizza(PizzasEnum pizzaType) {
        AbstractPizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * Creates a Pizza
     *
     * @param pizzaType the type of the Pizza
     * @return the correct Pizza instance
     */
    abstract AbstractPizza createPizza(PizzasEnum pizzaType);
}
