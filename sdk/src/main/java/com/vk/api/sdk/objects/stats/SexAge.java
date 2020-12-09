package com.vk.api.sdk.objects.stats;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * SexAge object
 */
public class SexAge implements Validable {
    /**
     * Visitors number
     */
    @SerializedName("count")
    private Integer count;

    /**
     * Sex/age value
     */
    @SerializedName("value")
    @Required
    private String value;

    @SerializedName("reach")
    private Integer reach;

    @SerializedName("reach_subscribers")
    private Integer reachSubscribers;

    @SerializedName("count_subscribers")
    private Integer countSubscribers;

    public Integer getCount() {
        return count;
    }

    public SexAge setCount(Integer count) {
        this.count = count;
        return this;
    }

    public String getValue() {
        return value;
    }

    public SexAge setValue(String value) {
        this.value = value;
        return this;
    }

    public Integer getReach() {
        return reach;
    }

    public SexAge setReach(Integer reach) {
        this.reach = reach;
        return this;
    }

    public Integer getReachSubscribers() {
        return reachSubscribers;
    }

    public SexAge setReachSubscribers(Integer reachSubscribers) {
        this.reachSubscribers = reachSubscribers;
        return this;
    }

    public Integer getCountSubscribers() {
        return countSubscribers;
    }

    public SexAge setCountSubscribers(Integer countSubscribers) {
        this.countSubscribers = countSubscribers;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(countSubscribers, reachSubscribers, reach, count, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SexAge sexAge = (SexAge) o;
        return Objects.equals(reachSubscribers, sexAge.reachSubscribers) &&
                Objects.equals(reach, sexAge.reach) &&
                Objects.equals(countSubscribers, sexAge.countSubscribers) &&
                Objects.equals(count, sexAge.count) &&
                Objects.equals(value, sexAge.value);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SexAge{");
        sb.append("reachSubscribers=").append(reachSubscribers);
        sb.append(", reach=").append(reach);
        sb.append(", countSubscribers=").append(countSubscribers);
        sb.append(", count=").append(count);
        sb.append(", value='").append(value).append("'");
        sb.append('}');
        return sb.toString();
    }
}
