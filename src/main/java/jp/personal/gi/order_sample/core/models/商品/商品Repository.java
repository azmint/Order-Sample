package jp.personal.gi.order_sample.core.models.商品;

import jp.personal.gi.order_sample.core.support.repository.Deletable;
import jp.personal.gi.order_sample.core.support.repository.IdGeneratable;
import jp.personal.gi.order_sample.core.support.repository.Repository;
import jp.personal.gi.order_sample.core.support.repository.Storable;

public interface 商品Repository extends Repository<商品ID, 商品>,
        Storable<商品>,
        Deletable<商品ID, 商品>,
        IdGeneratable<商品ID> {
}
