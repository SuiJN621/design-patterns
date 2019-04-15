package templatepattern;

/**
 * @author Sui
 * @date 2018/7/9 15:10
 */
public abstract class CaffeineBeverage {

    //不希望子类覆盖
    //模板方法
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customWantsCondiments())
        addCondiments();
    }

    protected boolean customWantsCondiments(){
        return true;
    }

    abstract void addCondiments();

    abstract void brew();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }


}
