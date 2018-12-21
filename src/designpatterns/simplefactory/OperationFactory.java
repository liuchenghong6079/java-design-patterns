package designpatterns.simplefactory;

/**
 * 工厂（Creator）角色
 *
 * 运算类对象创建工厂
 * @author lch
 */
public class OperationFactory {

    public static AbstractOperation cretateOperation(String operate){
        AbstractOperation operation = null;
        switch (operate){
            case "+":
                operation =  new Addition();
                break;
            case "-":
                operation = new Subtraction();
                break;
            case "*":
                operation = new Multiplication();
                break;
            default:
                break;
        }
        return operation;
    }

}
