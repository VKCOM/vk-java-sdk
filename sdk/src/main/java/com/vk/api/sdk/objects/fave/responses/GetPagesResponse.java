package com.vk.api.sdk.objects.fave.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.fave.Page;
import java.util.List;
import java.util.Objects;

/**
 * GetPagesResponse object
 */
public class GetPagesResponse implements Validable {
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<Page> items;

    public Integer getCount() {
        return count;
    }

    public GetPagesResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<Page> getItems() {
        return items;
    }

    public GetPagesResponse setItems(List<Page> items) {
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
        GetPagesResponse getPagesResponse = (GetPagesResponse) o;
        return Objects.equals(count, getPagesResponse.count) &&
                Objects.equals(items, getPagesResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetPagesResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
