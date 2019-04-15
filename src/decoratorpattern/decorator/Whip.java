package decoratorpattern.decorator;

import decoratorpattern.component.Beverage;

/**
 * @author Sui
 * @date 2018/6/18 13:19
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + beverage.getSize() * 0.5 * .10;
    }
}
