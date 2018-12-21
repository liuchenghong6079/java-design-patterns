package designpatterns.bridge;

/**
 * oracle数据库连接
 * @author lch
 */
public class OracleDriver implements Driver {
    @Override
    public void connection() {
        System.out.println("oracle数据库连接");
    }
}
