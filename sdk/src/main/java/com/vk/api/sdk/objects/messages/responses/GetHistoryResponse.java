package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.messages.Message;

import java.util.List;
import java.util.Objects;

/**
 * GetHistoryResponse object
 */
public class GetHistoryResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    /**
     * Unread dialogs number
     */
    @SerializedName("unread")
    private Integer unread;

    @SerializedName("items")
    private List<Message> items;

    public Integer getCount() {
        return count;
    }

    public Integer getUnread() {
        return unread;
    }

    public List<Message> getItems() {
        return items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unread, count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetHistoryResponse getHistoryResponse = (GetHistoryResponse) o;
        return Objects.equals(count, getHistoryResponse.count) &&
                Objects.equals(unread, getHistoryResponse.unread) &&
                Objects.equals(items, getHistoryResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetHistoryResponse{");
        sb.append("count=").append(count);
        sb.append(", unread=").append(unread);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
