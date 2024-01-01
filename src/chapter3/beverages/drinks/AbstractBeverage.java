package chapter3.beverages.drinks;

/**
 * The superclass Beverage
 */
public abstract class AbstractBeverage {

    /**
     * The Description.
     */
    String description = "Unknown Beverage";

    /**
     * Retrieves the cost of the Beverage.
     *
     * @return the double
     */
    public abstract double cost();

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return this.description; //TODO
    }
}
