package chapter6.runner;

import chapter6.Command;
import chapter6.SimpleRemoteControl;
import chapter6.lights.Light;
import chapter6.lights.LightOnCommand;

/**
 * The type Remote control test.
 */
public class RemoteControlTest {

    /**
     * Private empty constructor
     */
    private RemoteControlTest() {
        // empty
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
