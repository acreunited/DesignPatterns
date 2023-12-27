package chapter1.ducks.behaviours.fly;

/**
 * The FlyRocketPowered type of FlyBehavior
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
