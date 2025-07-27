package chapter11.gumball;

public final class GumballRunner {

    private GumballRunner() {
        // empty
    }

    public static void main(String[] args) {
        final GumballMachine machine = new GumballMachine("Aveiro", 5);
        System.out.println(machine);

        machine.insertQuarter();
        machine.turnCrank();

        System.out.println(machine);

        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();

        System.out.println(machine);
    }
}
