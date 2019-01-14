package jp.personal.gi.order_sample.core.models.商品;

import jp.personal.gi.order_sample.core.support.entity.Entity;
import jp.personal.gi.order_sample.core.values.金額.個数;
import jp.personal.gi.order_sample.core.values.金額.消費税率;
import jp.personal.gi.order_sample.core.values.金額.消費税額;
import jp.personal.gi.order_sample.core.values.金額.金額;

public class 商品 extends Entity<商品ID> {
    private final 商品名 obj商品名;
    private final 単価 obj単価;

    public 商品(商品ID id, 商品名 obj商品名, 単価 obj単価) {
        super(id);
        this.obj商品名 = obj商品名;
        this.obj単価 = obj単価;
    }

    public 金額 to金額(個数 obj個数) {
        return this.obj単価.multiply(obj個数);
    }

    public 消費税額 to消費税額(消費税率 obj消費税率) {
        return this.obj単価.apply(obj消費税率);
    }

    @Override
    public String toString() {
        return "商品{" +
                "id=" + id +
                ", obj商品名=" + obj商品名 +
                ", obj単価=" + obj単価 +
                '}';
    }
}
