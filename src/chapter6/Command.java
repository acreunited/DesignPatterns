package chapter6;

/**
 * The interface Command.
 */
public interface Command {

    /**
     * Execute.
     */
    void execute();

    /**
     * To undo the previous action made
     */
    void undo();
}
