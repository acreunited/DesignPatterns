package chapter1.ducks.run;

import chapter1.ducks.ducks.Duck;
import chapter1.ducks.ducks.MallardDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
