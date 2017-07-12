package com.vk.api.sdk.objects.utils;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * StatsCountry object
 */
public class StatsCountry {
    /**
     * Country ID
     */
    @SerializedName("country_id")
    private Integer countryId;

    /**
     * Views number
     */
    @SerializedName("views")
    private Integer views;

    public Integer getCountryId() {
        return countryId;
    }

    public Integer getViews() {
        return views;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatsCountry countries = (StatsCountry) o;
        return Objects.equals(countryId, countries.countryId) &&
                Objects.equals(views, countries.views);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryId, views);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StatsCountry{");
        sb.append("countryId=").append(countryId);
        sb.append(", views=").append(views);
        sb.append('}');
        return sb.toString();
    }
}
