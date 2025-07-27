package chapter11.gumball.states;

import chapter11.gumball.GumballMachine;

public class HasQuarterState implements State {

    /**
     * Needs to add serialVersionUID, because we must serialize this
     */
    private static final long serialVersionUID = 2L;

    /**
     * The 'transient' keyword tells the JVM not to serialize this field.
     */
    private final transient GumballMachine gumballMachine;

    public HasQuarterState(final GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        this.gumballMachine.setState(this.gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
