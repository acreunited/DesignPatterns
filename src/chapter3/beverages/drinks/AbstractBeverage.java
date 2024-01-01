package chapter3.beverages.drinks;

import chapter3.beverages.enums.SizeEnum;

/**
 * The superclass Beverage
 */
public abstract class AbstractBeverage {

    /**
     * The Description.
     */
    String description = "Unknown Beverage";

    /**
     * The Size.
     */
    SizeEnum size = SizeEnum.TALL;

    /**
     * Empty Constructor
     */
    protected AbstractBeverage() {
        // empty
    }

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
        return this.description;
    }

    /**
     * Gets size.
     *
     * @return the size
     */
    public SizeEnum getSize() {
        return this.size;
    }

    /**
     * Sets size.
     *
     * @param size the size
     */
    public void setSize(SizeEnum size) {
        this.size = size;
    }
}
