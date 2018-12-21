package designpatterns.mediator;

/**
 * 具体同事类：租客
 * @author lch
 */
public class Tenant extends Person {
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void sendMessage(String message) {
        mediator.transfer(this,message);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("租客[" + name + "]收到中介发来的信息:" + message);
    }
}
