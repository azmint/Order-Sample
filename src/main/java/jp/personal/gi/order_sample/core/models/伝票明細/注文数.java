package jp.personal.gi.order_sample.core.models.伝票明細;

import jp.personal.gi.order_sample.core.support.ValueObject;
import jp.personal.gi.order_sample.core.values.金額.個数;

import java.util.Objects;

public class 注文数 implements ValueObject {
    private final 個数 obj個数;

    public 注文数(個数 obj個数) {
        this.obj個数 = obj個数;
    }

    public 個数 to個数() {
        return this.obj個数;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        注文数 注文数 = (注文数) o;
        return obj個数.equals(注文数.obj個数);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obj個数);
    }

    @Override
    public String toString() {
        return "注文数{" +
                "obj個数=" + obj個数 +
                '}';
    }
}
