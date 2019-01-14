package jp.personal.gi.order_sample.core.values.金額;

import jp.personal.gi.order_sample.core.support.ValueObject;

import java.math.BigDecimal;
import java.util.Objects;

public class 金額 implements ValueObject {
    private final BigDecimal value;
    private final 通貨 obj通貨;
    private final 為替レート obj為替レート;

    public 金額(BigDecimal value, 通貨 obj通貨, 為替レート obj為替レート) {
        this.value = value;
        this.obj通貨 = obj通貨;
        this.obj為替レート = obj為替レート;
    }

    public 消費税額 to消費税額(消費税率 obj消費税率) {
        BigDecimal result = this.value.multiply(obj消費税率.toBigDecimal());
        金額 obj消費税金額 = new 金額(result, this.obj通貨, this.obj為替レート);
        return new 消費税額(obj消費税金額);
    }

    public 金額 multiply(個数 obj個数) {
        BigDecimal result = this.value.multiply(obj個数.toBigDecimal());
        return new 金額(result, this.obj通貨, this.obj為替レート);
    }

    public 税込金額 apply(消費税率 obj消費税率) {
        消費税額 obj消費税額 = this.to消費税額(obj消費税率);
        return obj消費税額.addTo(this);
    }

    public 金額 to(通貨 obj変換先通貨) {
        BigDecimal 比率 = this.obj為替レート.比率(this.obj通貨, obj変換先通貨);
        BigDecimal result = this.value.multiply(比率);
        return new 金額(result, obj変換先通貨, this.obj為替レート);
    }

    public 金額 apply(金額 obj加算金額) {
        金額 obj同じ通貨の加算金額 = obj加算金額.to(this.obj通貨);
        BigDecimal result = this.value.add(obj同じ通貨の加算金額.value);
        return new 金額(result, this.obj通貨, this.obj為替レート);
    }

    public 金額 subtract(金額 obj減算金額) {
        金額 obj同じ通貨の加算金額 = obj減算金額.to(this.obj通貨);
        BigDecimal result = this.value.subtract(obj同じ通貨の加算金額.value);
        return new 金額(result, this.obj通貨, this.obj為替レート);
    }

    public 金額 multiply(金額 obj乗算金額) {
        金額 obj同じ通貨の加算金額 = obj乗算金額.to(this.obj通貨);
        BigDecimal result = this.value.multiply(obj同じ通貨の加算金額.value);
        return new 金額(result, this.obj通貨, this.obj為替レート);
    }

    public 金額 divide(金額 obj除算金額) {
        金額 obj同じ通貨の加算金額 = obj除算金額.to(this.obj通貨);
        BigDecimal result = this.value.divide(obj同じ通貨の加算金額.value);
        return new 金額(result, this.obj通貨, this.obj為替レート);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        金額 金額 = (金額) o;
        return value.equals(金額.value) &&
                obj通貨.equals(金額.obj通貨) &&
                obj為替レート.equals(金額.obj為替レート);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, obj通貨, obj為替レート);
    }

    @Override
    public String toString() {
        return "金額{" +
                "value=" + value +
                ", obj通貨=" + obj通貨 +
                ", obj為替レート=" + obj為替レート +
                '}';
    }
}
