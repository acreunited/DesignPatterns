package chapter4.franchise.store;

import chapter4.franchise.pizzas.Pizza;
import chapter4.franchise.pizzas.PizzasEnum;

/**
 * The Pizza store where the client can order pizzas
 */
public abstract class AbstractPizzaStore {

    /**
     * Makes a pizza using Factory
     *
     * @param pizzaType the tpe of the Pizza we want
     */
    public Pizza orderPizza(PizzasEnum pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(PizzasEnum pizzaType);
}
