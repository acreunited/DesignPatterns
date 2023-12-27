package chapter1.ducks.behaviours.fly;

/**
 * For the Ducks that cannot fly
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
