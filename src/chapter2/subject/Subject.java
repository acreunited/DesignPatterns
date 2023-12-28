package chapter2.subject;

/**
 * The Subject Interface.
 * To be implemented by the Subject that contains the information for the Observers
 */
public interface Subject {

    /**
     * Registers a new observer
     */
    void registerObserver();

    /**
     * Removes the Observer
     */
    void removeObserver();

    /**
     * Notifies the observers with the new updated data
     */
    void notifyObserver();
}
