package designpatterns.builder;

public class App {

    public static void main(String[] args) {
        HumanityBuildde manBuilder = new ManBuilder();
        Humanity man = Director.construct(manBuilder);
        System.out.println(man);
    }

}
