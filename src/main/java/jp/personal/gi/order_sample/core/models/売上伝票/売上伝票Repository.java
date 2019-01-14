package jp.personal.gi.order_sample.core.models.売上伝票;

import jp.personal.gi.order_sample.core.support.repository.Deletable;
import jp.personal.gi.order_sample.core.support.repository.IdGeneratable;
import jp.personal.gi.order_sample.core.support.repository.Repository;
import jp.personal.gi.order_sample.core.support.repository.Storable;

public interface 売上伝票Repository extends Repository<売上伝票ID, 売上伝票>,
        Storable<売上伝票>,
        Deletable<売上伝票ID, 売上伝票>,
        IdGeneratable<売上伝票ID> {
}
