package chapter1.ducks;

import chapter1.ducks.behaviours.fly.FlyBehavior;
import chapter1.ducks.behaviours.quack.QuackBehavior;

public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    /**
     * Empty constructor
     * <p>
     * Subclasses must instantiate the Behaviors
     */
    public Duck() {
        // empty
    }

    public abstract void display();

    public void performFly() {
        this.flyBehavior.fly();
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
