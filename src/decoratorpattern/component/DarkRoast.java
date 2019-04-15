package decoratorpattern.component;

/**
 * @author Sui
 * @date 2018/6/18 13:11
 */
public class DarkRoast extends Beverage {

    public DarkRoast(int size){
        size = size;
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
