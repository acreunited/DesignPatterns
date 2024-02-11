package chapter6;

import chapter6.dummy.NoCommand;
import common.utils.CharacterUtils;

/**
 * The invoker remote control
 */
public class RemoteControlWithUndo {

    /**
     * The number of commands available
     * ON + OFF are considered 1 command only
     */
    private static final int COMMAND_SIZE = 7;

    /**
     * The On commands.
     */
    private final Command[] onCommands;

    /**
     * The Off commands.
     */
    private final Command[] offCommands;

    /**
     * The Undo command.
     */
    private Command undoCommand;

    /**
     * Instantiates a new Remote control.
     */
    public RemoteControlWithUndo() {
        this.onCommands = new Command[COMMAND_SIZE];
        this.offCommands = new Command[COMMAND_SIZE];

        Command noCommand = new NoCommand();
        for (int i = 0; i < COMMAND_SIZE; i++) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
        this.undoCommand = noCommand;
    }

    /**
     * Sets command.
     *
     * @param slot       the slot
     * @param onCommand  the on command
     * @param offCommand the off command
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    /**
     * On button was pushed.
     *
     * @param slot the slot
     */
    public void onButtonWasPushed(int slot) {
        this.onCommands[slot].execute();
        this.undoCommand = this.onCommands[slot];
    }

    /**
     * Off button was pushed.
     *
     * @param slot the slot
     */
    public void offButtonWasPushed(int slot) {
        this.offCommands[slot].execute();
        this.undoCommand = this.offCommands[slot];
    }

    /**
     * Off button was pushed.
     */
    public void undoButtonWasPushed() {
        this.undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(CharacterUtils.LINE_BREAK).append("------ Remote Control -------")
                .append(CharacterUtils.LINE_BREAK);
        for (int i = 0; i < COMMAND_SIZE; i++) {
            stringBuilder.append("[slot ").append(i).append("] ")
                    .append(this.onCommands[i].getClass().getName())
                    .append("    ")
                    .append(this.offCommands[i].getClass().getName()).append(CharacterUtils.LINE_BREAK);
        }
        stringBuilder.append("[undo] ").append(this.undoCommand.getClass().getName());
        return stringBuilder.toString();
    }
}
