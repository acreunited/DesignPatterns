package chapter1.ducks.behaviours.quack;

/**
 * Mute Quack
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
