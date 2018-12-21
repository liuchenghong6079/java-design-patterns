package designpatterns.decorator;
/**
 * 具体装饰（Concrete Decorator）角色
 *
 * 垮裤
 *
 * @author lch
 */
public class BigTrouser extends Finery {

    @Override
    public void show() {
        System.out.println("垮裤");
        super.show();
    }
}
