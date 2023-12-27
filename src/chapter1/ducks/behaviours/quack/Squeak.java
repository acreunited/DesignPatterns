package chapter1.ducks.behaviours.quack;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
