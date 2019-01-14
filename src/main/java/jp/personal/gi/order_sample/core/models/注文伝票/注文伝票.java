package jp.personal.gi.order_sample.core.models.注文伝票;

import jp.personal.gi.order_sample.core.models.伝票.伝票;
import jp.personal.gi.order_sample.core.support.entity.Entity;

public class 注文伝票 extends Entity<注文伝票ID> {
    private final 伝票 obj伝票;

    public 注文伝票(注文伝票ID id, 伝票 obj伝票) {
        super(id);
        this.obj伝票 = obj伝票;
    }

    @Override
    public String toString() {
        return "注文伝票{" +
                "id=" + id +
                ", obj伝票=" + obj伝票 +
                '}';
    }
}
