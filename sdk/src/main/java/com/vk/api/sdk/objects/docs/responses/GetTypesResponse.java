package com.vk.api.sdk.objects.docs.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.docs.DocTypes;

import java.util.List;
import java.util.Objects;

/**
 * GetTypesResponse object
 */
public class GetTypesResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<DocTypes> items;

    public Integer getCount() {
        return count;
    }

    public List<DocTypes> getItems() {
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
        GetTypesResponse getTypesResponse = (GetTypesResponse) o;
        return Objects.equals(count, getTypesResponse.count) &&
                Objects.equals(items, getTypesResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetTypesResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
