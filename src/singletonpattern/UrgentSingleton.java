package singletonpattern;

/**
 * @author Sui
 * @date 2018/6/28 18:19
 */
public class UrgentSingleton {

    //使用静态初始化保证多线程实例唯一简单效率高
    private static UrgentSingleton singleton = new UrgentSingleton();

    private UrgentSingleton(){}

    public static UrgentSingleton getInstance(){
        return singleton;
    }
}
