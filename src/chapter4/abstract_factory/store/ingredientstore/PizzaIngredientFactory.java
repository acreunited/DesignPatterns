package chapter4.abstract_factory.store.ingredientstore;

import chapter4.abstract_factory.ingredients.cheese.Cheese;
import chapter4.abstract_factory.ingredients.clams.Clams;
import chapter4.abstract_factory.ingredients.dough.Dough;
import chapter4.abstract_factory.ingredients.pepperoni.Pepperoni;
import chapter4.abstract_factory.ingredients.sauce.Sauce;
import chapter4.abstract_factory.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();
}
