package chapter11.gumball.states;

import chapter11.gumball.machine.GumballMachine;

public class SoldOutState implements State {

    /**
     * Needs to add serialVersionUID, because we must serialize this
     */
    private static final long serialVersionUID = 2L;

    /**
     * The 'transient' keyword tells the JVM not to serialize this field.
     */
    private final transient GumballMachine gumballMachine;

    public SoldOutState(final GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
