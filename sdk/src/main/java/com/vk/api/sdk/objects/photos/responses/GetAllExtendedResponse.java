package com.vk.api.sdk.objects.photos.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.photos.PhotoFullXtrRealOffset;

import java.util.List;
import java.util.Objects;

/**
 * GetAllExtendedResponse object
 */
public class GetAllExtendedResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<PhotoFullXtrRealOffset> items;

    /**
     * Information whether next page is presented
     */
    @SerializedName("more")
    private BoolInt more;

    public Integer getCount() {
        return count;
    }

    public List<PhotoFullXtrRealOffset> getItems() {
        return items;
    }

    public boolean isMore() {
        return more == BoolInt.YES;
    }

    @Override
    public int hashCode() {
        return Objects.hash(more, count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAllExtendedResponse getAllExtendedResponse = (GetAllExtendedResponse) o;
        return Objects.equals(count, getAllExtendedResponse.count) &&
                Objects.equals(items, getAllExtendedResponse.items) &&
                Objects.equals(more, getAllExtendedResponse.more);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetAllExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append(", more=").append(more);
        sb.append('}');
        return sb.toString();
    }
}
