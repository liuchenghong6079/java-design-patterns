package designpatterns.responsibility;

/**
 * 项目经理
 * @author lch
 */
public class Lead extends LeaveHandler {

    /**
     * 项目经理只能处理2天之内的请假请求
     * @param day
     */
    @Override
    public void disposeLeave(int day) {
        if(day <= 2){
            System.out.println("请假" + day + "天，Lead可以处理!!!");
        }else if(handler != null){
            //项目经理不能处理的请求，交给他的上级处理
            handler.disposeLeave(day);
        }
    }
}
