package chapter3.beverages.decorators;

import chapter3.beverages.drinks.AbstractBeverage;

/**
 * The Mocha Condiment
 */
public class Mocha extends AbstractCondimentDecorator {

    /**
     * The constructor
     *
     * @param beverage the beverage
     */
    public Mocha(AbstractBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.2;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }
}
