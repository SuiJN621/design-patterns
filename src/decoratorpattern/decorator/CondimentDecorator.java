package decoratorpattern.decorator;

import decoratorpattern.component.Beverage;

/**
 * @author Sui
 * @date 2018/6/18 13:07
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
