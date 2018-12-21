package designpatterns.facotrymethod;

/**
 *  具体产品(Concrete Product)角色：轮子
 *
 * @author lch
 */
public class Wheel implements CarComponent {
    @Override
    public String getComonentName() {
        return "汽车轮子";
    }
}
