package chapter4.simplefactory.pizzas;

/**
 * Abstract Pizza class
 * Contains methods that can be overridden
 */
public abstract class AbstractPizza {

    /**
     * The name of the Pizza
     */
    private final String name;

    AbstractPizza(PizzasEnum pizzaType) {
        this.name = pizzaType.name();
    }

    /**
     * Prepares the Pizza
     */
    public void prepare() {
        System.out.println("Preparing " + this.name);
    }

    /**
     * Bakes the Pizza
     */
    public void bake() {
        System.out.println("Baking " + this.name);
    }

    /**
     * Cuts the Pizza
     */
    public void cut() {
        System.out.println("Cutting " + this.name);
    }

    /**
     * Boxes the Pizza
     */
    public void box() {
        System.out.println("Boxing " + this.name);
    }
}
