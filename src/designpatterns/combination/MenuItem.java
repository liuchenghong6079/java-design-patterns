package designpatterns.combination;

/**
 * 菜单
 * @author lch
 */
public class MenuItem extends MenuComponent {

    private String name;

    private String desc;

    private double price;

    private boolean vegetarian = false;

    public MenuItem(String name, String desc, double price, boolean vegetarian) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.vegetarian = vegetarian;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return desc;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                '}';
    }
}
