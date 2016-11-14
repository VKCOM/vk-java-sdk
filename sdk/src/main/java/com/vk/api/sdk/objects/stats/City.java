package com.vk.api.sdk.objects.stats;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Age object
 */
public class City {

    @SerializedName("visitors")
    private Integer visitors;

    /**
     * City ID
     */
    @SerializedName("value")
    private String value;

    @SerializedName("name")
    private String name;

    public Integer getVisitors() {
        return visitors;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(visitors, city.visitors) &&
                Objects.equals(value, city.value) &&
                Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(visitors, value, name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("City{");
        sb.append("visitors=").append(visitors);
        sb.append(", value='").append(value).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
