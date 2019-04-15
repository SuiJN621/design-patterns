package singletonpattern;

/**
 * @author Sui
 * @date 2018/6/28 18:21
 */
public class DoubleLockSingleton {

    private volatile static DoubleLockSingleton singleton;

    private DoubleLockSingleton(){}

    //只有初始化的时候会进行同步操作,简单效率高
    public static DoubleLockSingleton getInstance(){
        if(singleton == null){
            synchronized (DoubleLockSingleton.class){
                if(singleton == null){
                    singleton = new DoubleLockSingleton();
                }
            }
        }
        return singleton;
    }
}
