package factorypattern.store;

import factorypattern.pizza.model.Pizza;

/**
 * @author Sui
 * @date 2018/6/26 17:49
 */
public abstract class PizzaStore {

    abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
