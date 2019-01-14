package jp.personal.gi.order_sample.core.models.商品;

import jp.personal.gi.order_sample.core.support.ValueObject;
import jp.personal.gi.order_sample.core.values.金額.個数;
import jp.personal.gi.order_sample.core.values.金額.消費税率;
import jp.personal.gi.order_sample.core.values.金額.消費税額;
import jp.personal.gi.order_sample.core.values.金額.金額;

import java.util.Objects;

public class 単価 implements ValueObject {
    private final 金額 obj金額;

    public 単価(金額 obj金額) {
        this.obj金額 = obj金額;
    }

    public 金額 multiply(個数 obj個数) {
        return this.obj金額.multiply(obj個数);
    }

    public 消費税額 apply(消費税率 obj消費税率) {
        return this.obj金額.to消費税額(obj消費税率);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        単価 単価 = (単価) o;
        return obj金額.equals(単価.obj金額);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obj金額);
    }

    @Override
    public String toString() {
        return "単価{" +
                "obj金額=" + obj金額 +
                '}';
    }
}
