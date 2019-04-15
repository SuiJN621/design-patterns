package strategypattern.behavior.quack;

/**
 * @author Sui
 * @date 2018/6/14 18:14
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("squeak");
    }
}
