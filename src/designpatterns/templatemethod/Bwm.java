package designpatterns.templatemethod;

/**
 * 宝马车
 *
 * @author lch
 */
public class Bwm extends Car {
    @Override
    public void start() {
        System.out.println("宝马车启动.....");
    }

    @Override
    public void stop() {
        System.out.println("宝马车停止.....");
    }

    @Override
    public void alarm() {
        System.out.println("宝马车鸣笛.....");
    }
}
