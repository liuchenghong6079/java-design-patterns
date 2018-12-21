package designpatterns.responsibility;

/**
 * 处理人,负责处理请假请求
 * @author lch
 */
public abstract class LeaveHandler {

    protected LeaveHandler handler;

    public void setHandler(LeaveHandler handler) {
        this.handler = handler;
    }

    /**
     * 处理请假请求
     * @param day
     */
    public abstract void disposeLeave(int day);

}
