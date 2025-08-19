package chapter11.remote_proxy.gumball;

import chapter11.remote_proxy.gumball.machine.GumballMachine;
import chapter11.remote_proxy.gumball.machine.GumballMachineRemote;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public final class GumballRunner {

    private GumballRunner() {
        // empty
    }

    //127.0.0.1:8080
    public static void main(String[] args) {
        if (args.length < 2) {
            throw new IllegalArgumentException("GumballMachine <name> <inventory>");
        }

        try {
            LocateRegistry.createRegistry(1099);
            System.out.println("Created Registry");

            final int count = Integer.parseInt(args[1]);
            final Remote machine = new GumballMachine(args[0], count);
            Naming.rebind("//%s/gumballmachine".formatted(args[0]), machine);
            System.out.println("GumballMachine registered");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
