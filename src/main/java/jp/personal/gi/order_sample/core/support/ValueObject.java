package jp.personal.gi.order_sample.core.support;

public interface ValueObject {
    int hashCode();

    boolean equals(Object obj);

    String toString();
}
