package designpatterns.simplefactory;

/**
 * 具体产品（Concrete Product）角色
 *
 * 减法运算实现类
 * @author lch
 */
public class Subtraction extends AbstractOperation {

    @Override
    public double getResult() {
        return number1 - number2;
    }
}
