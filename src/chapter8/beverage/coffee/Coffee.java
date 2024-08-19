package chapter8.beverage.coffee;

import chapter8.beverage.AbstractCaffeineBeverage;

/**
 * The Coffee Beverage
 */
public class Coffee extends AbstractCaffeineBeverage {

    /**
     * Instantiates a new Coffee.
     */
    public Coffee() {
        // empty
    }

    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
