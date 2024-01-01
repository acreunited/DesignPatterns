package chapter3.beverages.drinks;

public abstract class AbstractBeverage {

    String description = "Unknown Beverage";

    public abstract double cost();

    public String getDescription() {
        return this.description; //TODO
    }
}
