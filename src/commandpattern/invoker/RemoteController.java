package commandpattern.invoker;

import commandpattern.command.Command;
import commandpattern.command.NoCommand;

/**
 * @author Sui
 * @date 2018/7/3 20:03
 */
public class RemoteController {

    Command[] onCommands;

    Command[] offCommands;

    Command undoCommand;

    public RemoteController() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        for(int i = 0; i < 6; i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }

        undoCommand = new NoCommand();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        if(slot <= 7){
            onCommands[slot - 1] = onCommand;
            offCommands[slot - 1] = offCommand;
        }
    }

    public void onButtonPressed(int slot){
        if(slot <= 7) {
            onCommands[slot - 1].execute();
            undoCommand = onCommands[slot - 1];
        }
    }

    public void offButtonPressed(int slot){
        if(slot <= 7) {
            offCommands[slot - 1].execute();
            undoCommand = offCommands[slot - 1];
        }
    }

    public void undoButtonPressed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
