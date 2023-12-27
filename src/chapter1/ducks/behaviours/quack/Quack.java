package chapter1.ducks.behaviours.quack;

/**
 * The Quack behavior
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
