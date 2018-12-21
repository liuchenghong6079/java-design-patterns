package designpatterns.strategy;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {
        ChargeContent content = new ChargeContent("满减");
        BigDecimal price = content.getPrice(new BigDecimal(500));
        System.out.println(String.valueOf(price));
    }

}
