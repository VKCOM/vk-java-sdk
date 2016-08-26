package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * FloodStats object
 */
public class FloodStats {
    /**
     * Requests left
     */
    @SerializedName("left")
    private Integer left;

    /**
     * Time to refresh in seconds
     */
    @SerializedName("refresh")
    private Integer refresh;

    public Integer getLeft() {
        return left;
    }

    public Integer getRefresh() {
        return refresh;
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, refresh);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FloodStats floodStats = (FloodStats) o;
        return Objects.equals(left, floodStats.left) &&
                Objects.equals(refresh, floodStats.refresh);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FloodStats{");
        sb.append("left=").append(left);
        sb.append(", refresh=").append(refresh);
        sb.append('}');
        return sb.toString();
    }
}
