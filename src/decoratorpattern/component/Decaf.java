package decoratorpattern.component;

/**
 * @author Sui
 * @date 2018/6/18 13:12
 */
public class Decaf extends Beverage {

    public Decaf(){
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
