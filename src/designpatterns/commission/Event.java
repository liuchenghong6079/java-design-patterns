package designpatterns.commission;

import java.lang.reflect.Method;

/**
 * 委托事件类
 *
 * @author lch
 */
public class Event {

    private Object object;

    private String methodName;

    private Object[] params;

    private Class[] paramTypes;

    public Event(Object object, String methodName, Object... params) {
        this.object = object;
        this.methodName = methodName;
        this.params = params;
        contractParamTypes(this.params);
    }

    private void contractParamTypes(Object[] params){
        if(params == null){
            return;
        }
        this.paramTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            this.paramTypes[i] = params[i].getClass();
        }
    }

    public void invoke() throws Exception {
        Method method = object.getClass().getMethod(methodName,paramTypes);
        if(method == null){
            return;
        }
        method.invoke(object,params);
    }

}
