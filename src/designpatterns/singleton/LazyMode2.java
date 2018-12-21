package designpatterns.singleton;

/**
 * 多线程情况下，考虑线程安全的懒汉模式
 * @author lch
 */
public class LazyMode2 {

    private static LazyMode2 lazyMode2;

    private LazyMode2(){

    }

    public static LazyMode2 getInstance(){
        synchronized (LazyMode2.class){
            if(lazyMode2 == null){
                lazyMode2 = new LazyMode2();
            }
        }
        return lazyMode2;
    }

    public void say(){
        System.out.println("考虑线程安全的懒汉模式");
    }

}
