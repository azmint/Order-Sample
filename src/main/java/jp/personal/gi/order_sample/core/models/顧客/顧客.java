package jp.personal.gi.order_sample.core.models.顧客;

import jp.personal.gi.order_sample.core.models.ユーザー.ユーザーID;
import jp.personal.gi.order_sample.core.support.entity.Entity;

public class 顧客 extends Entity<顧客ID> {
    private final ユーザーID objユーザーID;

    public 顧客(顧客ID id, ユーザーID objユーザーID) {
        super(id);
        this.objユーザーID = objユーザーID;
    }

    @Override
    public String toString() {
        return "顧客{" +
                "id=" + id +
                ", objユーザーID=" + objユーザーID +
                '}';
    }
}
