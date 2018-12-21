package designpatterns.templatemethod;

public class App {

    public static void main(String[] args) {
        Car bwm = new Bwm();
        bwm.run();
        Car audi = new Audi();
        audi.run();
    }

}
