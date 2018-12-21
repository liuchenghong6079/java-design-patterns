package designpatterns.observer;
/**
 * 具体观察者角色(ConcreteObserver)
 *
 * 上班族
 *
 * @author lch
 */
public class OfficeWorker implements Listener {
    @Override
    public void update(String message) {
        switch (message){
            case "下雪":
                System.out.println("坐出租车去上班!!!");
                break;
            case "晴天":
                System.out.println("骑车去上班!!!");
                break;
            case "下雨":
                System.out.println("坐公交车去上班!!!");
                break;
            default:
                System.out.println("去上学");
        }
    }
}
