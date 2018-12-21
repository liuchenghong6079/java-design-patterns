package designpatterns.singleton;

/**
 * 枚举类单例模式
 * @author lch
 */
public enum EnumMode {
    /**
     * 获取实例
     */
    INSTANCE;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say(){
        System.out.println("枚举类单例模式");
    }
}
