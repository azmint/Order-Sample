package jp.personal.gi.order_sample.core.models.伝票明細;

import jp.personal.gi.order_sample.core.support.ValueObject;
import jp.personal.gi.order_sample.core.values.金額.消費税率;
import jp.personal.gi.order_sample.core.values.金額.消費税額;
import jp.personal.gi.order_sample.core.values.金額.税込金額;
import jp.personal.gi.order_sample.core.values.金額.金額;

import java.util.Objects;

public class 小計金額 implements ValueObject {
    private final 金額 obj金額;

    public 小計金額(金額 obj金額) {
        this.obj金額 = obj金額;
    }

    public 消費税額 to消費税額(消費税率 obj消費税率) {
        return this.obj金額.to消費税額(obj消費税率);
    }

    public 税込小計金額 apply(消費税率 obj消費税率) {
        税込金額 obj税込金額 = obj金額.apply(obj消費税率);
        return new 税込小計金額(obj税込金額);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        小計金額 小計金額 = (小計金額) o;
        return obj金額.equals(小計金額.obj金額);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obj金額);
    }

    @Override
    public String toString() {
        return "小計金額{" +
                "obj金額=" + obj金額 +
                '}';
    }
}
