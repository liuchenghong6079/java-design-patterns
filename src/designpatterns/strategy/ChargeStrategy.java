package designpatterns.strategy;

import java.math.BigDecimal;

/**
 * 抽象策略(Strategy)角色
 *
 * 现金收费抽象类
 *
 * @author lch
 */
public interface ChargeStrategy {

    /**
     * 具体收费
     * @param price
     * @return
     */
    public BigDecimal actualCharge(BigDecimal price);

}
