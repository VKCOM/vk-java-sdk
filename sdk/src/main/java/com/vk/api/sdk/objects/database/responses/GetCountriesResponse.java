package com.vk.api.sdk.objects.database.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.Country;

import java.util.List;
import java.util.Objects;

/**
 * GetCountriesResponse object
 */
public class GetCountriesResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<Country> items;

    public Integer getCount() {
        return count;
    }

    public List<Country> getItems() {
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
        GetCountriesResponse getCountriesResponse = (GetCountriesResponse) o;
        return Objects.equals(count, getCountriesResponse.count) &&
                Objects.equals(items, getCountriesResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCountriesResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
