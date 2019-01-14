package jp.personal.gi.order_sample.core.values.金額;

import jp.personal.gi.order_sample.core.support.ValueObject;

import java.math.BigDecimal;
import java.util.Objects;

public class 個数 implements ValueObject {
    private final int value;

    public 個数(int value) {
        this.value = value;
    }

    public BigDecimal toBigDecimal() {
        return new BigDecimal(this.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        個数 個数 = (個数) o;
        return value == 個数.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "個数{" +
                "value=" + value +
                '}';
    }
}
