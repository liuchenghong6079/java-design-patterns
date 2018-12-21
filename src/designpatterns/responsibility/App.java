package designpatterns.responsibility;

public class App {

    public static void main(String[] args) {
        int day = 1;
        LeaveHandler handler = LeaveHandlerFactory.createHandler();
        handler.disposeLeave(day);
        day = 3;
        handler.disposeLeave(day);
        day = 7;
        handler.disposeLeave(day);
    }

}
