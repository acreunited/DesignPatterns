package chapter1.ducks.behaviours.quack;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
