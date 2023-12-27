package chapter1.ducks.devices;

import chapter1.ducks.behaviours.quack.QuackBehavior;

/**
 * Brain Power challenge
 * <p>
 * Implement a Duck Call device that hunters use to mimic the quacks of ducks
 * without inherit from the Duck class
 */
public class DuckCall implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I'm a DuckCall, just a bait");
    }
}
