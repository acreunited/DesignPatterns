package chapter9.java_iterator.iterator;

import chapter9.java_iterator.MenuItem;

/**
 * Interface for iteration
 */
public interface Iterator {

    /**
     * Tells us if there are more elements to iterate over
     *
     * @return if there are more elements to iterate
     */
    boolean hasNext();

    /**
     * Retrieves the next element to be iterated
     *
     * @return the next element
     */
    MenuItem next();
}
