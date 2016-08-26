package com.vk.api.sdk.objects.market.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.market.MarketAlbum;

import java.util.List;
import java.util.Objects;

/**
 * GetAlbumsResponse object
 */
public class GetAlbumsResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<MarketAlbum> items;

    public Integer getCount() {
        return count;
    }

    public List<MarketAlbum> getItems() {
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
        GetAlbumsResponse getAlbumsResponse = (GetAlbumsResponse) o;
        return Objects.equals(count, getAlbumsResponse.count) &&
                Objects.equals(items, getAlbumsResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetAlbumsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
