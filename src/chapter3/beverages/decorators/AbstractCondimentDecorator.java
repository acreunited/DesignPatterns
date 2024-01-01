package chapter3.beverages.decorators;

import chapter3.beverages.drinks.AbstractBeverage;

public abstract class AbstractCondimentDecorator extends AbstractBeverage {

    protected AbstractBeverage beverage;

    public abstract String getDescription();
}
