package designpatterns.status;
/**
 * 具体状态
 * @author lch
 */
public class ConcreteStateA implements Statu {

    @Override
    public void handle() {
        System.out.println("A状态处理");
    }
}
