package chapter4.abstract_factory.pizzas;

import chapter4.abstract_factory.ingredients.cheese.Cheese;
import chapter4.abstract_factory.ingredients.clams.Clams;
import chapter4.abstract_factory.ingredients.dough.Dough;
import chapter4.abstract_factory.ingredients.pepperoni.Pepperoni;
import chapter4.abstract_factory.ingredients.sauce.Sauce;
import chapter4.abstract_factory.ingredients.veggies.Veggies;

/**
 * Abstract Pizza class
 * Contains methods that can be overridden
 */
public abstract class AbstractPizza {

    /**
     * The name of the Pizza
     */
    protected String name;

    /**
     * The Dough
     */
    protected Dough dough;

    /**
     * The sauce
     */
    protected Sauce sauce;

    protected Veggies[] veggies;

    protected Cheese cheese;

    protected Pepperoni pepperoni;

    protected Clams clam;

    /**
     * Prepares the Pizza
     */
    public abstract void prepare();

    /**
     * Bakes the Pizza
     */
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    /**
     * Cuts the Pizza
     */
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    /**
     * Boxes the Pizza
     */
    public void box() {
        System.out.println("Place pizza in official Pizza Store box");
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

}
