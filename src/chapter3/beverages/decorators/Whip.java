package chapter3.beverages.decorators;

import chapter3.beverages.drinks.AbstractBeverage;

public class Whip extends AbstractCondimentDecorator {

    /**
     * The constructor
     *
     * @param beverage the beverage
     */
    public Whip(AbstractBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.1;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }
}
