package jp.personal.gi.order_sample.core.models.ユーザー;

import jp.personal.gi.order_sample.core.support.ValueObject;

import java.util.Objects;

public class ユーザー名 implements ValueObject {
    private final String value;

    public ユーザー名(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ユーザー名 ユーザー名 = (ユーザー名) o;
        return value.equals(ユーザー名.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "ユーザー名{" +
                "value='" + value + '\'' +
                '}';
    }
}
