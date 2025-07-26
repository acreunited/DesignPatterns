package chapter10;

import chapter10.states.HasQuarterState;
import chapter10.states.NoQuarterState;
import chapter10.states.SoldOutState;
import chapter10.states.SoldState;
import chapter10.states.State;

public class GumballMachine {

    private State soldOutState;

    private State noQuarterState;

    private State hasQuarterState;

    private State soldState;

    private State state;

    private int count = 0;

    public GumballMachine(final int numberGumballs) {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);

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
}
