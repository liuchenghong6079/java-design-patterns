package designpatterns.singleton;

/**
 * 静态内部类单例模式
 * @author lch
 */
public class InternalMode {

    private InternalMode(){}

    private static class Holder{
        private static InternalMode mode = new InternalMode();
    }

    public static InternalMode getInstance(){
        return Holder.mode;
    }

    public void say(){
        System.out.println("静态内部类单例模式");
    }

}
