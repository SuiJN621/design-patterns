package statepattern;

/**
 * @author Sui
 * @date 2018/9/4 14:53
 */
public class Sold implements SellMachineState {

    public static Sold sold = new Sold();

    private Sold() {
    }

    @Override
    public void putCandy(SellMachine sellMachine) {
        sellMachine.releaseCandy();
        if(sellMachine.getCandyCount() > 0) {
            sellMachine.setState(NoMoney.noMoney);
        } else if (sellMachine.getCandyCount() == 0){
            sellMachine.setState(SoldOut.soldOut);
        }

    }
}
