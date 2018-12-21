package designpatterns.simplefactory;

/**
 *  抽象产品（Product）角色
 *
 * 抽象运算类：定义需要运算的两个数字，以及获取结果的方法
 * @author lch
 */
public abstract class AbstractOperation {

    /** 运算数字1 */
    protected double number1;
    /** 运算数字2 */
    protected double number2;

    /**
     * 获取运算结果
     * @return
     */
    public abstract double getResult();

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
}
