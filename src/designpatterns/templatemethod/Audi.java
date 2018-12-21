package designpatterns.templatemethod;
/**
 * 奥迪车
 *
 * @author lch
 */
public class Audi extends Car {
    @Override
    public void start() {
        System.out.println("奥迪车启动.....");
    }

    @Override
    public void stop() {
        System.out.println("奥迪车停止.....");
    }

    @Override
    public void alarm() {
        System.out.println("奥迪车鸣笛.....");
    }
}
