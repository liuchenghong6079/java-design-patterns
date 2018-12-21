package designpatterns.observer;

/**
 * 抽象观察者(Observer)
 *
 * 收听天气预报的人
 *
 * @author lch
 */
public interface Listener {

    /**
     * 收到天气预报之后的改变
     */
    public void update(String message);

}
