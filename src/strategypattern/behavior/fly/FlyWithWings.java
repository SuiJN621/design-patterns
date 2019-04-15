package strategypattern.behavior.fly;

/**
 * @author Sui
 * @date 2018/6/14 18:11
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("fly with wings");
    }
}
