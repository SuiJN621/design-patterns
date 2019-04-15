package statepattern;

/**
 * @author Sui
 * @date 2018/9/4 14:52
 */
public interface SellMachineState {

    default void putMoney(SellMachine sellMachine){System.out.println("unsupported");}

    default void returnMoney(SellMachine sellMachine){System.out.println("unsupported");}

    default void getCandy(SellMachine sellMachine){System.out.println("unsupported");}

    default void putCandy(SellMachine sellMachine){System.out.println("unsupported");}
}
