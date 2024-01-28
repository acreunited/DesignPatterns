package chapter4.franchise.pizzas;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract Pizza class
 * Contains methods that can be overridden
 */
public class Pizza {

    /**
     * The name of the Pizza
     */
    private final String name;

    /**
     * The Dough
     */
    protected String dough;

    /**
     * The sauce
     */
    protected String sauce;

    /**
     * The toppings of the Pizza
     */
    protected List<String> toppings = new ArrayList<>();

    /**
     * Instantiates a new Abstract pizza.
     *
     * @param pizzaType the pizza type
     */
    protected Pizza(PizzasEnum pizzaType) {
        this.name = pizzaType.name();
    }

    /**
     * Prepares the Pizza
     */
    public void prepare() {
        System.out.println("Preparing " + this.name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String s : this.toppings) {
            System.out.println(s);
        }
    }

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
