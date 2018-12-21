package designpatterns.facotrymethod;

/**
 *  具体工厂(Concrete Creator)角色：引擎工厂
 *
 * @author lch
 */
public class EngineFactory implements CarComponentFactory {
    @Override
    public CarComponent createComponent() {
        return new Engine();
    }
}
