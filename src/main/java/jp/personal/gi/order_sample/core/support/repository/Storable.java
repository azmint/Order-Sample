package jp.personal.gi.order_sample.core.support.repository;

import jp.personal.gi.order_sample.core.support.entity.Entity;

import java.util.stream.Stream;

public interface Storable<E extends Entity<?>> {
    void store(E entity);

    void storeAll(Stream<? extends E> entities);
}
