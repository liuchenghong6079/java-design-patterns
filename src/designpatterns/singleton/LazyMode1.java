package designpatterns.singleton;

/**
 * 单线程懒汉模式
 * @author lch
 */
public class LazyMode1 {

    private static LazyMode1 lazyMode1;

    private LazyMode1(){

    }

    public static LazyMode1 getInstance(){
        if(lazyMode1 == null){
            lazyMode1 = new LazyMode1();
        }
        return lazyMode1;
    }

    public void say(){
        System.out.println("单线程懒汉模式");
    }

}
