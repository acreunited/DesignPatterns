package chapter3.beverages.decorators;

import chapter3.beverages.drinks.AbstractBeverage;

/**
 * The Soy Condiment
 */
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
        double sizeCost = switch (this.beverage.getSize()) {
            case TALL -> 0.1;
            case GRANDE -> 0.15;
            case VENTI -> 0.2;
        };

        return this.beverage.cost() + sizeCost;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }
}
