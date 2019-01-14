package jp.personal.gi.order_sample.core.models.顧客;

import jp.personal.gi.order_sample.core.support.repository.Deletable;
import jp.personal.gi.order_sample.core.support.repository.IdGeneratable;
import jp.personal.gi.order_sample.core.support.repository.Repository;
import jp.personal.gi.order_sample.core.support.repository.Storable;

public interface 顧客Repository extends Repository<顧客ID, 顧客>,
        Storable<顧客>,
        Deletable<顧客ID, 顧客>,
        IdGeneratable<顧客ID> {
}
