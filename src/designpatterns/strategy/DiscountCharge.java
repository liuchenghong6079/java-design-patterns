package designpatterns.strategy;

import java.math.BigDecimal;

/**
 *  具体策略(Concrete Strategy)角色
 *
 *  打折收费
 *
 *  @author lch
 */
public class DiscountCharge implements ChargeStrategy {

    private BigDecimal discount = new BigDecimal(0.8);

    @Override
    public BigDecimal actualCharge(BigDecimal price) {
        return price.multiply(discount);
    }

}
