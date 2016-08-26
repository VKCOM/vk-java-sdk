package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * StatsAge object
 */
public class StatsAge {
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
     * Age interval
     */
    @SerializedName("value")
    private String value;

    public Float getImpressionsRate() {
        return impressionsRate;
    }

    public Float getClicksRate() {
        return clicksRate;
    }

    public String getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clicksRate, impressionsRate, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatsAge statsAge = (StatsAge) o;
        return Objects.equals(impressionsRate, statsAge.impressionsRate) &&
                Objects.equals(clicksRate, statsAge.clicksRate) &&
                Objects.equals(value, statsAge.value);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StatsAge{");
        sb.append("impressionsRate=").append(impressionsRate);
        sb.append(", clicksRate=").append(clicksRate);
        sb.append(", value='").append(value).append("'");
        sb.append('}');
        return sb.toString();
    }
}
