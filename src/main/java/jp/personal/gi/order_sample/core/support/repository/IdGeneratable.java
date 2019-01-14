package jp.personal.gi.order_sample.core.support.repository;

import jp.personal.gi.order_sample.core.support.entity.EntityId;

public interface IdGeneratable<T extends EntityId> {
    T nextId();
}
