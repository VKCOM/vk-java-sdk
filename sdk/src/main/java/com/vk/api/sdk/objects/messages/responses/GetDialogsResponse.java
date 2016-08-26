package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.messages.Dialog;

import java.util.List;
import java.util.Objects;

/**
 * GetDialogsResponse object
 */
public class GetDialogsResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    /**
     * Unread dialogs number
     */
    @SerializedName("unread_dialogs")
    private Integer unreadDialogs;

    @SerializedName("items")
    private List<Dialog> items;

    public Integer getCount() {
        return count;
    }

    public Integer getUnreadDialogs() {
        return unreadDialogs;
    }

    public List<Dialog> getItems() {
        return items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unreadDialogs, count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetDialogsResponse getDialogsResponse = (GetDialogsResponse) o;
        return Objects.equals(count, getDialogsResponse.count) &&
                Objects.equals(unreadDialogs, getDialogsResponse.unreadDialogs) &&
                Objects.equals(items, getDialogsResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetDialogsResponse{");
        sb.append("count=").append(count);
        sb.append(", unreadDialogs=").append(unreadDialogs);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
