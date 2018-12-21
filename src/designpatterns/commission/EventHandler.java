package designpatterns.commission;

import java.util.ArrayList;
import java.util.List;

/**
 * 事件处理类
 *
 * @author lch
 */
public class EventHandler {

    private List<Event> listeners;

    public EventHandler() {
        listeners = new ArrayList<>();
    }

    public void addEvent(Object object,String methodName,Object... params){
        listeners.add(new Event(object,methodName,params));
    }

    public void notifyX() throws Exception {
        for (Event listener : listeners) {
            listener.invoke();
        }
    }

}
