package chapter6.runner;

import chapter6.Command;
import chapter6.RemoteControl;
import chapter6.garage.GarageDoor;
import chapter6.garage.GarageDoorUpCommand;
import chapter6.lights.Light;
import chapter6.lights.LightOffCommand;
import chapter6.lights.LightOnCommand;
import chapter6.stereo.Stereo;
import chapter6.stereo.StereoOffCommand;
import chapter6.stereo.StereoOnWithCdCommand;

/**
 * The type Remote loader.
 */
public final class RemoteLoader {

    /**
     * Private empty constructor
     */
    private RemoteLoader() {
        // empty
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light();
        Light kitchenLight = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);

        Command stereoOnWithCD = new StereoOnWithCdCommand(stereo);
        Command stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
    }
}
