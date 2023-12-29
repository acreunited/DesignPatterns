package chapter2.observer;

/**
 * If we want to create our own display elements
 */
public class ThirdPartyDisplay implements Observer, DisplayElement {

    @Override
    public void update(float temp, float humidity, float pressure) {

    }

    @Override
    public void display() {

    }
}
