package chapter1.ducks.behaviours.fly;

/**
 * For the Ducks that fly with wings
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Im flying!!");
    }
}
