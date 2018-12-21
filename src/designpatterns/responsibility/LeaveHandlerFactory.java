package designpatterns.responsibility;

/**
 * 处理人工厂
 * @author lch
 */
public class LeaveHandlerFactory {

    public static LeaveHandler createHandler(){
        LeaveHandler lead = new Lead();
        LeaveHandler humanResources = new HumanResources();
        humanResources.setHandler(new Boss());
        lead.setHandler(humanResources);
        return lead;
    }

}
