package com.vk.api.sdk.objects.stories.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.users.UserMin;

import java.util.List;
import java.util.Objects;

public class GetViewersExtendedResponse {

    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<UserMin> items;

    public Integer getCount() {
        return count;
    }

    public List<UserMin> getItems() {
        return items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetViewersExtendedResponse that = (GetViewersExtendedResponse) o;
        return Objects.equals(count, that.count) &&
            Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetViewersExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
