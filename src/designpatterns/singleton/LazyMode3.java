package designpatterns.singleton;

/**
 * 多线程情况下，兼顾线程安全和效率的懒汉模式
 * @author lch
 */
public class LazyMode3 {

    private static LazyMode3 lazyMode3;

    private LazyMode3(){}

    public static LazyMode3 getInstance(){
        if(lazyMode3 == null){
            synchronized (LazyMode3.class){
                if(lazyMode3 == null){
                    lazyMode3 = new LazyMode3();
                }
            }
        }
        return lazyMode3;
    }

    public void say(){
        System.out.println("兼顾线程安全和效率的懒汉模式");
    }
}
