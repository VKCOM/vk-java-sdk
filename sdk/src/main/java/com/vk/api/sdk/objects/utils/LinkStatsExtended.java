package com.vk.api.sdk.objects.utils;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * LinkStatsExtended object
 */
public class LinkStatsExtended {
    /**
     * Object key
     */
    @SerializedName("key")
    private String key;

    /**
     * Object stats
     */
    @SerializedName("stats")
    private List<StatsExtended> stats;

    public String getKey() {
        return key;
    }

    public List<StatsExtended> getStats() {
        return stats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkStatsExtended that = (LinkStatsExtended) o;
        return Objects.equals(key, that.key) &&
                Objects.equals(stats, that.stats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, stats);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LinkStatsExtended{");
        sb.append("key='").append(key).append('\'');
        sb.append(", stats=").append(stats);
        sb.append('}');
        return sb.toString();
    }
}
