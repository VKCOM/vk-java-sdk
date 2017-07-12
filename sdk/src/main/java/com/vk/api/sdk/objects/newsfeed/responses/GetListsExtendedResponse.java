package com.vk.api.sdk.objects.newsfeed.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.newsfeed.NewsfeedListFull;

import java.util.List;
import java.util.Objects;

/**
 * GetListsExtendedResponse object
 */
public class GetListsExtendedResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<NewsfeedListFull> items;

    public Integer getCount() {
        return count;
    }

    public List<NewsfeedListFull> getItems() {
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
        GetListsExtendedResponse getListsResponse = (GetListsExtendedResponse) o;
        return Objects.equals(count, getListsResponse.count) &&
                Objects.equals(items, getListsResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetListsExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
