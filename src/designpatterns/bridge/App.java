package designpatterns.bridge;

public class App {
    public static void main(String[] args) {
        DriverManager driverManager = new MyDriverManager();
        driverManager.setDriver(new MySqlDriver());
        driverManager.connection();
        driverManager.setDriver(new OracleDriver());
        driverManager.connection();
    }

}
