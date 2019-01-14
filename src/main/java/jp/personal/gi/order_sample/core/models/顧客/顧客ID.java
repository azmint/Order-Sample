package jp.personal.gi.order_sample.core.models.顧客;

import jp.personal.gi.order_sample.core.support.entity.EntityId;

import java.util.Objects;

public class 顧客ID implements EntityId {
    private final String value;

    public 顧客ID(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        顧客ID 顧客ID = (顧客ID) o;
        return Objects.equals(value, 顧客ID.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "顧客ID{" +
                "value='" + value + '\'' +
                '}';
    }
}
