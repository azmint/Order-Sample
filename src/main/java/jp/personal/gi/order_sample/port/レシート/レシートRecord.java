package jp.personal.gi.order_sample.port.レシート;

import java.util.stream.Stream;

public interface レシートRecord {
    Stream<レシート明細Record> getレシート明細s();

    int get合計金額();

    int get合計金額内消費税額();
}
