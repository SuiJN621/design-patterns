package factorypattern.pizzaingredient.factory;

import factorypattern.pizzaingredient.ingredient.Clams;
import factorypattern.pizzaingredient.ingredient.Dough;
import factorypattern.pizzaingredient.ingredient.FreshClams;
import factorypattern.pizzaingredient.ingredient.Garlic;
import factorypattern.pizzaingredient.ingredient.MarinaraSauce;
import factorypattern.pizzaingredient.ingredient.Mushroom;
import factorypattern.pizzaingredient.ingredient.Onion;
import factorypattern.pizzaingredient.ingredient.Pepperoni;
import factorypattern.pizzaingredient.ingredient.RedPepper;
import factorypattern.pizzaingredient.ingredient.ReggianoCheese;
import factorypattern.pizzaingredient.ingredient.Sauce;
import factorypattern.pizzaingredient.ingredient.SlicedPepperoni;
import factorypattern.pizzaingredient.ingredient.ThinCrustDough;
import factorypattern.pizzaingredient.ingredient.Veggies;
import factorypattern.pizzaingredient.ingredient.Cheese;

/**
 * @author Sui
 * @date 2018/6/26 17:28
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
