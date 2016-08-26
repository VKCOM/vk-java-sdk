package com.vk.api.sdk.objects.newsfeed.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.wall.WallpostToId;

import java.util.List;
import java.util.Objects;

/**
 * GetMentionsResponse object
 */
public class GetMentionsResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<WallpostToId> items;

    public Integer getCount() {
        return count;
    }

    public List<WallpostToId> getItems() {
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
        GetMentionsResponse getMentionsResponse = (GetMentionsResponse) o;
        return Objects.equals(count, getMentionsResponse.count) &&
                Objects.equals(items, getMentionsResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetMentionsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
