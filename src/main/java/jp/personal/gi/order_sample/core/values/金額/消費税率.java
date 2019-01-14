package jp.personal.gi.order_sample.core.values.金額;

import jp.personal.gi.order_sample.core.support.ValueObject;

import java.math.BigDecimal;
import java.util.Objects;

public class 消費税率 implements ValueObject {
    private final BigDecimal value;

    public 消費税率(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal toBigDecimal() {
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        消費税率 消費税率 = (消費税率) o;
        return value.equals(消費税率.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "消費税率{" +
                "value=" + value +
                '}';
    }
}
