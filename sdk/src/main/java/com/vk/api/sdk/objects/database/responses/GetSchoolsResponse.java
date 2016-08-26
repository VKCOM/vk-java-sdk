package com.vk.api.sdk.objects.database.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.database.School;

import java.util.List;
import java.util.Objects;

/**
 * GetSchoolsResponse object
 */
public class GetSchoolsResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<School> items;

    public Integer getCount() {
        return count;
    }

    public List<School> getItems() {
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
        GetSchoolsResponse getSchoolsResponse = (GetSchoolsResponse) o;
        return Objects.equals(count, getSchoolsResponse.count) &&
                Objects.equals(items, getSchoolsResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetSchoolsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
