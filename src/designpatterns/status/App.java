package designpatterns.status;

public class App {

    public static void main(String[] args) {
        Content content = new Content(new ConcreteStateA());
        content.handle();
        content.setStatu(new ConcreteStateB());
        content.handle();
    }

}
