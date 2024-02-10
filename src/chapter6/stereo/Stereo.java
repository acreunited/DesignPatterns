package chapter6.stereo;

/**
 * The type Stereo.
 */
public class Stereo {

    /**
     * Instantiates a new Stereo.
     */
    public Stereo() {
        // empty
    }

    /**
     * On.
     */
    void on() {
        System.out.println("Stereo ON");
    }

    /**
     * Off.
     */
    void off() {
        System.out.println("Stereo OFF");
    }

    /**
     * Sets cd.
     */
    void setCd() {
        System.out.println("Stereo SET CD");
    }

    /**
     * Sets dvd.
     */
    void setDvd() {
        System.out.println("Stereo SET DVD");
    }

    /**
     * Sets radio.
     */
    void setRadio() {
        System.out.println("Stereo SET RADIO");
    }

    /**
     * Sets volume.
     * @param volume the volume value
     */
    void setVolume(int volume) {
        System.out.println("Stereo SET VOLUME to " + volume);
    }
}
