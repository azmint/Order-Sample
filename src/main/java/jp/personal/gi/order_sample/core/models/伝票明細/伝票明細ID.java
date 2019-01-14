package jp.personal.gi.order_sample.core.models.伝票明細;

import jp.personal.gi.order_sample.core.support.entity.EntityId;

import java.util.Objects;

public class 伝票明細ID implements EntityId {
    private final String value;

    public 伝票明細ID(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        伝票明細ID 伝票明細ID = (伝票明細ID) o;
        return value.equals(伝票明細ID.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "伝票明細ID{" +
                "value='" + value + '\'' +
                '}';
    }
}
