package jp.personal.gi.order_sample.core.models.伝票明細;

import jp.personal.gi.order_sample.core.models.伝票.伝票ID;
import jp.personal.gi.order_sample.core.models.商品.商品;
import jp.personal.gi.order_sample.core.support.entity.Entity;
import jp.personal.gi.order_sample.core.values.金額.消費税率;
import jp.personal.gi.order_sample.core.values.金額.消費税額;
import jp.personal.gi.order_sample.core.values.金額.金額;

public class 伝票明細 extends Entity<伝票明細ID> {
    private final 伝票ID obj伝票ID;
    private final 商品 obj商品;
    private final 注文数 obj注文数;

    public 伝票明細(伝票明細ID id, 伝票ID obj伝票ID, 商品 obj商品, 注文数 obj注文数) {
        super(id);
        this.obj伝票ID = obj伝票ID;
        this.obj商品 = obj商品;
        this.obj注文数 = obj注文数;
    }

    public 税込小計金額 to税込小計金額(消費税率 obj消費税率) {
        小計金額 obj小計金額 = this.to小計金額();
        return obj小計金額.apply(obj消費税率);
    }

    public 小計金額 to小計金額() {
        金額 result = this.obj商品.to金額(this.obj注文数.to個数());
        return new 小計金額(result);
    }

    public 消費税額 to消費税額(消費税率 obj消費税率) {
        小計金額 obj小計金額 = this.to小計金額();
        return obj小計金額.to消費税額(obj消費税率);
    }

    @Override
    public String toString() {
        return "伝票明細{" +
                "id=" + id +
                ", obj伝票ID=" + obj伝票ID +
                ", obj商品=" + obj商品 +
                ", obj注文数=" + obj注文数 +
                '}';
    }
}
