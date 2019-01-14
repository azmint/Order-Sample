package jp.personal.gi.order_sample.core.values.金額;

import java.math.BigDecimal;

public interface 金額Factory {
    金額 create(BigDecimal value, 通貨 obj通貨);

    default 金額 createZero(通貨 obj通貨) {
        return create(BigDecimal.ZERO, obj通貨);
    }
}
