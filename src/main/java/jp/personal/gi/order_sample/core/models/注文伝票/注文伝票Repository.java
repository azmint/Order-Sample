package jp.personal.gi.order_sample.core.models.注文伝票;

import jp.personal.gi.order_sample.core.support.repository.Deletable;
import jp.personal.gi.order_sample.core.support.repository.IdGeneratable;
import jp.personal.gi.order_sample.core.support.repository.Repository;
import jp.personal.gi.order_sample.core.support.repository.Storable;

public interface 注文伝票Repository extends Repository<注文伝票ID, 注文伝票>,
        Storable<注文伝票>,
        Deletable<注文伝票ID, 注文伝票>,
        IdGeneratable<注文伝票ID> {
}
