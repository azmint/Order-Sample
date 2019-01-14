package jp.personal.gi.order_sample.core.models.見積り伝票;

import jp.personal.gi.order_sample.core.support.entity.EntityId;

import java.util.Objects;

public class 見積り伝票ID implements EntityId {
    private final String value;

    public 見積り伝票ID(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        見積り伝票ID 見積り伝票ID = (見積り伝票ID) o;
        return value.equals(見積り伝票ID.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "見積り伝票ID{" +
                "value='" + value + '\'' +
                '}';
    }
}
