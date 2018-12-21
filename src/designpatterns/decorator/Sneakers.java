package designpatterns.decorator;
/**
 * 具体装饰（Concrete Decorator）角色
 *
 * 球鞋
 *
 * @author lch
 */
public class Sneakers extends Finery {

    @Override
    public void show() {
        System.out.println("球鞋");
        super.show();
    }
}
