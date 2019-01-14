package jp.personal.gi.order_sample.core.values.金額;

import jp.personal.gi.order_sample.core.support.ValueObject;

import java.util.Objects;

public class 消費税額 implements ValueObject {
    private final 金額 obj金額;

    public 消費税額(金額 obj金額) {
        this.obj金額 = obj金額;
    }

    public 税込金額 addTo(金額 obj金額) {
        金額 result = obj金額.apply(this.obj金額);
        return new 税込金額(result);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        消費税額 消費税額 = (消費税額) o;
        return obj金額.equals(消費税額.obj金額);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obj金額);
    }

    @Override
    public String toString() {
        return "消費税額{" +
                "obj金額=" + obj金額 +
                '}';
    }
}
