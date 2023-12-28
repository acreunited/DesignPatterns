package chapter2.subject;

import chapter2.observer.Observer;

/**
 * The Subject Interface.
 * To be implemented by the Subject that contains the information for the Observers
 */
public interface Subject {

    /**
     * Registers a new observer
     * @param observer the observer to be registered
     */
    void registerObserver(Observer observer);

    /**
     * Removes the Observer
     * @param observer the observer to be removed
     */
    void removeObserver(Observer observer);

    /**
     * Notifies the observers that the Subject state changed
     */
    void notifyObservers();
}
