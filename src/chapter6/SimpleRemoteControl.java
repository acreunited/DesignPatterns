package chapter6;

/**
 * The type Simple remote control.
 */
public class SimpleRemoteControl {

    /**
     * The command
     */
    private Command slot;

    /**
     * Instantiates a new Simple remote control.
     */
    public SimpleRemoteControl() {
        // empty
    }

    /**
     * Sets command.
     *
     * @param command the command
     */
    public void setCommand(Command command) {
        this.slot = command;
    }

    /**
     * Button was pressed.
     */
    public void buttonWasPressed() {
        this.slot.execute();
    }
}
