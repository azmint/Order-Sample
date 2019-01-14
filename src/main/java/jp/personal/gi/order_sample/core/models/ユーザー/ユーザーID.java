package jp.personal.gi.order_sample.core.models.ユーザー;

import jp.personal.gi.order_sample.core.support.entity.EntityId;

import java.util.Objects;

public class ユーザーID implements EntityId {
    private final String value;

    public ユーザーID(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ユーザーID ユーザーID = (ユーザーID) o;
        return Objects.equals(value, ユーザーID.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "ユーザーID{" +
                "value='" + value + '\'' +
                '}';
    }
}
