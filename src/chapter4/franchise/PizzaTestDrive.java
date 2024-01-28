package chapter4.franchise;

import chapter4.franchise.pizzas.Pizza;
import chapter4.franchise.pizzas.PizzasEnum;
import chapter4.franchise.store.AbstractPizzaStore;
import chapter4.franchise.store.ChicagoStylePizzaStore;
import chapter4.franchise.store.NYStylePizzaStore;

/**
 * The type Pizza runner.
 */
public final class PizzaTestDrive {

    /**
     * Private empty Constructor
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
        AbstractPizzaStore nyStore = new NYStylePizzaStore();
        AbstractPizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza nyChessePizza = nyStore.orderPizza(PizzasEnum.CHEESE);
        System.out.println("Ethan ordered a " + nyChessePizza.getName());

        Pizza chicagoChessePizza = chicagoStore.orderPizza(PizzasEnum.CHEESE);
        System.out.println("Joel ordered a " + chicagoChessePizza.getName());
    }
}
