package commandpattern.command;

import commandpattern.receiver.Light;

/**
 * @author Sui
 * @date 2018/7/3 18:17
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
