package designpatterns.observer;

/**
 * 具体观察者角色(ConcreteObserver)
 *
 * 学生
 *
 * @author lch
 */
public class Student implements Listener {

    @Override
    public void update(String message) {
        switch (message){
            case "下雪":
                System.out.println("不上学,放假!!!");
                break;
            case "晴天":
                System.out.println("开开心心去上学!!!");
                break;
            case "下雨":
                System.out.println("打伞去上学!!!");
                break;
            default:
                System.out.println("去上学");
        }
    }
}
