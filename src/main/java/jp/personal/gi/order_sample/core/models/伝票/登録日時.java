package jp.personal.gi.order_sample.core.models.伝票;

import jp.personal.gi.order_sample.core.support.ValueObject;

import java.time.LocalDateTime;
import java.util.Objects;

public class 登録日時 implements ValueObject {
    private final LocalDateTime value;

    public 登録日時(LocalDateTime value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        登録日時 登録日時 = (登録日時) o;
        return value.equals(登録日時.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "登録日時{" +
                "value=" + value +
                '}';
    }
}
