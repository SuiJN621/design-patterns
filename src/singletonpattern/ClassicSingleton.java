package singletonpattern;

/**
 * @author Sui
 * @date 2018/6/28 18:17
 */
public class ClassicSingleton {

    private static ClassicSingleton singleton;

    private ClassicSingleton() {
    }

    //使用synchronized保证多线程唯一,简单但效率低
    public static synchronized ClassicSingleton getInstance(){
        if(singleton == null){
            singleton = new ClassicSingleton();
        }
        return singleton;
    }
}
