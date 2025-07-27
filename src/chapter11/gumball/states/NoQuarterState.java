package chapter11.gumball.states;

import chapter11.gumball.GumballMachine;

public class NoQuarterState implements State {

    /**
     * Needs to add serialVersionUID, because we must serialize this
     */
    private static final long serialVersionUID = 2L;

    /**
     * The 'transient' keyword tells the JVM not to serialize this field.
     */
    private final transient GumballMachine gumballMachine;

    public NoQuarterState(final GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        this.gumballMachine.setState(this.gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
