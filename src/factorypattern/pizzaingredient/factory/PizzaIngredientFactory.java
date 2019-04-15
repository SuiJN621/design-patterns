package factorypattern.pizzaingredient.factory;

import factorypattern.pizzaingredient.ingredient.Clams;
import factorypattern.pizzaingredient.ingredient.Dough;
import factorypattern.pizzaingredient.ingredient.Pepperoni;
import factorypattern.pizzaingredient.ingredient.Sauce;
import factorypattern.pizzaingredient.ingredient.Veggies;
import factorypattern.pizzaingredient.ingredient.Cheese;

/**
 * @author Sui
 * @date 2018/6/26 17:25
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();
}
