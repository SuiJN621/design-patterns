package factorypattern.store;

import factorypattern.pizza.model.CheesePizza;
import factorypattern.pizza.model.Pizza;
import factorypattern.pizzaingredient.factory.NYPizzaIngredientFactory;
import factorypattern.pizzaingredient.factory.PizzaIngredientFactory;

/**
 * @author Sui
 * @date 2018/6/26 17:52
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {

        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            CheesePizza cheesePizza = new CheesePizza(pizzaIngredientFactory);
            cheesePizza.setName("New York Style Cheese Pizza");
            return cheesePizza;
        } else {
            return null;
        }
    }
}
