package chapter3.beverages.decorators;

import chapter3.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {

    private Beverage beverage;

    @Override
    public abstract String getDescription();
}
