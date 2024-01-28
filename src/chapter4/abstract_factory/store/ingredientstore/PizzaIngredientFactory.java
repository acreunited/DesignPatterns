package chapter4.abstract_factory.store.ingredientstore;

import chapter4.abstract_factory.ingredients.cheese.Cheese;
import chapter4.abstract_factory.ingredients.clams.Clams;
import chapter4.abstract_factory.ingredients.dough.Dough;
import chapter4.abstract_factory.ingredients.pepperoni.Pepperoni;
import chapter4.abstract_factory.ingredients.sauce.Sauce;
import chapter4.abstract_factory.ingredients.veggies.Veggies;

/**
 * The interface Pizza ingredient factory.
 */
public interface PizzaIngredientFactory {

    /**
     * Create dough
     *
     * @return the dough
     */
    Dough createDough();

    /**
     * Create sauce
     *
     * @return the sauce
     */
    Sauce createSauce();

    /**
     * Create cheese
     *
     * @return the cheese
     */
    Cheese createCheese();

    /**
     * Create veggies
     *
     * @return the veggies [ ]
     */
    Veggies[] createVeggies();

    /**
     * Create pepperoni.
     *
     * @return the pepperoni
     */
    Pepperoni createPepperoni();

    /**
     * Create clams.
     *
     * @return the clams
     */
    Clams createClam();
}
