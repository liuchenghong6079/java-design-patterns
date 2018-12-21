package designpatterns.responsibility;

/**
 * 人力资源主管
 * @author lch
 */
public class HumanResources extends LeaveHandler {
    /**
     * HR可以处理5天之内的请假请求
     * @param day
     */
    @Override
    public void disposeLeave(int day) {
        if(day <= 5){
            System.out.println("请假" + day + "天，HR可以处理!!!");
        }else if(handler != null){
                //HR不能处理的请求，交给他的上级处理
                handler.disposeLeave(day);
        }
    }
}
