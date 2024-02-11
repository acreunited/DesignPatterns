package chapter6.garage;

import chapter6.Command;

/**
 * The type Garage door open command.
 */
public class GarageDoorUpCommand implements Command {

    /**
     * The Garage Door
     */
    private final GarageDoor garageDoor;

    /**
     * Instantiates a new Garage door open command.
     *
     * @param garageDoor the garage door
     */
    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        this.garageDoor.up();
    }

    @Override
    public void undo() {
        this.garageDoor.down();
    }
}
