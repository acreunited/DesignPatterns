package chapter2.observer;

/**
 * The Observer Interface
 * Classes that implement it, want to be updated with the current weather.
 * This gives the Subject a common interface to talk to
 */
public interface Observer {

    /**
     * Updates the weather information
     */
    void update();
}
