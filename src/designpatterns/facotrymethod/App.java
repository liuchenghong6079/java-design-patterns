package designpatterns.facotrymethod;

public class App {

    public static void main(String[] args) {
        CarComponentFactory chassisFactory = new ChassisFactory();
        CarComponent chassis = chassisFactory.createComponent();
        System.out.println(chassis.getComonentName());

        CarComponentFactory engineFactory = new EngineFactory();
        CarComponent engin = engineFactory.createComponent();
        System.out.println(engin.getComonentName());

        CarComponentFactory wheelFactory = new WheelFactory();
        CarComponent wheel = wheelFactory.createComponent();
        System.out.println(wheel.getComonentName());
    }
}
