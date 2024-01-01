package chapter3.beverages.decorators;

import chapter3.beverages.drinks.AbstractBeverage;

public class Soy extends AbstractCondimentDecorator {

    /**
     * The constructor
     *
     * @param beverage the beverage
     */
    public Soy(AbstractBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.15;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }
}
