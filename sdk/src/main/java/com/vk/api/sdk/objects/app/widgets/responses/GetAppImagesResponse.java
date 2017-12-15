package com.vk.api.sdk.objects.app.widgets.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.app.widgets.ImageItem;

import java.util.List;
import java.util.Objects;

public class GetAppImagesResponse {

    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<ImageItem> items;

    public Integer getCount() {
        return count;
    }

    public List<ImageItem> getItems() {
        return items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAppImagesResponse that = (GetAppImagesResponse) o;
        return Objects.equals(count, that.count) &&
                Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetAppImagesResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
