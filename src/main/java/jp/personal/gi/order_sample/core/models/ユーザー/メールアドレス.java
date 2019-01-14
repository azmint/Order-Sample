package jp.personal.gi.order_sample.core.models.ユーザー;

import jp.personal.gi.order_sample.core.support.ValueObject;

import java.util.Objects;

public class メールアドレス implements ValueObject {
    private final String value;

    public メールアドレス(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        メールアドレス メールアドレス = (メールアドレス) o;
        return value.equals(メールアドレス.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "メールアドレス{" +
                "value='" + value + '\'' +
                '}';
    }
}
