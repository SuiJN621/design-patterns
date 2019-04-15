package statepattern;

/**
 * @author Sui
 * @date 2018/9/4 14:52
 */
public class SellMachine {

    private SellMachineState state;

    private int candyCount;

    public SellMachine(int putIn) {
        assert candyCount >= 0 : "candy number can't be negative";
        candyCount = putIn;
        state = NoMoney.noMoney;
    }

    public void setState(SellMachineState state) {
        this.state = state;
    }

    public int getCandyCount() {
        return candyCount;
    }

    public void putCandy() {
        state.putCandy(this);
    }

    public void putMoney(){
        state.putMoney(this);
    }

    public void returnMoney(){
        state.returnMoney(this);
    }

    public void getCandy(){
        state.getCandy(this);
    }

    public void releaseCandy(){
        candyCount --;
    }
}
