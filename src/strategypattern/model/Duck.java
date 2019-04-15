package strategypattern.model;

import strategypattern.behavior.fly.FlyBehavior;
import strategypattern.behavior.quack.QuackBehavior;

/**
 * @author Sui
 * @date 2018/6/14 18:04
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("all ducks can swim");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
