package chapter11.remote_proxy.gumball.states;

import chapter11.remote_proxy.gumball.machine.GumballMachine;

//TODO - DELETE ME
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
