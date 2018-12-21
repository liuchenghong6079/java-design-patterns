package designpatterns.mediator;

public class App {

    public static void main(String[] args) {
        Mediator mediator = new HousesMediator();
        Person landlordA = new Landlord("房东A", mediator);
        Person landlordB = new Landlord("房东B", mediator);
        Tenant tenant = new Tenant("小李", mediator);
        mediator.registerLandord(landlordA);
        mediator.registerLandord(landlordB);
        mediator.registerTenant(tenant);
        tenant.sendMessage("在天河公园附近租套房子，价格1000元左右一个月");
        System.out.println("-----------------------------------------------------------");
        landlordA.sendMessage("天河公园学院站三巷27号四楼有一房一厅出租  1200/月  光线好 近公交站");

    }
}
