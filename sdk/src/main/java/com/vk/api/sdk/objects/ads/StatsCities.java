package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * StatsCities object
 */
public class StatsCities {
    /**
     * Impressions rate
     */
    @SerializedName("impressions_rate")
    private Float impressionsRate;

    /**
     * Clicks rate
     */
    @SerializedName("clicks_rate")
    private Float clicksRate;

    /**
     * City ID
     */
    @SerializedName("value")
    private Integer value;

    /**
     * City name
     */
    @SerializedName("name")
    private String name;

    public Float getImpressionsRate() {
        return impressionsRate;
    }

    public Float getClicksRate() {
        return clicksRate;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clicksRate, name, impressionsRate, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatsCities statsCities = (StatsCities) o;
        return Objects.equals(impressionsRate, statsCities.impressionsRate) &&
                Objects.equals(clicksRate, statsCities.clicksRate) &&
                Objects.equals(value, statsCities.value) &&
                Objects.equals(name, statsCities.name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StatsCities{");
        sb.append("impressionsRate=").append(impressionsRate);
        sb.append(", clicksRate=").append(clicksRate);
        sb.append(", value=").append(value);
        sb.append(", name='").append(name).append("'");
        sb.append('}');
        return sb.toString();
    }
}
