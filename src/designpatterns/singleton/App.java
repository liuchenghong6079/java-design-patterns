package designpatterns.singleton;

public class App {
    public static void main(String[] args) {
        HungryMode.getInstance().say();
        LazyMode1.getInstance().say();
        LazyMode2.getInstance().say();
        LazyMode3.getInstance().say();
        InternalMode.getInstance().say();
        EnumMode.INSTANCE.say();
    }
}
