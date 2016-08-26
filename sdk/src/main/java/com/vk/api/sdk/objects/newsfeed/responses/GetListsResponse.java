package com.vk.api.sdk.objects.newsfeed.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * GetListsResponse object
 */
public class GetListsResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<com.vk.api.sdk.objects.newsfeed.List> items;

    public Integer getCount() {
        return count;
    }

    public List<com.vk.api.sdk.objects.newsfeed.List> getItems() {
        return items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetListsResponse getListsResponse = (GetListsResponse) o;
        return Objects.equals(count, getListsResponse.count) &&
                Objects.equals(items, getListsResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetListsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
