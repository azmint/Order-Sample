package jp.personal.gi.order_sample.core.models.伝票;

import jp.personal.gi.order_sample.core.support.repository.Deletable;
import jp.personal.gi.order_sample.core.support.repository.IdGeneratable;
import jp.personal.gi.order_sample.core.support.repository.Repository;
import jp.personal.gi.order_sample.core.support.repository.Storable;

public interface 伝票Repository extends Repository<伝票ID, 伝票>,
        Storable<伝票>,
        Deletable<伝票ID, 伝票>,
        IdGeneratable<伝票ID> {
}
