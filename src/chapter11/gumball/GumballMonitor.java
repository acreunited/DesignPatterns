package chapter11.gumball;

import chapter11.gumball.machine.GumballMachine;

public class GumballMonitor {

    private GumballMachine machine;

    public GumballMonitor(final GumballMachine machine) {
        this.machine = machine;
    }

    public void report() {
        System.out.printf("Gumball Machine: %s%n", this.machine.getLocation());
        System.out.printf("Current Inventory: %d gumballs%n", this.machine.getCount());
        System.out.printf("Current state: %s%n", this.machine.getState());
    }
}
