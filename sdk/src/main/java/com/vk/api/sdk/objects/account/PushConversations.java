package com.vk.api.sdk.objects.account;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * PushConversations object
 */
public class PushConversations {

    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<PushConversationItem> items;

    public Integer getCount() {
        return count;
    }

    public List<PushConversationItem> getItems() {
        return items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PushConversations that = (PushConversations) o;
        return Objects.equals(count, that.count) &&
                Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PushConversations{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
