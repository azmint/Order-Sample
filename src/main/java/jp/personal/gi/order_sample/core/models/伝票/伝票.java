package jp.personal.gi.order_sample.core.models.伝票;

import jp.personal.gi.order_sample.core.models.伝票明細.伝票明細一覧;
import jp.personal.gi.order_sample.core.models.顧客.顧客ID;
import jp.personal.gi.order_sample.core.support.entity.Entity;

public class 伝票 extends Entity<伝票ID> {
    private final 顧客ID obj顧客ID;
    private final 確定時消費税率 obj確定時消費税率;
    private final 伝票明細一覧 obj伝票明細一覧;
    private final 登録日時 obj登録日時;

    public 伝票(伝票ID id, 顧客ID obj顧客ID, 確定時消費税率 obj確定時消費税率, 伝票明細一覧 obj伝票明細一覧, 登録日時 obj登録日時) {
        super(id);
        this.obj顧客ID = obj顧客ID;
        this.obj確定時消費税率 = obj確定時消費税率;
        this.obj伝票明細一覧 = obj伝票明細一覧;
        this.obj登録日時 = obj登録日時;
    }

    @Override
    public String toString() {
        return "伝票{" +
                "id=" + id +
                ", obj顧客ID=" + obj顧客ID +
                ", obj確定時消費税率=" + obj確定時消費税率 +
                ", obj伝票明細一覧=" + obj伝票明細一覧 +
                ", obj登録日時=" + obj登録日時 +
                '}';
    }
}
