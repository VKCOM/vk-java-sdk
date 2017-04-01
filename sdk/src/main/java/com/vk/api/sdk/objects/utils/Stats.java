package com.vk.api.sdk.objects.utils;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Stats object
 */
public class Stats {
    /**
     * Start time
     */
    @SerializedName("timestamp")
    private Integer timestamp;

    /**
     * Total views number
     */
    @SerializedName("views")
    private Integer views;

    public Integer getTimestamp() {
        return timestamp;
    }

    public Integer getViews() {
        return views;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stats stats = (Stats) o;
        return Objects.equals(timestamp, stats.timestamp) &&
                Objects.equals(views, stats.views);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, views);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Stats{");
        sb.append("timestamp=").append(timestamp);
        sb.append(", views=").append(views);
        sb.append('}');
        return sb.toString();
    }
}
