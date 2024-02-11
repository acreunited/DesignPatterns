package chapter6.lights;

import chapter6.Command;

/**
 * The type Light on command.
 */
public class LightOffCommand implements Command {

    /**
     * The light
     */
    private final Light light;

    /**
     * Instantiates a new Light on command.
     *
     * @param light the light
     */
    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void undo() {
        this.light.on();
    }
}
