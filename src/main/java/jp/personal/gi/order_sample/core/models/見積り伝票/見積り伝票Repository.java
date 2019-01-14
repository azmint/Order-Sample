package jp.personal.gi.order_sample.core.models.見積り伝票;

import jp.personal.gi.order_sample.core.support.repository.Deletable;
import jp.personal.gi.order_sample.core.support.repository.IdGeneratable;
import jp.personal.gi.order_sample.core.support.repository.Repository;
import jp.personal.gi.order_sample.core.support.repository.Storable;

public interface 見積り伝票Repository extends Repository<見積り伝票ID, 見積り伝票>,
        Storable<見積り伝票>,
        Deletable<見積り伝票ID, 見積り伝票>,
        IdGeneratable<見積り伝票ID> {
}
