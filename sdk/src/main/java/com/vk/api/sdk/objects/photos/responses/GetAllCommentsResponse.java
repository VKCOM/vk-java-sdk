package com.vk.api.sdk.objects.photos.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.photos.CommentXtrPid;

import java.util.List;
import java.util.Objects;

/**
 * GetAllCommentsResponse object
 */
public class GetAllCommentsResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<CommentXtrPid> items;

    public Integer getCount() {
        return count;
    }

    public List<CommentXtrPid> getItems() {
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
        GetAllCommentsResponse getAllCommentsResponse = (GetAllCommentsResponse) o;
        return Objects.equals(count, getAllCommentsResponse.count) &&
                Objects.equals(items, getAllCommentsResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetAllCommentsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
