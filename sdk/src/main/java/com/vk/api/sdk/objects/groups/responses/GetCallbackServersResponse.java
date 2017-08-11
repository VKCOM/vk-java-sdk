package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.groups.CallbackServer;

import java.util.List;
import java.util.Objects;

/**
 * GetCallbackServersResponse object
 */
public class GetCallbackServersResponse {

    /**
     * Total servers number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<CallbackServer> items;

    public Integer getCount() {
        return count;
    }

    public List<CallbackServer> getItems() {
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
        GetCallbackServersResponse getCallbackServersResponse = (GetCallbackServersResponse) o;
        return Objects.equals(count, getCallbackServersResponse.count) &&
                Objects.equals(items, getCallbackServersResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCallbackServersResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
