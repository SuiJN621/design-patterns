package statepattern;

/**
 * @author Sui
 * @date 2018/9/4 15:48
 */
public class SellMachineTest {

    public static void main(String[] args) {
        SellMachine sellMachine = new SellMachine(8);

        sellMachine.putMoney();
        sellMachine.getCandy();
        sellMachine.putCandy();
    }
}
