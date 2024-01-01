package chapter3.beverages.decorators;

public class Whip extends CondimentDecorator {

    @Override
    public float cost() {
        return 0;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
