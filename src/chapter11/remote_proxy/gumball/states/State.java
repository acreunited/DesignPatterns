package chapter11.remote_proxy.gumball.states;

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
