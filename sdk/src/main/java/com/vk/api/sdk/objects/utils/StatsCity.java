package com.vk.api.sdk.objects.utils;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * StatsCity object
 */
public class StatsCity {
    /**
     * City ID
     */
    @SerializedName("city_id")
    private Integer cityId;

    /**
     * Views number
     */
    @SerializedName("views")
    private Integer views;

    public Integer getCityId() {
        return cityId;
    }

    public Integer getViews() {
        return views;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatsCity cities = (StatsCity) o;
        return Objects.equals(cityId, cities.cityId) &&
                Objects.equals(views, cities.views);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityId, views);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StatsCity{");
        sb.append("cityId=").append(cityId);
        sb.append(", views=").append(views);
        sb.append('}');
        return sb.toString();
    }
}
