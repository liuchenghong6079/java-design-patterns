package designpatterns.strategy;

import java.math.BigDecimal;

/**
 *  具体策略(Concrete Strategy)角色
 *
 *  满减收费
 *
 *  @author lch
 */
public class FullReductionCharge implements ChargeStrategy {

    private BigDecimal full = new BigDecimal(300);

    private BigDecimal less = new BigDecimal(100);

    @Override
    public BigDecimal actualCharge(BigDecimal price) {
        if(price.compareTo(full) > 0){
            return price.subtract(less);
        }
        return price;
    }

}
