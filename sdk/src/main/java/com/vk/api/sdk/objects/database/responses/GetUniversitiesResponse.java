package com.vk.api.sdk.objects.database.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.database.University;

import java.util.List;
import java.util.Objects;

/**
 * GetUniversitiesResponse object
 */
public class GetUniversitiesResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<University> items;

    public Integer getCount() {
        return count;
    }

    public List<University> getItems() {
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
        GetUniversitiesResponse getUniversitiesResponse = (GetUniversitiesResponse) o;
        return Objects.equals(count, getUniversitiesResponse.count) &&
                Objects.equals(items, getUniversitiesResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetUniversitiesResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
