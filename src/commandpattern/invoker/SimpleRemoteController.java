package commandpattern.invoker;

import commandpattern.command.Command;

/**
 * @author Sui
 * @date 2018/7/3 18:20
 */
public class SimpleRemoteController {

    private Command slot;

    public SimpleRemoteController() {
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonPressed(){
        slot.execute();
    }
}
