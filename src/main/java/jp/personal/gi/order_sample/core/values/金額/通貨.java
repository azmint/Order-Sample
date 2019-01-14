package jp.personal.gi.order_sample.core.values.金額;

import jp.personal.gi.order_sample.core.support.ValueObject;

import java.util.Objects;

public class 通貨 implements ValueObject {
    private final String value;

    public 通貨(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        通貨 通貨 = (通貨) o;
        return value.equals(通貨.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "通貨{" +
                "value='" + value + '\'' +
                '}';
    }
}
