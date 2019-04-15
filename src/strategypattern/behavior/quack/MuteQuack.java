package strategypattern.behavior.quack;

/**
 * @author Sui
 * @date 2018/6/14 18:13
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< silence >>");
    }
}
