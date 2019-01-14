package jp.personal.gi.order_sample.core.models.伝票;

import jp.personal.gi.order_sample.core.support.ValueObject;
import jp.personal.gi.order_sample.core.values.金額.消費税率;

import java.util.Objects;

public class 確定時消費税率 implements ValueObject {
    private final 消費税率 obj消費税率;

    public 確定時消費税率(消費税率 obj消費税率) {
        this.obj消費税率 = obj消費税率;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        確定時消費税率 確定時消費税率 = (確定時消費税率) o;
        return obj消費税率.equals(確定時消費税率.obj消費税率);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obj消費税率);
    }

    @Override
    public String toString() {
        return "確定時消費税率{" +
                "obj消費税率=" + obj消費税率 +
                '}';
    }
}
