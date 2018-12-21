package designpatterns.facotrymethod;

/**
 * 抽象工厂(Creator)角色：汽车组件工厂
 *
 * @author lch
 */
public interface CarComponentFactory {

    /**
     * 生产组件
     * @return
     */
    CarComponent createComponent();

}
