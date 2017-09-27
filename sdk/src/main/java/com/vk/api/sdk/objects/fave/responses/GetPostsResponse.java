package com.vk.api.sdk.objects.fave.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.wall.WallPostFull;

import java.util.List;
import java.util.Objects;

/**
 * GetPostsResponse object
 */
public class GetPostsResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<WallPostFull> items;

    public Integer getCount() {
        return count;
    }

    public List<WallPostFull> getItems() {
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
        GetPostsResponse getPostsResponse = (GetPostsResponse) o;
        return Objects.equals(count, getPostsResponse.count) &&
                Objects.equals(items, getPostsResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetPostsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
