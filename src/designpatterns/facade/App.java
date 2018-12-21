package designpatterns.facade;

public class App {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        computer.shutdown();
    }

}
