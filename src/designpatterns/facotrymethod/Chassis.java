package designpatterns.facotrymethod;

/**
 *  具体产品(Concrete Product)角色：底盘
 *
 * @author lch
 */
public class Chassis implements CarComponent {

    @Override
    public String getComonentName() {
        return "汽车底盘";
    }
}
