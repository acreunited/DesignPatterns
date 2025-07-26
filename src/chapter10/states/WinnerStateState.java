package chapter10.states;

import chapter10.GumballMachine;

public class WinnerStateState implements State {

    private final GumballMachine gumballMachine;

    public WinnerStateState(final GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
