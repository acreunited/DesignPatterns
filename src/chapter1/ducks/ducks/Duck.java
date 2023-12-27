package chapter1.ducks.ducks;

import chapter1.ducks.behaviours.fly.FlyBehavior;
import chapter1.ducks.behaviours.quack.QuackBehavior;

/**
 * Duck superclass
 */
public abstract class Duck {

    /**
     * The FlyBehavior
     */
    private final FlyBehavior flyBehavior;

    /**
     * The QuackBehavior
     */
    private final QuackBehavior quackBehavior;

    /**
     * Empty constructor
     * <p>
     * Subclasses must instantiate the Behaviors
     */
    Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    /**
     * Defines hoe the duck should be displayed
     */
    public abstract void display();

    /**
     * Makes the Duck fly
     */
    public void performFly() {
        this.flyBehavior.fly();
    }

    /**
     * Makes the Duck quack
     */
    public void performQuack() {
        this.quackBehavior.quack();
    }

    /**
     * Makes the Duck swim
     */
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
