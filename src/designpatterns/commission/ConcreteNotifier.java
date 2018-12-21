package designpatterns.commission;

/**
 * 通知实现类
 *
 * @author lch
 */
public class ConcreteNotifier extends Notifyer {

    @Override
    public void addListener(Object object, String methodName, Object... params) {
        super.getEventHandler().addEvent(object,methodName,params);
    }

    @Override
    public void notifyX(){
        try {
            super.getEventHandler().notifyX();
        } catch (Exception e) {
            //TODO handle exception
            e.printStackTrace();
        }
    }
}
