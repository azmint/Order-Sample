package jp.personal.gi.order_sample.core.values.金額;

import java.math.BigDecimal;

public interface 為替レート {
    BigDecimal 比率(通貨 source, 通貨 destination);
}
