package chapter7.runner;

import chapter7.adapters.TurkeyAdapter;
import chapter7.ducks.Duck;
import chapter7.ducks.MallardDuck;
import chapter7.turkeys.Turkey;
import chapter7.turkeys.WildTurkey;

/**
 * The type Duck test drive.
 */
public final class DuckTestDrive {

    private DuckTestDrive() {
        // empty
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
