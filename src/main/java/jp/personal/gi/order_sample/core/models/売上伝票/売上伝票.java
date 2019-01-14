package jp.personal.gi.order_sample.core.models.売上伝票;

import jp.personal.gi.order_sample.core.models.伝票.伝票;
import jp.personal.gi.order_sample.core.support.entity.Entity;

public class 売上伝票 extends Entity<売上伝票ID> {
    private final 伝票 obj伝票;

    public 売上伝票(売上伝票ID id, 伝票 obj伝票) {
        super(id);
        this.obj伝票 = obj伝票;
    }

    @Override
    public String toString() {
        return "売上伝票{" +
                "id=" + id +
                ", obj伝票=" + obj伝票 +
                '}';
    }
}
