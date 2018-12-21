package designpatterns.facotrymethod;

/**
 *  具体产品(Concrete Product)角色：引擎
 *
 * @author lch
 */
public class Engine implements CarComponent {
    @Override
    public String getComonentName() {
        return "汽车引擎";
    }
}
