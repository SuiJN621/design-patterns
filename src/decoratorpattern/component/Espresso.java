package decoratorpattern.component;

/**
 * @author Sui
 * @date 2018/6/18 13:09
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso Coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
