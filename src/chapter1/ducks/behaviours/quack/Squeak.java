package chapter1.ducks.behaviours.quack;

/**
 * Squeak Behavior
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Sneak");
    }
}
