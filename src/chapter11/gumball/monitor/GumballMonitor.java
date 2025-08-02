package chapter11.gumball.monitor;

import chapter11.gumball.machine.GumballMachine;
import chapter11.gumball.machine.GumballMachineRemote;

import java.rmi.RemoteException;

public class GumballMonitor {

    private final GumballMachineRemote machine;

    public GumballMonitor(final GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.out.printf("Gumball Machine: %s%n", this.machine.getLocation());
            System.out.printf("Current Inventory: %d gumballs%n", this.machine.getCount());
            System.out.printf("Current state: %s%n", this.machine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
