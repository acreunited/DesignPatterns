package chapter4.abstract_factory.store.ingredientstore;

import chapter4.abstract_factory.ingredients.cheese.Cheese;
import chapter4.abstract_factory.ingredients.cheese.ReggianoCheese;
import chapter4.abstract_factory.ingredients.clams.Clams;
import chapter4.abstract_factory.ingredients.clams.FreshClams;
import chapter4.abstract_factory.ingredients.dough.Dough;
import chapter4.abstract_factory.ingredients.dough.ThinCrustDough;
import chapter4.abstract_factory.ingredients.pepperoni.Pepperoni;
import chapter4.abstract_factory.ingredients.pepperoni.SlicedPepperoni;
import chapter4.abstract_factory.ingredients.sauce.MarinaraSauce;
import chapter4.abstract_factory.ingredients.sauce.Sauce;
import chapter4.abstract_factory.ingredients.veggies.Garlic;
import chapter4.abstract_factory.ingredients.veggies.Mushroom;
import chapter4.abstract_factory.ingredients.veggies.Onion;
import chapter4.abstract_factory.ingredients.veggies.RedPepper;
import chapter4.abstract_factory.ingredients.veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
