package designpatterns.mediator;

/**
 * 具体同事类：房东
 * @author lch
 */
public class Landlord extends Person {

    public Landlord(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void sendMessage(String message) {
        mediator.transfer(this,message);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("房东[" + name + "]收到中介发来的信息:" + message);
    }
}
