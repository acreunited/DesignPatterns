package chapter1.ducks.ducks;

import chapter1.ducks.behaviours.fly.FlyWithWings;
import chapter1.ducks.behaviours.quack.Quack;

/**
 * The Mallard Duck
 */
public class MallardDuck extends Duck {

    /**
     * The constructor
     */
    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
