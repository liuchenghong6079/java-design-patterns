package designpatterns.combination;

public class APP {
    public static void main(String[] args) {
        MenuComponent lunch = new Menu("午餐","");
        MenuComponent beifang = new Menu("北方菜","辣");
        lunch.add(beifang);
        beifang.add(new MenuItem("锅包肉","好吃",9.0D,false));
        MenuComponent nanfang = new Menu("南方菜","甜");
        lunch.add(nanfang);
        nanfang.add(new MenuItem("炒米粉","好吃",5.0D,false));
        lunch.print();
    }
}
