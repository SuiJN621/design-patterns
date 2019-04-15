package commandpattern;

import commandpattern.command.GarageDoorOpenCommand;
import commandpattern.command.LightOnCommand;
import commandpattern.invoker.SimpleRemoteController;
import commandpattern.receiver.GarageDoor;
import commandpattern.receiver.Light;

/**
 * @author Sui
 * @date 2018/7/3 18:26
 */
public class RemoteControllerTest {

    public static void main(String[] args) {
        SimpleRemoteController simpleRemoteController = new SimpleRemoteController();
        LightOnCommand lightOnCommand = new LightOnCommand(new Light());
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(new GarageDoor());

        simpleRemoteController.setSlot(lightOnCommand);
        simpleRemoteController.buttonPressed();

        simpleRemoteController.setSlot(garageDoorOpenCommand);
        simpleRemoteController.buttonPressed();
    }
}
