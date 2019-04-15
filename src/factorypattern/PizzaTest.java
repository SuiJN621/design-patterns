package factorypattern;

import factorypattern.pizza.model.Pizza;
import factorypattern.store.NYPizzaStore;
import factorypattern.store.PizzaStore;

/**
 * @author Sui
 * @date 2018/6/26 17:55
 */
public class PizzaTest {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();

        Pizza pizza = pizzaStore.orderPizza("cheese");

    }
}
