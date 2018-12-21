package designpatterns.bridge;

/**
 * 数据库连接管理
 * @author lch
 */
public abstract class DriverManager {

    private Driver driver;

    public void connection(){
        if(driver == null){
            throw new RuntimeException("没有数据源!!");
        }
        driver.connection();
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
