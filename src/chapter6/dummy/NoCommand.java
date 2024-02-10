package chapter6.dummy;

import chapter6.Command;

/**
 * A command that does nothing.
 * This way we don't have to always be checking if its != null
 */
public class NoCommand implements Command {

    /**
     * Empty constructor
     */
    public NoCommand() {
        // empty
    }

    @Override
    public void execute() {
        // empty
    }
}
