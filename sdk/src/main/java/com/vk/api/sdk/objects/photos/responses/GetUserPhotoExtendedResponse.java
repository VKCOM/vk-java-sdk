package com.vk.api.sdk.objects.photos.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.photos.PhotoFull;

import java.util.List;
import java.util.Objects;

/**
 * GetUserPhotoExtendedResponse object
 */
public class GetUserPhotoExtendedResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<PhotoFull> items;

    public Integer getCount() {
        return count;
    }

    public List<PhotoFull> getItems() {
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
        GetUserPhotoExtendedResponse getUserPhotoExtendedResponse = (GetUserPhotoExtendedResponse) o;
        return Objects.equals(count, getUserPhotoExtendedResponse.count) &&
                Objects.equals(items, getUserPhotoExtendedResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetUserPhotoExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
