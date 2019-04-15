package strategypattern.model;

import strategypattern.behavior.fly.FlyWithWings;
import strategypattern.behavior.quack.Quack;

/**
 * @author Sui
 * @date 2018/6/14 18:15
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("a real mallard duck");
    }
}
