package com.vk.api.sdk.objects.stats;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
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
    private String value;

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

    @Override
    public int hashCode() {
        return Objects.hash(count, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SexAge sexAge = (SexAge) o;
        return Objects.equals(count, sexAge.count) &&
                Objects.equals(value, sexAge.value);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SexAge{");
        sb.append("count=").append(count);
        sb.append(", value='").append(value).append("'");
        sb.append('}');
        return sb.toString();
    }
}
