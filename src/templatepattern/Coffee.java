package templatepattern;

/**
 * @author Sui
 * @date 2018/7/9 15:05
 */
public class Coffee extends CaffeineBeverage{

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }
}
