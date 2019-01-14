package jp.personal.gi.order_sample.core.values.金額;

import jp.personal.gi.order_sample.core.support.ValueObject;

import java.util.Objects;

public class 税込金額 implements ValueObject {
    private final 金額 obj金額;

    public 税込金額(金額 obj金額) {
        this.obj金額 = obj金額;
    }

    public static 税込金額 zero(通貨 obj通貨, 金額Factory obj金額Factory) {
        金額 zero = obj金額Factory.createZero(obj通貨);
        return new 税込金額(zero);
    }

    public 税込金額 add(税込金額 obj税込金額) {
        金額 result = this.obj金額.apply(obj税込金額.obj金額);
        return new 税込金額(result);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        税込金額 税込金額 = (税込金額) o;
        return obj金額.equals(税込金額.obj金額);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obj金額);
    }

    @Override
    public String toString() {
        return "税込金額{" +
                "obj金額=" + obj金額 +
                '}';
    }
}
