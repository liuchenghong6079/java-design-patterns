package designpatterns.facotrymethod;
/**
 *  具体工厂(Concrete Creator)角色：底盘工厂
 *
 * @author lch
 */
public class ChassisFactory implements CarComponentFactory {

    @Override
    public CarComponent createComponent() {
        return new Chassis();
    }
}
