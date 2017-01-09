package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * LongpollMessages objects
 */
public class LongpollMessages {

    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<Message> messages;

    public Integer getCount() {
        return count;
    }

    public List<Message> getMessages() {
        return messages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LongpollMessages that = (LongpollMessages) o;
        return Objects.equals(count, that.count) &&
                Objects.equals(messages, that.messages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, messages);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LongpollMessages{");
        sb.append("count=").append(count);
        sb.append(", messages=").append(messages);
        sb.append('}');
        return sb.toString();
    }
}
