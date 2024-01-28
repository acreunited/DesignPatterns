package chapter4.abstract_factory.store.pizzastore;

import chapter4.abstract_factory.pizzas.AbstractPizza;
import chapter4.abstract_factory.pizzas.CheesePizza;
import chapter4.abstract_factory.pizzas.ClamPizza;
import chapter4.abstract_factory.pizzas.PizzasEnum;
import chapter4.abstract_factory.store.ingredientstore.NYPizzaIngredientFactory;
import chapter4.abstract_factory.store.ingredientstore.PizzaIngredientFactory;

/**
 * The type Ny style pizza store.
 */
public class NYStylePizzaStore extends AbstractPizzaStore {

    /**
     * Instantiates a new Ny style pizza store.
     */
    public NYStylePizzaStore() {
        // empty
    }

    @Override
    public AbstractPizza createPizza(PizzasEnum pizzaType) {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        return switch (pizzaType) {
            case CHEESE -> new CheesePizza(ingredientFactory);
            case CLAM -> new ClamPizza(ingredientFactory);
            case PEPPERONI, VEGGIE -> throw new UnsupportedOperationException("Not implemented yet");
            default -> throw new IllegalArgumentException("This Pizza does not exist");
        };
    }
}
