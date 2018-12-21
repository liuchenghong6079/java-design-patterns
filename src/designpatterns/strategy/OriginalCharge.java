package designpatterns.strategy;

import java.math.BigDecimal;

/**
 *  具体策略(Concrete Strategy)角色
 *
 *  原价收费
 *
 *  @author lch
 */
public class OriginalCharge implements ChargeStrategy {
    @Override
    public BigDecimal actualCharge(BigDecimal price) {
        return price;
    }
}
