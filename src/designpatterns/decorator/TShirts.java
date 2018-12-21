package designpatterns.decorator;

/**
 * 具体装饰（Concrete Decorator）角色
 *
 * T恤
 *
 * @author lch
 */
public class TShirts extends Finery {

    @Override
    public void show(){
        System.out.println("T恤");
        super.show();
    }

}
