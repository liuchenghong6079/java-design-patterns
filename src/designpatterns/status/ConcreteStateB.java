package designpatterns.status;

/**
 * 具体状态
 * @author lch
 */
public class ConcreteStateB implements Statu {

    @Override
    public void handle() {
        System.out.println("B状态处理");
    }
}
