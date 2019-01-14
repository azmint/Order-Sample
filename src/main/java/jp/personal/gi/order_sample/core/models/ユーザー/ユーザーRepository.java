package jp.personal.gi.order_sample.core.models.ユーザー;

import jp.personal.gi.order_sample.core.support.repository.Deletable;
import jp.personal.gi.order_sample.core.support.repository.IdGeneratable;
import jp.personal.gi.order_sample.core.support.repository.Repository;
import jp.personal.gi.order_sample.core.support.repository.Storable;

public interface ユーザーRepository extends Repository<ユーザーID, ユーザー>,
        Storable<ユーザー>,
        Deletable<ユーザーID, ユーザー>,
        IdGeneratable<ユーザーID> {
}
