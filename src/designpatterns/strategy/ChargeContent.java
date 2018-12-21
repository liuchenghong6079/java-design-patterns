package designpatterns.strategy;

import java.math.BigDecimal;

/**
 * 环境(Context)角色
 *
 * @author lch
 */
public class ChargeContent {

    private ChargeStrategy chargeStrategy;

    /***
     * 初始化化对象采用工厂模式实现
     * @param type
     */
    public ChargeContent(String type) {
        switch (type){
            case "正常收费":
                chargeStrategy = new OriginalCharge();
                break;
            case "打折":
                chargeStrategy = new DiscountCharge();
                break;
            case "满减":
                chargeStrategy = new FullReductionCharge();
                break;
            default:
                chargeStrategy = new OriginalCharge();
        }
    }


    public BigDecimal getPrice(BigDecimal price){
        return chargeStrategy.actualCharge(price);
    }

}
