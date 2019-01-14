package jp.personal.gi.order_sample.core.models.伝票明細;

import jp.personal.gi.order_sample.core.values.金額.消費税率;
import jp.personal.gi.order_sample.core.values.金額.通貨;
import jp.personal.gi.order_sample.core.values.金額.金額Factory;

import java.util.Objects;
import java.util.stream.Stream;

public class 伝票明細一覧 {
    private final Stream<伝票明細> 伝票明細s;

    public 伝票明細一覧(Stream<伝票明細> 伝票明細s) {
        this.伝票明細s = 伝票明細s;
    }

    public 合計金額 to合計金額(通貨 obj通貨, 消費税率 obj消費税率, 金額Factory obj金額Factory) {
        return this.伝票明細s
                .sequential()
                .map(obj伝票明細 -> obj伝票明細.to税込小計金額(obj消費税率))
                .reduce(合計金額.zero(obj通貨, obj金額Factory),
                        (obj合計金額, obj税込合計金額) -> obj合計金額.add(obj税込合計金額),
                        (obj合計金額1, obj合計金額2) -> obj合計金額1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        伝票明細一覧 伝票明細一覧 = (伝票明細一覧) o;
        return 伝票明細s.equals(伝票明細一覧.伝票明細s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(伝票明細s);
    }

    @Override
    public String toString() {
        return "伝票明細一覧{" +
                "伝票明細s=" + 伝票明細s +
                '}';
    }
}
