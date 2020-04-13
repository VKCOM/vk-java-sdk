package com.vk.api.sdk.objects.photos.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.photos.PhotoXtrRealOffset;
import java.util.List;
import java.util.Objects;

/**
 * GetAllResponse object
 */
public class GetAllResponse implements Validable {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<PhotoXtrRealOffset> items;

    /**
     * Information whether next page is presented
     */
    @SerializedName("more")
    private BoolInt more;

    public Integer getCount() {
        return count;
    }

    public GetAllResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<PhotoXtrRealOffset> getItems() {
        return items;
    }

    public GetAllResponse setItems(List<PhotoXtrRealOffset> items) {
        this.items = items;
        return this;
    }

    public boolean isMore() {
        return more == BoolInt.YESBOOL;
    }

    public BoolInt getMore() {
        return more;
    }

    @Override
    public int hashCode() {
        return Objects.hash(more, count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAllResponse getAllResponse = (GetAllResponse) o;
        return Objects.equals(more, getAllResponse.more) &&
                Objects.equals(count, getAllResponse.count) &&
                Objects.equals(items, getAllResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetAllResponse{");
        sb.append("more=").append(more);
        sb.append(", count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
