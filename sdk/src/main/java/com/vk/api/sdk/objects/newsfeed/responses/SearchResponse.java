package com.vk.api.sdk.objects.newsfeed.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.wall.WallpostFull;
import java.util.List;
import java.util.Objects;

/**
 * SearchResponse object
 */
public class SearchResponse implements Validable {
    @SerializedName("items")
    private List<WallpostFull> items;

    @SerializedName("suggested_queries")
    private List<String> suggestedQueries;

    public List<WallpostFull> getItems() {
        return items;
    }

    public SearchResponse setItems(List<WallpostFull> items) {
        this.items = items;
        return this;
    }

    public List<String> getSuggestedQueries() {
        return suggestedQueries;
    }

    public SearchResponse setSuggestedQueries(List<String> suggestedQueries) {
        this.suggestedQueries = suggestedQueries;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suggestedQueries, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchResponse searchResponse = (SearchResponse) o;
        return Objects.equals(suggestedQueries, searchResponse.suggestedQueries) &&
                Objects.equals(items, searchResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SearchResponse{");
        sb.append("suggestedQueries='").append(suggestedQueries).append("'");
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
