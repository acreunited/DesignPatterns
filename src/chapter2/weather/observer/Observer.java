package chapter2.weather.observer;

/**
 * The Observer Interface
 * Classes that implement it, want to be updated with the current weather.
 * This gives the Subject a common interface to talk to
 */
public interface Observer {

    /**
     * Updates the weather information
     *
     * @param temp the temperature
     * @param humidity the humidity
     * @param pressure the pressure
     */
    //TODO review Brain Power
    void update(float temp, float humidity, float pressure);
}
