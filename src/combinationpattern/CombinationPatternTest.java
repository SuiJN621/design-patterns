package combinationpattern;

import java.util.Iterator;

/**
 * @author Sui
 * @date 2018/7/9 17:47
 */
public class CombinationPatternTest {

    public static void main(String[] args) {

        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("All MENUS", "All menus combined");

        //allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        //allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true, 2.99));

        dinerMenu.add(new MenuItem("Regular Pancake Breakfast",
                "pancakes with fried eggs, sausage",
                false, 2.99));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true, 3.49));

        dessertMenu.add(new MenuItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true, 3.59));

        Waitress waitress = new Waitress(allMenus);

        //waitress.printMenu();

        Iterator iterator = allMenus.createIterator();
        while (iterator.hasNext()){
            MenuComponent next = (MenuComponent) iterator.next();
            System.out.println(next.getName());
            if(next.isVegetarian()){
                next.print();
            }
        }
    }
}
