package chapter11.remote_proxy.gumball.states;

import chapter11.remote_proxy.gumball.machine.GumballMachine;

public class SoldState implements State {

    /**
     * Needs to add serialVersionUID, because we must serialize this
     */
    private static final long serialVersionUID = 2L;

    /**
     * The 'transient' keyword tells the JVM not to serialize this field.
     */
    private final transient GumballMachine gumballMachine;

    public SoldState(final GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        this.gumballMachine.releaseBall();
        if (this.gumballMachine.getCount() > 0) {
            this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
        }
    }
}
