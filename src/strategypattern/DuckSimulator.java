package strategypattern;

import strategypattern.model.Duck;
import strategypattern.model.MallardDuck;

/**
 * @author Sui
 * @date 2018/6/14 18:15
 */
public class DuckSimulator {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();
        mallardDuck.swim();
    }
}
