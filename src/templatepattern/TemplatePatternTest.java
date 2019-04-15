package templatepattern;

/**
 * @author Sui
 * @date 2018/7/9 15:47
 */
public class TemplatePatternTest {

    public static void main(String[] args) {
        CaffeineBeverage caffeineBeverage = new CoffeeWithCustomCondiments();
        caffeineBeverage.prepareRecipe();
    }
}
