package chapter6.party;

import chapter6.Command;

/**
 * A command that can execute multiple other commands
 */
public class MacroCommand implements Command {

    /**
     * The commands
     */
    private final Command[] commands;

    /**
     * Instantiates a new Macro command.
     *
     * @param commands the commands
     */
    public MacroCommand(Command[] commands) {
        this.commands = commands.clone();
    }

    @Override
    public void execute() {
        for (Command command : this.commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : this.commands) {
            command.undo();
        }
    }
}
