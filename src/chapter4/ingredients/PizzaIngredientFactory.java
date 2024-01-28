package chapter4.ingredients;

import chapter4.ingredients.cheese.Cheese;
import chapter4.ingredients.clams.Clams;
import chapter4.ingredients.dough.Dough;
import chapter4.ingredients.sauce.Sauce;

public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();
}
