package designpatterns.singleton;

/**
 * 饿汉模式
 * @author lch
 */
public class HungryMode {

    private static HungryMode mode = new HungryMode();

    private HungryMode() {

    }

    public static HungryMode getInstance(){
        return mode;
    }

    public void say(){
        System.out.println("饿汉模式");
    }

}
