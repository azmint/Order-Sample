package jp.personal.gi.order_sample.core.support.entity;

import java.util.Objects;

public abstract class Entity<T extends EntityId> {
    protected final T id;

    public Entity(T id) {
        this.id = id;
    }

    @Override
    public abstract String toString();

    public final boolean matches(T id) {
        return Objects.equals(this.getId(), id);
    }

    public final boolean notMatches(T id) {
        return !matches(id);
    }

    public final T getId() {
        return id;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity<?> entity = (Entity<?>) o;
        return Objects.equals(id, entity.id);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(id);
    }
}
