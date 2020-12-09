package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.ads.LookalikeRequest;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.List;
import java.util.Objects;

/**
 * GetLookalikeRequestsResponse object
 */
public class GetLookalikeRequestsResponse implements Validable {
    /**
     * Total count of found lookalike requests
     */
    @SerializedName("count")
    @Required
    private Integer count;

    /**
     * found lookalike requests
     */
    @SerializedName("items")
    @Required
    private List<LookalikeRequest> items;

    public Integer getCount() {
        return count;
    }

    public GetLookalikeRequestsResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<LookalikeRequest> getItems() {
        return items;
    }

    public GetLookalikeRequestsResponse setItems(List<LookalikeRequest> items) {
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
        GetLookalikeRequestsResponse getLookalikeRequestsResponse = (GetLookalikeRequestsResponse) o;
        return Objects.equals(count, getLookalikeRequestsResponse.count) &&
                Objects.equals(items, getLookalikeRequestsResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetLookalikeRequestsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
