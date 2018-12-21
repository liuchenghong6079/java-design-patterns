package designpatterns.mediator;

/**
 * 具体中介者：房屋中介
 * @author lch
 */
public class HousesMediator extends Mediator{
    @Override
    public void transfer(Person person, String message) {
        //如果是房东发送的信息
        if(person instanceof Landlord){
            tenants.stream().forEach(tenant ->{
                tenant.getMessage(message);
            });
        }else if(person instanceof Tenant){
            landlords.stream().forEach(landlord -> {
                landlord.getMessage(message);
            });
        }
    }
}
