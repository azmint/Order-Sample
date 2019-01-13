package jp.personal.gi.pipe_main.core.models.talkroom;

import jp.personal.gi.pipe_main.core.models.user.UserId;
import jp.personal.gi.pipe_main.core.support.ValueObject;

import java.util.Objects;

public class ReceiverId implements ValueObject {
    private final UserId value;

    public ReceiverId(UserId value) {
        this.value = value;
    }

    public UserId getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReceiverId senderId = (ReceiverId) o;
        return Objects.equals(value, senderId.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "ReceiverId{" +
                "value=" + value +
                '}';
    }
}
