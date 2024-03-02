package chapter7.turkeys;

/**
 * The type Wild turkey.
 */
public class WildTurkey implements Turkey {

    /**
     * Instantiates a new Wild turkey.
     */
    public WildTurkey() {
        // empty
    }

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
