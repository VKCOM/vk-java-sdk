package com.vk.api.sdk.objects.newsfeed.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.wall.WallPostFull;

import java.util.List;
import java.util.Objects;

/**
 * SearchResponse object
 */
public class SearchResponse {
    @SerializedName("items")
    private List<WallPostFull> items;

    public List<WallPostFull> getItems() {
        return items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchResponse searchResponse = (SearchResponse) o;
        return Objects.equals(items, searchResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SearchResponse{");
        sb.append("items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
