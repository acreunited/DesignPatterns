package chapter6.stereo;

import chapter6.Command;

/**
 * The type Stereo on with cd command.
 */
public class StereoOnWithCdCommand implements Command {

    /**
     * The stereo
     */
    private final Stereo stereo;

    /**
     * Instantiates a new Stereo on with cd command.
     *
     * @param stereo the stereo
     */
    public StereoOnWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.on();
        this.stereo.setCd();
        this.stereo.setVolume(11);
    }

    @Override
    public void undo() {
        this.stereo.off();
    }
}
