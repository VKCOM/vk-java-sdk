package com.vk.api.sdk.objects.stats;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * SexAge object
 */
public class SexAge {

    @SerializedName("visitors")
    private Integer visitors;

    @SerializedName("value")
    private String value;

    public Integer getVisitors() {
        return visitors;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SexAge sexAge = (SexAge) o;
        return Objects.equals(visitors, sexAge.visitors) &&
                value == sexAge.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(visitors, value);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SexAge{");
        sb.append("visitors=").append(visitors);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
