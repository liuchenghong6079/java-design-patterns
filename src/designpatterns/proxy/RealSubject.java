package designpatterns.proxy;

/**
 * 目标对象
 * @author lch
 */
public class RealSubject implements Subject {

    @Override
    public void sing() {
        System.out.println("开始唱歌!!!");
    }

}
