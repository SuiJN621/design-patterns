package decoratorpattern;

import decoratorpattern.component.Beverage;
import decoratorpattern.component.DarkRoast;
import decoratorpattern.decorator.Mocha;
import decoratorpattern.decorator.Whip;

/**
 * @author Sui
 * @date 2018/6/17 23:57
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast(3);
        Beverage mochaDarkRoast = new Mocha(darkRoast);
        Beverage whipMochaDarkRoast = new Whip(mochaDarkRoast);
        System.out.println(whipMochaDarkRoast.getDescription() + " cost: " + whipMochaDarkRoast.cost() + "$.");
    }
}
