package designpatterns.simplefactory;

public class App {

    public static void main(String[] args) {
        AbstractOperation operation = OperationFactory.cretateOperation("+");
        operation.setNumber1(1.0);
        operation.setNumber2(2.0);
        double result = operation.getResult();
        System.out.println(result);
    }

}
