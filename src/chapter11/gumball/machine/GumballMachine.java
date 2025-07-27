package chapter11.gumball.machine;

import chapter11.gumball.states.HasQuarterState;
import chapter11.gumball.states.NoQuarterState;
import chapter11.gumball.states.SoldOutState;
import chapter11.gumball.states.SoldState;
import chapter11.gumball.states.State;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * The Gumball Machine class.
 * Must be a subclass of UnicastRemoteObject, to give it the ability to act as a remote service
 * And, of course, needs to implement our Remote interface (GumballMachineRemote)
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    private static final long serialVersionUID = 2L;

    private State soldOutState;

    private State noQuarterState;

    private State hasQuarterState;

    private State soldState;

    private State state;

    private int count;

    private String location;

    public GumballMachine(final String location, final int numberGumballs) throws RemoteException {
        super();
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);

        this.location = location;
        this.count = numberGumballs;
        this.state = numberGumballs > 0 ? this.noQuarterState : this.soldOutState;
    }

    public void insertQuarter() {
        this.state.insertQuarter();
    }

    public void ejectQuarter() {
        this.state.ejectQuarter();
    }

    public void turnCrank() {
        this.state.turnCrank();
        this.state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot");
        if (this.count > 0) {
            this.count--;
        }
    }

    public State getSoldOutState() {
        return this.soldOutState;
    }

    public void setSoldOutState(final State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return this.noQuarterState;
    }

    public void setNoQuarterState(final State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return this.hasQuarterState;
    }

    public void setHasQuarterState(final State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return this.soldState;
    }

    public void setSoldState(final State soldState) {
        this.soldState = soldState;
    }

    public State getState() {
        return this.state;
    }

    public void setState(final State state) {
        this.state = state;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(final int count) {
        this.count = count;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(final String location) {
        this.location = location;
    }
}
