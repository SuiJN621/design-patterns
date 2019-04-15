package strategypattern.behavior.fly;

/**
 * @author Sui
 * @date 2018/6/14 18:12
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("can't fly");
    }
}
