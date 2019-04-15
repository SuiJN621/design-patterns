package decoratorpattern.decorator;

import decoratorpattern.component.Beverage;

/**
 * @author Sui
 * @date 2018/6/18 13:18
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + beverage.getSize() * 0.5 * .15;
    }
}
