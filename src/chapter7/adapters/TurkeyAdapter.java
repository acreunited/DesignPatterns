package chapter7.adapters;

import chapter7.ducks.Duck;
import chapter7.turkeys.Turkey;

/**
 * The type Turkey adapter.
 */
public class TurkeyAdapter implements Duck {

    /**
     * Turkeys fly shorter differences, so we need to fly more than one time
     */
    private static final int NUMBER_OF_FLIES = 5;

    /**
     * The turkey
     */
    private final Turkey turkey;

    /**
     * Instantiates a new Turkey adapter.
     *
     * @param turkey the turkey
     */
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        this.turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < NUMBER_OF_FLIES; i++) {
            this.turkey.fly();
        }
    }
}
