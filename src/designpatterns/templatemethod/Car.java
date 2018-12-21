package designpatterns.templatemethod;

/**
 * AbstractClass（抽象类）
 *
 * 汽车
 *
 * @author lch
 */
public abstract class Car {
    /** 启动 */
    public abstract void start();
    /** 停止 */
    public abstract void stop();
    /** 鸣笛 */
    public abstract void alarm();
    /** 上路跑 */
    public final void run(){
        this.start();
        this.alarm();
        this.stop();
    }
}
