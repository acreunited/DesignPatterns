package chapter1.ducks.run;

import chapter1.ducks.behaviours.fly.FlyRocketPowered;
import chapter1.ducks.ducks.Duck;
import chapter1.ducks.ducks.MallardDuck;
import chapter1.ducks.ducks.ModelDuck;

/**
 * Class that runs our mini duck simulator
 */
public final class MiniDuckSimulator {

    /**
     * Private empty constructor
     */
    private MiniDuckSimulator() {
        // empty
    }

    /**
     * Main method that runs the MiniDuckSimulator
     *
     * @param args the args (none is used)
     */
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
