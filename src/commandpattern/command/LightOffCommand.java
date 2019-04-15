package commandpattern.command;

import commandpattern.receiver.Light;

/**
 * @author Sui
 * @date 2018/7/3 21:36
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
