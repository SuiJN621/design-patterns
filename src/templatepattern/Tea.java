package templatepattern;

/**
 * @author Sui
 * @date 2018/7/9 15:08
 */
public class Tea extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
