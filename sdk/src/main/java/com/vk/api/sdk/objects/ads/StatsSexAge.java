package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * StatsSexAge object
 */
public class StatsSexAge {
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
     * Sex and age interval
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
        StatsSexAge statsSexAge = (StatsSexAge) o;
        return Objects.equals(impressionsRate, statsSexAge.impressionsRate) &&
                Objects.equals(clicksRate, statsSexAge.clicksRate) &&
                Objects.equals(value, statsSexAge.value);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StatsSexAge{");
        sb.append("impressionsRate=").append(impressionsRate);
        sb.append(", clicksRate=").append(clicksRate);
        sb.append(", value='").append(value).append("'");
        sb.append('}');
        return sb.toString();
    }
}
