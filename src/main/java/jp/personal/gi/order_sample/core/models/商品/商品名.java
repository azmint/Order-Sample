package jp.personal.gi.order_sample.core.models.商品;

import jp.personal.gi.order_sample.core.support.ValueObject;

import java.util.Objects;

public class 商品名 implements ValueObject {
    private final String value;

    public 商品名(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        商品名 商品名 = (商品名) o;
        return value.equals(商品名.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "商品名{" +
                "value='" + value + '\'' +
                '}';
    }
}
