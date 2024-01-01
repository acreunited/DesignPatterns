package chapter3.beverages;

public abstract class Beverage {

    private String description;

    public abstract float cost();

    public String getDescription() {
        return this.description; //TODO
    }
}
