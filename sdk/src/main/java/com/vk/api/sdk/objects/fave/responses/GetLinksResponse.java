package com.vk.api.sdk.objects.fave.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.fave.FavesLink;
import java.util.List;
import java.util.Objects;

/**
 * GetLinksResponse object
 */
public class GetLinksResponse implements Validable {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<FavesLink> items;

    public Integer getCount() {
        return count;
    }

    public GetLinksResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<FavesLink> getItems() {
        return items;
    }

    public GetLinksResponse setItems(List<FavesLink> items) {
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
        GetLinksResponse getLinksResponse = (GetLinksResponse) o;
        return Objects.equals(count, getLinksResponse.count) &&
                Objects.equals(items, getLinksResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetLinksResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
