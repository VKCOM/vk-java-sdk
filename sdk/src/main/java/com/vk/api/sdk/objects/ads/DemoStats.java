package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * DemoStats object
 */
public class DemoStats {
    /**
     * Object ID
     */
    @SerializedName("id")
    private Integer id;

    @SerializedName("type")
    private ObjectType type;

    @SerializedName("stats")
    private DemostatsFormat stats;

    public Integer getId() {
        return id;
    }

    public ObjectType getType() {
        return type;
    }

    public DemostatsFormat getStats() {
        return stats;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stats, id, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DemoStats demoStats = (DemoStats) o;
        return Objects.equals(id, demoStats.id) &&
                Objects.equals(type, demoStats.type) &&
                Objects.equals(stats, demoStats.stats);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DemoStats{");
        sb.append("id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", stats=").append(stats);
        sb.append('}');
        return sb.toString();
    }
}
