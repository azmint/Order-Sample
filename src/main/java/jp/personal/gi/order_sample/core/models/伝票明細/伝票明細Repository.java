package jp.personal.gi.order_sample.core.models.伝票明細;

import jp.personal.gi.order_sample.core.support.repository.Deletable;
import jp.personal.gi.order_sample.core.support.repository.IdGeneratable;
import jp.personal.gi.order_sample.core.support.repository.Repository;
import jp.personal.gi.order_sample.core.support.repository.Storable;

public interface 伝票明細Repository extends Repository<伝票明細ID, 伝票明細>,
        Storable<伝票明細>,
        Deletable<伝票明細ID, 伝票明細>,
        IdGeneratable<伝票明細ID> {
}
