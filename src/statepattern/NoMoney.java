package statepattern;

/**
 * @author Sui
 * @date 2018/9/4 14:53
 */
public class NoMoney implements SellMachineState {

    public static NoMoney noMoney = new NoMoney();

    private NoMoney() {
    }

    @Override
    public void putMoney(SellMachine sellMachine) {
        System.out.println("get money, you can get candy now");
        sellMachine.setState(HasMoney.hasMoney);
    }
}
