package com.vk.api.sdk.objects.utils;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * LinkStats object
 */
public class LinkStats {
    /**
     * Object key
     */
    @SerializedName("key")
    private String key;

    /**
     * Object stats
     */
    @SerializedName("stats")
    private List<Stats> stats;

    public String getKey() {
        return key;
    }

    public List<Stats> getStats() {
        return stats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkStats linkStats = (LinkStats) o;
        return Objects.equals(key, linkStats.key) &&
                Objects.equals(stats, linkStats.stats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, stats);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LinkStats{");
        sb.append("key='").append(key).append('\'');
        sb.append(", stats=").append(stats);
        sb.append('}');
        return sb.toString();
    }
}
