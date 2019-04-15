package statepattern;

/**
 * @author Sui
 * @date 2018/9/4 14:53
 */
public class SoldOut implements SellMachineState {

    public static SoldOut soldOut = new SoldOut();

    private SoldOut() {
    }
}
