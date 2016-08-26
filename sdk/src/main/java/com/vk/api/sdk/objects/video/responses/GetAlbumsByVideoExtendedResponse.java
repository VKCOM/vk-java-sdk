package com.vk.api.sdk.objects.video.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.video.VideoAlbumFull;

import java.util.List;
import java.util.Objects;

/**
 * GetAlbumsByVideoExtendedResponse object
 */
public class GetAlbumsByVideoExtendedResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<VideoAlbumFull> items;

    public Integer getCount() {
        return count;
    }

    public List<VideoAlbumFull> getItems() {
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
        GetAlbumsByVideoExtendedResponse getAlbumsByVideoExtendedResponse = (GetAlbumsByVideoExtendedResponse) o;
        return Objects.equals(count, getAlbumsByVideoExtendedResponse.count) &&
                Objects.equals(items, getAlbumsByVideoExtendedResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetAlbumsByVideoExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
