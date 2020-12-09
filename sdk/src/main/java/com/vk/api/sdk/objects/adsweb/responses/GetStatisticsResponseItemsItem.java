package com.vk.api.sdk.objects.adsweb.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * GetStatisticsResponseItemsItem object
 */
public class GetStatisticsResponseItemsItem implements Validable {
    @SerializedName("site_id")
    private Integer siteId;

    @SerializedName("ad_unit_id")
    private Integer adUnitId;

    @SerializedName("overall_count")
    private Integer overallCount;

    @SerializedName("months_count")
    private Integer monthsCount;

    @SerializedName("month_min")
    private String monthMin;

    @SerializedName("month_max")
    private String monthMax;

    @SerializedName("days_count")
    private Integer daysCount;

    @SerializedName("day_min")
    private String dayMin;

    @SerializedName("day_max")
    private String dayMax;

    @SerializedName("hours_count")
    private Integer hoursCount;

    @SerializedName("hour_min")
    private String hourMin;

    @SerializedName("hour_max")
    private String hourMax;

    public Integer getSiteId() {
        return siteId;
    }

    public GetStatisticsResponseItemsItem setSiteId(Integer siteId) {
        this.siteId = siteId;
        return this;
    }

    public Integer getAdUnitId() {
        return adUnitId;
    }

    public GetStatisticsResponseItemsItem setAdUnitId(Integer adUnitId) {
        this.adUnitId = adUnitId;
        return this;
    }

    public Integer getOverallCount() {
        return overallCount;
    }

    public GetStatisticsResponseItemsItem setOverallCount(Integer overallCount) {
        this.overallCount = overallCount;
        return this;
    }

    public Integer getMonthsCount() {
        return monthsCount;
    }

    public GetStatisticsResponseItemsItem setMonthsCount(Integer monthsCount) {
        this.monthsCount = monthsCount;
        return this;
    }

    public String getMonthMin() {
        return monthMin;
    }

    public GetStatisticsResponseItemsItem setMonthMin(String monthMin) {
        this.monthMin = monthMin;
        return this;
    }

    public String getMonthMax() {
        return monthMax;
    }

    public GetStatisticsResponseItemsItem setMonthMax(String monthMax) {
        this.monthMax = monthMax;
        return this;
    }

    public Integer getDaysCount() {
        return daysCount;
    }

    public GetStatisticsResponseItemsItem setDaysCount(Integer daysCount) {
        this.daysCount = daysCount;
        return this;
    }

    public String getDayMin() {
        return dayMin;
    }

    public GetStatisticsResponseItemsItem setDayMin(String dayMin) {
        this.dayMin = dayMin;
        return this;
    }

    public String getDayMax() {
        return dayMax;
    }

    public GetStatisticsResponseItemsItem setDayMax(String dayMax) {
        this.dayMax = dayMax;
        return this;
    }

    public Integer getHoursCount() {
        return hoursCount;
    }

    public GetStatisticsResponseItemsItem setHoursCount(Integer hoursCount) {
        this.hoursCount = hoursCount;
        return this;
    }

    public String getHourMin() {
        return hourMin;
    }

    public GetStatisticsResponseItemsItem setHourMin(String hourMin) {
        this.hourMin = hourMin;
        return this;
    }

    public String getHourMax() {
        return hourMax;
    }

    public GetStatisticsResponseItemsItem setHourMax(String hourMax) {
        this.hourMax = hourMax;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hoursCount, overallCount, dayMin, hourMax, siteId, monthMin, daysCount, hourMin, dayMax, monthsCount, adUnitId, monthMax);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetStatisticsResponseItemsItem getStatisticsResponseItemsItem = (GetStatisticsResponseItemsItem) o;
        return Objects.equals(adUnitId, getStatisticsResponseItemsItem.adUnitId) &&
                Objects.equals(hourMax, getStatisticsResponseItemsItem.hourMax) &&
                Objects.equals(hoursCount, getStatisticsResponseItemsItem.hoursCount) &&
                Objects.equals(dayMin, getStatisticsResponseItemsItem.dayMin) &&
                Objects.equals(siteId, getStatisticsResponseItemsItem.siteId) &&
                Objects.equals(monthMin, getStatisticsResponseItemsItem.monthMin) &&
                Objects.equals(dayMax, getStatisticsResponseItemsItem.dayMax) &&
                Objects.equals(monthsCount, getStatisticsResponseItemsItem.monthsCount) &&
                Objects.equals(daysCount, getStatisticsResponseItemsItem.daysCount) &&
                Objects.equals(monthMax, getStatisticsResponseItemsItem.monthMax) &&
                Objects.equals(overallCount, getStatisticsResponseItemsItem.overallCount) &&
                Objects.equals(hourMin, getStatisticsResponseItemsItem.hourMin);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetStatisticsResponseItemsItem{");
        sb.append("adUnitId=").append(adUnitId);
        sb.append(", hourMax='").append(hourMax).append("'");
        sb.append(", hoursCount=").append(hoursCount);
        sb.append(", dayMin='").append(dayMin).append("'");
        sb.append(", siteId=").append(siteId);
        sb.append(", monthMin='").append(monthMin).append("'");
        sb.append(", dayMax='").append(dayMax).append("'");
        sb.append(", monthsCount=").append(monthsCount);
        sb.append(", daysCount=").append(daysCount);
        sb.append(", monthMax='").append(monthMax).append("'");
        sb.append(", overallCount=").append(overallCount);
        sb.append(", hourMin='").append(hourMin).append("'");
        sb.append('}');
        return sb.toString();
    }
}
