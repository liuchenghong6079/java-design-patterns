package designpatterns.decorator;

public class App {

    public static void main(String[] args) {
        Person person = new Person("小菜");
        TShirts ts = new TShirts();
        Sneakers sk = new Sneakers();
        BigTrouser bt = new BigTrouser();
        ts.decorate(person);
        sk.decorate(ts);
        bt.decorate(sk);
        bt.show();
    }

}
