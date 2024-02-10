package chapter6.stereo;

import chapter6.Command;

/**
 * The type Stereo off command.
 */
public class StereoOffCommand implements Command {

    /**
     * The stereo
     */
    private final Stereo stereo;

    /**
     * Instantiates a new Stereo off command.
     *
     * @param stereo the stereo
     */
    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.off();
        this.stereo.setVolume(0);
    }
}
