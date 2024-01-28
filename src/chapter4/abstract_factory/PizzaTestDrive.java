package chapter4.abstract_factory;

import chapter4.abstract_factory.pizzas.PizzasEnum;
import chapter4.abstract_factory.store.pizzastore.AbstractPizzaStore;
import chapter4.abstract_factory.store.pizzastore.NYStylePizzaStore;

/**
 * The type Pizza test drive.
 */
public final class PizzaTestDrive {

    /**
     * Private empty constructor
     */
    private PizzaTestDrive() {
        // empty
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        AbstractPizzaStore pizzaStore = new NYStylePizzaStore();
        pizzaStore.orderPizza(PizzasEnum.CHEESE);
    }
}
