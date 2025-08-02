package chapter11.gumball.monitor;

import chapter11.gumball.machine.GumballMachineRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public final class GumballMonitorRunner {

    private GumballMonitorRunner() {
        // empty
    }

    public static void main(final String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        //127.0.0.1
        //Naming.rebind("//%s/gumballmachine".formatted(args[0]), machine);
        //Naming.rebind("//127.0.0.1/gumballmachine".formatted(args[0]), machine);

        final GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup("//127.0.0.1/gumballmachine");
        final GumballMonitor monitor = new GumballMonitor(machine);

        System.out.println(machine);
        monitor.report();
    }
}
