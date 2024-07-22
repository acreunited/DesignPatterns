package chapter8.beverage.tea;

import chapter8.beverage.CaffeineBeverage;

/**
 * The Tea Beverage
 */
public class Tea extends CaffeineBeverage {

    /**
     * Instantiates a new Tea.
     */
    public Tea() {
        // empty
    }

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
