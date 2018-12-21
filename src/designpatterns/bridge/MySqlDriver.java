package designpatterns.bridge;

/**
 * mysql数据库连接
 * @author lch
 */
public class MySqlDriver implements Driver {
    @Override
    public void connection() {
        System.out.println("mysql数据库连接");
    }
}
