package jp.personal.gi.order_sample.port.レシート;

public interface レシート明細Record {
    String get商品名();

    int get注文数();

    int get税込金額();

    int get合計税込金額();
}
