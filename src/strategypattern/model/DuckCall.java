package strategypattern.model;

import strategypattern.behavior.quack.QuackBehavior;

/**
 * @author Sui
 * @date 2018/6/14 18:41
 */
public class DuckCall {

    private QuackBehavior quackBehavior;

    public void quack(){
        quackBehavior.quack();
    }
}
