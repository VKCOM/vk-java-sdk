package com.vk.api.sdk.objects.stats;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 14.11.16.
 */
public class Sex {

    @SerializedName("visitors")
    private Integer visitors;

    @SerializedName("value")
    private SexValue value;

    public Integer getVisitors() {
        return visitors;
    }

    public SexValue getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sex sex = (Sex) o;
        return Objects.equals(visitors, sex.visitors) &&
                value == sex.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(visitors, value);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sex{");
        sb.append("visitors=").append(visitors);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
