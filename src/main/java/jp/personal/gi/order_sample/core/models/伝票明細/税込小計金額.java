package jp.personal.gi.order_sample.core.models.伝票明細;

import jp.personal.gi.order_sample.core.support.ValueObject;
import jp.personal.gi.order_sample.core.values.金額.税込金額;

import java.util.Objects;

public class 税込小計金額 implements ValueObject {
    private final 税込金額 obj税込金額;

    public 税込小計金額(税込金額 obj税込金額) {
        this.obj税込金額 = obj税込金額;
    }

    public 合計金額 add(税込小計金額 obj税込小計金額) {
        税込金額 result = this.obj税込金額.add(obj税込小計金額.obj税込金額);
        return new 合計金額(result);
    }

    public 合計金額 add(税込金額 obj税込金額) {
        税込金額 result = this.obj税込金額.add(obj税込金額);
        return new 合計金額(result);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        税込小計金額 小計金額 = (税込小計金額) o;
        return obj税込金額.equals(小計金額.obj税込金額);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obj税込金額);
    }

    @Override
    public String toString() {
        return "小計金額{" +
                "obj税込金額=" + obj税込金額 +
                '}';
    }
}
