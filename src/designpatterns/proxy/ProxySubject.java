package designpatterns.proxy;

/**
 * 代理对象
 *
 * 静态代理模式
 *
 *@author lch
 */
public class ProxySubject implements Subject {

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void sing() {
        System.out.println("演唱会开始,向观众问好!!!");
        subject.sing();
        System.out.println("演唱会结束,向观众致谢!!!");
    }
}
