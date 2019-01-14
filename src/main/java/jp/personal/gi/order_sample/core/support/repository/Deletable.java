package jp.personal.gi.order_sample.core.support.repository;

import jp.personal.gi.order_sample.core.support.entity.Entity;
import jp.personal.gi.order_sample.core.support.entity.EntityId;

import java.util.stream.Stream;

public interface Deletable<T extends EntityId, E extends Entity<T>> {
    void deleteBy(T id);

    default void delete(E entity) {
        T id = entity.getId();
        this.deleteBy(id);
    }

    void deleteAll(Stream<? extends E> entities);
}
