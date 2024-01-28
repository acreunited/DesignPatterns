package chapter4.abstract_factory.store.ingredientstore;

import chapter4.abstract_factory.ingredients.cheese.Cheese;
import chapter4.abstract_factory.ingredients.cheese.MozzarellaCheese;
import chapter4.abstract_factory.ingredients.clams.Clams;
import chapter4.abstract_factory.ingredients.clams.FrozenClams;
import chapter4.abstract_factory.ingredients.dough.Dough;
import chapter4.abstract_factory.ingredients.dough.ThickCrustDough;
import chapter4.abstract_factory.ingredients.pepperoni.Pepperoni;
import chapter4.abstract_factory.ingredients.pepperoni.SlicedPepperoni;
import chapter4.abstract_factory.ingredients.sauce.PlumTomatoSauce;
import chapter4.abstract_factory.ingredients.sauce.Sauce;
import chapter4.abstract_factory.ingredients.veggies.BlackOlives;
import chapter4.abstract_factory.ingredients.veggies.EggPlant;
import chapter4.abstract_factory.ingredients.veggies.Spinach;
import chapter4.abstract_factory.ingredients.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new BlackOlives(), new EggPlant(), new Spinach()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
