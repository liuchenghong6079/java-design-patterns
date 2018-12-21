package designpatterns.responsibility;

/**
 * 老板
 * @author lch
 */
public class Boss extends LeaveHandler {
    /**
     * 老板可以处理一切请求
     * @param day
     */
    @Override
    public void disposeLeave(int day) {
        System.out.println("请假" + day + "天，Boss可以处理!!!");
    }
}
