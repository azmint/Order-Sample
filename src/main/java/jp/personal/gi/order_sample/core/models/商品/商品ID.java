package jp.personal.gi.order_sample.core.models.商品;

import jp.personal.gi.order_sample.core.support.entity.EntityId;

import java.util.Objects;

public class 商品ID implements EntityId {
    private final String value;

    public 商品ID(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        商品ID 商品ID = (商品ID) o;
        return Objects.equals(value, 商品ID.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "商品ID{" +
                "value='" + value + '\'' +
                '}';
    }
}
