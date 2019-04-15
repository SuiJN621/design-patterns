package statepattern;

/**
 * @author Sui
 * @date 2018/9/4 14:52
 */
public class HasMoney implements SellMachineState {

    public static HasMoney hasMoney = new HasMoney();

    private HasMoney() {
    }

    @Override
    public void returnMoney(SellMachine sellMachine) {
        System.out.println("return money");
        sellMachine.setState(NoMoney.noMoney);
    }

    @Override
    public void getCandy(SellMachine sellMachine) {
        System.out.println("get candy");
        sellMachine.setState(Sold.sold);
    }
}
