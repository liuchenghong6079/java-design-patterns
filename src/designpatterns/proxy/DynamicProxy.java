package designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理模式
 * @author lch
 */
public class DynamicProxy implements InvocationHandler{

    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理开始!!!");
        Object result = method.invoke(object, args);
        System.out.println("动态代理结束!!!");
        return result;
    }
}
