package factorypattern.pizza.model;

import factorypattern.pizzaingredient.ingredient.Cheese;
import factorypattern.pizzaingredient.ingredient.Clams;
import factorypattern.pizzaingredient.ingredient.Dough;
import factorypattern.pizzaingredient.ingredient.Pepperoni;
import factorypattern.pizzaingredient.ingredient.Sauce;
import factorypattern.pizzaingredient.ingredient.Veggies;

/**
 * @author Sui
 * @date 2018/6/26 17:43
 */
public abstract class Pizza {

    String name;

    Dough dough;

    Sauce sauce;

    Veggies[] veggies;

    Cheese cheese;

    Pepperoni pepperoni;

    Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
