package designpatterns.proxy;

import java.lang.reflect.Proxy;

public class App {

    public static void main(String[] args) {
        //静态代理
        RealSubject realSubject = new RealSubject();
        ProxySubject proxy = new ProxySubject(realSubject);
        proxy.sing();

        //动态代理
        DynamicProxy dynamicProxy = new DynamicProxy(realSubject);
        Subject subject = (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), dynamicProxy);
        subject.sing();

    }

}
