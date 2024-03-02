package chapter7.ducks;

/**
 * The type Mallard duck.
 */
public class MallardDuck implements Duck {

    /**
     * Instantiates a new Mallard duck.
     */
    public MallardDuck() {
        // empty
    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
