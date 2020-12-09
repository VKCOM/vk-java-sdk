package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * Stats object
 */
public class Stats implements Validable {
    /**
     * Object ID
     */
    @SerializedName("id")
    private Integer id;

    @SerializedName("stats")
    private StatsFormat stats;

    @SerializedName("type")
    private ObjectType type;

    @SerializedName("views_times")
    private StatsViewsTimes viewsTimes;

    public Integer getId() {
        return id;
    }

    public Stats setId(Integer id) {
        this.id = id;
        return this;
    }

    public StatsFormat getStats() {
        return stats;
    }

    public Stats setStats(StatsFormat stats) {
        this.stats = stats;
        return this;
    }

    public ObjectType getType() {
        return type;
    }

    public Stats setType(ObjectType type) {
        this.type = type;
        return this;
    }

    public StatsViewsTimes getViewsTimes() {
        return viewsTimes;
    }

    public Stats setViewsTimes(StatsViewsTimes viewsTimes) {
        this.viewsTimes = viewsTimes;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stats, id, type, viewsTimes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stats stats = (Stats) o;
        return Objects.equals(stats, stats.stats) &&
                Objects.equals(viewsTimes, stats.viewsTimes) &&
                Objects.equals(id, stats.id) &&
                Objects.equals(type, stats.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Stats{");
        sb.append("stats=").append(stats);
        sb.append(", viewsTimes=").append(viewsTimes);
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
