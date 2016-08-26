package com.vk.api.sdk.objects.friends.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.friends.UserXtrLists;

import java.util.List;
import java.util.Objects;

/**
 * GetFieldsResponse object
 */
public class GetFieldsResponse {
    /**
     * Total friends number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<UserXtrLists> items;

    public Integer getCount() {
        return count;
    }

    public List<UserXtrLists> getItems() {
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
        GetFieldsResponse getFieldsResponse = (GetFieldsResponse) o;
        return Objects.equals(count, getFieldsResponse.count) &&
                Objects.equals(items, getFieldsResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetFieldsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
