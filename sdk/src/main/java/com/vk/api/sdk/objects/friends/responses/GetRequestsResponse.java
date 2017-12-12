package com.vk.api.sdk.objects.friends.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * GetRequestsResponse object
 */
public class GetRequestsResponse {
    /**
     * Total requests number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<Integer> items;

    @SerializedName("count_unread")
    private Integer countUnread;

    public Integer getCount() {
        return count;
    }

    public List<Integer> getItems() {
        return items;
    }

    public Integer getCountUnread() {
        return countUnread;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items, countUnread);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetRequestsResponse getRequestsResponse = (GetRequestsResponse) o;
        return Objects.equals(count, getRequestsResponse.count) &&
                Objects.equals(items, getRequestsResponse.items) &&
                Objects.equals(countUnread, getRequestsResponse.countUnread);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetRequestsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append(", countUnread=").append(countUnread);
        sb.append('}');
        return sb.toString();
    }
}
