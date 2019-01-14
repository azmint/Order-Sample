package jp.personal.gi.order_sample.core.models.伝票明細;

import jp.personal.gi.order_sample.core.support.ValueObject;
import jp.personal.gi.order_sample.core.values.金額.税込金額;
import jp.personal.gi.order_sample.core.values.金額.通貨;
import jp.personal.gi.order_sample.core.values.金額.金額Factory;

import java.util.Objects;

public class 合計金額 implements ValueObject {
    private final 税込金額 obj税込金額;

    public 合計金額(税込金額 obj税込金額) {
        this.obj税込金額 = obj税込金額;
    }

    public static 合計金額 zero(通貨 obj通貨, 金額Factory obj金額Factory) {
        税込金額 zero = 税込金額.zero(obj通貨, obj金額Factory);
        return new 合計金額(zero);
    }

    public 合計金額 add(税込小計金額 obj税込小計金額) {
        return obj税込小計金額.add(this.obj税込金額);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        合計金額 合計金額 = (合計金額) o;
        return obj税込金額.equals(合計金額.obj税込金額);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obj税込金額);
    }

    @Override
    public String toString() {
        return "合計金額{" +
                "obj税込金額=" + obj税込金額 +
                '}';
    }
}
