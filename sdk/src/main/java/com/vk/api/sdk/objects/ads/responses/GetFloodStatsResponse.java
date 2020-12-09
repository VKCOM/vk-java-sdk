package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * GetFloodStatsResponse object
 */
public class GetFloodStatsResponse implements Validable {
    /**
     * Requests left
     */
    @SerializedName("left")
    @Required
    private Integer left;

    /**
     * Time to refresh in seconds
     */
    @SerializedName("refresh")
    @Required
    private Integer refresh;

    public Integer getLeft() {
        return left;
    }

    public GetFloodStatsResponse setLeft(Integer left) {
        this.left = left;
        return this;
    }

    public Integer getRefresh() {
        return refresh;
    }

    public GetFloodStatsResponse setRefresh(Integer refresh) {
        this.refresh = refresh;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, refresh);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetFloodStatsResponse getFloodStatsResponse = (GetFloodStatsResponse) o;
        return Objects.equals(left, getFloodStatsResponse.left) &&
                Objects.equals(refresh, getFloodStatsResponse.refresh);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetFloodStatsResponse{");
        sb.append("left=").append(left);
        sb.append(", refresh=").append(refresh);
        sb.append('}');
        return sb.toString();
    }
}
