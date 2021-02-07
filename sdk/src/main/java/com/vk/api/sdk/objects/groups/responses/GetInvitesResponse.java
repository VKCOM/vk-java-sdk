package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.groups.GroupFull;
import java.util.List;
import java.util.Objects;

/**
 * GetInvitesResponse object
 */
public class GetInvitesResponse implements Validable {
    /**
     * Total communities number
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<GroupFull> items;

    public Integer getCount() {
        return count;
    }

    public GetInvitesResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<GroupFull> getItems() {
        return items;
    }

    public GetInvitesResponse setItems(List<GroupFull> items) {
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
        GetInvitesResponse getInvitesResponse = (GetInvitesResponse) o;
        return Objects.equals(count, getInvitesResponse.count) &&
                Objects.equals(items, getInvitesResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetInvitesResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
