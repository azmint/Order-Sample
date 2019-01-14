package jp.personal.gi.order_sample.core.models.ユーザー;

import jp.personal.gi.order_sample.core.support.ValueObject;

import java.util.Objects;

public class パスワード implements ValueObject {
    private final String value;

    public パスワード(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        パスワード パスワード = (パスワード) o;
        return value.equals(パスワード.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "パスワード{" +
                "value='" + value + '\'' +
                '}';
    }
}
