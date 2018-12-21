package designpatterns.facotrymethod;

/**
 *  具体工厂(Concrete Creator)角色：轮子工厂
 *
 * @author lch
 */
public class WheelFactory implements CarComponentFactory {
    @Override
    public CarComponent createComponent() {
        return new Wheel();
    }
}
