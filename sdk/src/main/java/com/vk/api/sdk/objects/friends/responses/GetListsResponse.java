package com.vk.api.sdk.objects.friends.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.friends.FriendsList;
import java.util.List;
import java.util.Objects;

/**
 * GetListsResponse object
 */
public class GetListsResponse implements Validable {
    /**
     * Total number of friends lists
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<FriendsList> items;

    public Integer getCount() {
        return count;
    }

    public GetListsResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<FriendsList> getItems() {
        return items;
    }

    public GetListsResponse setItems(List<FriendsList> items) {
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
        GetListsResponse getListsResponse = (GetListsResponse) o;
        return Objects.equals(count, getListsResponse.count) &&
                Objects.equals(items, getListsResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetListsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
