package chapter7.adapters;

import chapter7.ducks.Duck;
import chapter7.turkeys.Turkey;

import java.security.SecureRandom;
import java.util.Random;

/**
 * The type Duck adapter.
 */
public class DuckAdapter implements Turkey {

    /**
     * Ducks fly longer distances, so we need to fly less times
     */
    private static final int NUMBER_OF_FLIES = 5;

    /**
     * The Duck
     */
    private final Duck duck;

    private final Random random = new SecureRandom();

    /**
     * Instantiates a new Duck adapter.
     *
     * @param duck the duck
     */
    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        this.duck.quack();
    }

    @Override
    public void fly() {
        if (this.random.nextInt(5) == 0) {
            this.duck.fly();
        }
    }
}
