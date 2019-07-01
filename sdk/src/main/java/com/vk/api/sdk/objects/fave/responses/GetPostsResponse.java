package com.vk.api.sdk.objects.fave.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.wall.WallpostFull;
import java.util.List;
import java.util.Objects;

/**
 * GetPostsResponse object
 */
public class GetPostsResponse implements Validable {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<WallpostFull> items;

    public Integer getCount() {
        return count;
    }

    public GetPostsResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<WallpostFull> getItems() {
        return items;
    }

    public GetPostsResponse setItems(List<WallpostFull> items) {
        this.items = items;
        return this;
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
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetPostsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
