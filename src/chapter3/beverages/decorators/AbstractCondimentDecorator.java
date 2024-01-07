package chapter3.beverages.decorators;

import chapter3.beverages.drinks.AbstractBeverage;

/**
 * So we can implement the Decorators
 */
public abstract class AbstractCondimentDecorator extends AbstractBeverage {

    /**
     * The Beverage.
     */
    AbstractBeverage beverage;

    /**
     * Empty Constructor
     */
    AbstractCondimentDecorator() {
        // empty
    }

    public abstract String getDescription();
}
