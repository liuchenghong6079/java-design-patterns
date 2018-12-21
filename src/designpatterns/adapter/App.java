package designpatterns.adapter;

public class App {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.request();
    }

}
