package designpatterns.mediator;

/**
 * 抽象同事类
 * @author lch
 */
public abstract class Person {

    protected String name;

    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 发送消息
     * @param message
     */
    public abstract void sendMessage(String message);

    /**
     * 获取信息
     * @param message
     */
    public abstract void getMessage(String message);
}
