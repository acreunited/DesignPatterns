package chapter3.beverages.drinks;

/**
 * The Espresso beverage
 */
public class Espresso extends AbstractBeverage {

    /**
     * The constructor
     */
    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
