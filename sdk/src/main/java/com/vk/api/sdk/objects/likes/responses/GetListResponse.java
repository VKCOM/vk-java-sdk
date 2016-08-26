package com.vk.api.sdk.objects.likes.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * GetListResponse object
 */
public class GetListResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<Integer> items;

    public Integer getCount() {
        return count;
    }

    public List<Integer> getItems() {
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
        GetListResponse getListResponse = (GetListResponse) o;
        return Objects.equals(count, getListResponse.count) &&
                Objects.equals(items, getListResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetListResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
