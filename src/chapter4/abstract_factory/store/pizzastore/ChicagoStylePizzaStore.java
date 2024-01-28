package chapter4.abstract_factory.store.pizzastore;

import chapter4.abstract_factory.pizzas.AbstractPizza;
import chapter4.abstract_factory.pizzas.CheesePizza;
import chapter4.abstract_factory.pizzas.ClamPizza;
import chapter4.abstract_factory.pizzas.PizzasEnum;
import chapter4.abstract_factory.store.ingredientstore.ChicagoPizzaIngredientFactory;
import chapter4.abstract_factory.store.ingredientstore.PizzaIngredientFactory;

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
    public AbstractPizza createPizza(PizzasEnum pizzaType) {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        return switch (pizzaType) {
            case CHEESE -> new CheesePizza(ingredientFactory);
            case CLAM -> new ClamPizza(ingredientFactory);
            case PEPPERONI, VEGGIE -> throw new UnsupportedOperationException("Not implemented yet");
            default -> throw new IllegalArgumentException("This Pizza does not exist");
        };
    }
}
