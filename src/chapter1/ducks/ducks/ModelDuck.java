package chapter1.ducks.ducks;

import chapter1.ducks.behaviours.fly.FlyNoWay;
import chapter1.ducks.behaviours.quack.Quack;

/**
 * A Model duck
 */
public class ModelDuck extends Duck {

    /**
     * The constructor
     */
    public ModelDuck() {
        super(new FlyNoWay(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
