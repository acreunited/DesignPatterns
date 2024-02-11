package chapter6.ceiling;

/**
 * The type Ceiling fan.
 */
public class CeilingFan {

    /**
     * The Location.
     */
    private String location = "";

    /**
     * The Speed Level.
     */
    private int speed = 0;

    /**
     * The constant HIGH.
     */
    static final int HIGH = 2;

    /**
     * The constant MEDIUM.
     */
    static final int MEDIUM = 1;

    /**
     * The constant LOW.
     */
    static final int LOW = 0;

    /**
     * Instantiates a new Ceiling fan.
     *
     * @param location the location
     */
    public CeilingFan(String location) {
        this.location = location;
    }

    /**
     * High.
     */
    void high() {
        // turns the ceiling fan on to high
        this.speed = HIGH;
        System.out.println(this.location + " ceiling fan is on high");
    }

    /**
     * Medium.
     */
    void medium() {
        // turns the ceiling fan on to medium
        this.speed = MEDIUM;
        System.out.println(this.location + " ceiling fan is on medium");
    }

    /**
     * Low.
     */
    void low() {
        // turns the ceiling fan on to low
        this.speed = LOW;
        System.out.println(this.location + " ceiling fan is on low");
    }

    /**
     * Off.
     */
    public void off() {
        // turns the ceiling fan off
        this.speed = 0;
        System.out.println(this.location + " ceiling fan is off");
    }

    /**
     * Gets speed.
     *
     * @return the speed
     */
    int getSpeed() {
        return this.speed;
    }
}
