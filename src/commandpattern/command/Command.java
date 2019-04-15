package commandpattern.command;

/**
 * @author Sui
 * @date 2018/7/3 18:16
 */
public interface Command {

    void execute();

    void undo();
}
