package chapter11.gumball;

import chapter11.gumball.machine.GumballMachine;
import chapter11.gumball.machine.GumballMachineRemote;

import java.rmi.Naming;
import java.rmi.Remote;

public final class GumballRunner {

    private GumballRunner() {
        // empty
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            throw new IllegalArgumentException("GumballMachine <name> <inventory>");
        }

        try {
            final int count = Integer.parseInt(args[1]);
            final Remote machine = new GumballMachine(args[0], count);
            Naming.rebind("//%s/gumballmachine".formatted(args[0]), machine);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

//        final GumballMachine machine = new GumballMachine("Aveiro", 5);
//        System.out.println(machine);
//
//        machine.insertQuarter();
//        machine.turnCrank();
//
//        System.out.println(machine);
//
//        machine.insertQuarter();
//        machine.turnCrank();
//        machine.insertQuarter();
//        machine.turnCrank();
//
//        System.out.println(machine);
    }
}
