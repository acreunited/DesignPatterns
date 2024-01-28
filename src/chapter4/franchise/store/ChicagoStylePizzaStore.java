package chapter4.franchise.store;

import chapter4.franchise.pizzas.Pizza;
import chapter4.franchise.pizzas.PizzasEnum;
import chapter4.franchise.pizzas.chicago.ChicagoStyleCheesePizza;
import chapter4.franchise.pizzas.chicago.ChicagoStyleClaimPizza;
import chapter4.franchise.pizzas.chicago.ChicagoStylePepperoniPizza;
import chapter4.franchise.pizzas.chicago.ChicagoStyleVeggiePizza;

/**
 * The type Chicago style pizza store.
 */
public class ChicagoStylePizzaStore extends AbstractPizzaStore {

    /**
     * Instantiates a new Chicago style pizza store.
     */
    public ChicagoStylePizzaStore() {
        // empty
    }

    @Override
    public Pizza createPizza(PizzasEnum pizzaType) {
        return switch (pizzaType) {
            case CHEESE -> new ChicagoStyleCheesePizza();
            case PEPPERONI -> new ChicagoStylePepperoniPizza();
            case CLAM -> new ChicagoStyleClaimPizza();
            case VEGGIE -> new ChicagoStyleVeggiePizza();
            default -> throw new IllegalArgumentException("This Pizza does not exist");
        };
    }
}
