package jp.personal.gi.order_sample.core.models.注文伝票;

import jp.personal.gi.order_sample.core.support.entity.EntityId;

import java.util.Objects;

public class 注文伝票ID implements EntityId {
    private final String value;

    public 注文伝票ID(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        注文伝票ID 注文伝票ID = (注文伝票ID) o;
        return value.equals(注文伝票ID.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "注文伝票ID{" +
                "value='" + value + '\'' +
                '}';
    }
}
