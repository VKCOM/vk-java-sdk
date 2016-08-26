package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * StatsSex object
 */
public class StatsSex {
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
     * Sex
     */
    @SerializedName("value")
    private StatsSexValue value;

    public Float getImpressionsRate() {
        return impressionsRate;
    }

    public Float getClicksRate() {
        return clicksRate;
    }

    public StatsSexValue getValue() {
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
        StatsSex statsSex = (StatsSex) o;
        return Objects.equals(impressionsRate, statsSex.impressionsRate) &&
                Objects.equals(clicksRate, statsSex.clicksRate) &&
                Objects.equals(value, statsSex.value);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StatsSex{");
        sb.append("impressionsRate=").append(impressionsRate);
        sb.append(", clicksRate=").append(clicksRate);
        sb.append(", value='").append(value).append("'");
        sb.append('}');
        return sb.toString();
    }
}
