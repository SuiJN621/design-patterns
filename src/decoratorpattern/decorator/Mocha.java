package decoratorpattern.decorator;

import decoratorpattern.component.Beverage;

/**
 * @author Sui
 * @date 2018/6/18 13:15
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + beverage.getSize() * 0.5 * .20;
    }
}
