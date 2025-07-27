package chapter11.gumball.states;

import java.io.Serializable;

/**
 * Needs to extend Serializable, so that its possible to transfer it over the network
 */
public interface State extends Serializable {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
