package decoratorpattern.component;

/**
 * @author Sui
 * @date 2018/6/18 13:10
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
