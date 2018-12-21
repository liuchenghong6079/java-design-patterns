package designpatterns.commission;

/**
 * 通知抽象类
 *
 * @author lch
 */
public abstract class Notifyer {

    private  EventHandler eventHandler = new EventHandler();

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    public abstract void addListener(Object object,String methodName,Object... params);

    public abstract void notifyX();

}
