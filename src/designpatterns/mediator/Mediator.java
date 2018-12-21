package designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象中介者
 * @author lch
 */
public abstract class Mediator {

    /** 房东集合 */
    protected List<Person> landlords = new ArrayList<>();

    /** 租客集合 */
    protected List<Person> tenants = new ArrayList<>();

    /**
     * 注册房东
     * @param landlord
     */
    public void registerLandord(Person landlord){
        landlords.add(landlord);
    }

    /**
     * 注册租客
     * @param tenant
     */
    public void registerTenant(Person tenant){
        tenants.add(tenant);
    }

    /**
     * 消息的传递
     * @param person
     * @param message
     */
    public abstract void transfer(Person person, String message);

}
