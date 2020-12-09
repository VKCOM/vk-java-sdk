package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * StatsViewsTimes object
 */
public class StatsViewsTimes implements Validable {
    @SerializedName("views_ads_times_1")
    private Integer viewsAdsTimes1;

    @SerializedName("views_ads_times_2")
    private Integer viewsAdsTimes2;

    @SerializedName("views_ads_times_3")
    private Integer viewsAdsTimes3;

    @SerializedName("views_ads_times_4")
    private Integer viewsAdsTimes4;

    @SerializedName("views_ads_times_5")
    private String viewsAdsTimes5;

    @SerializedName("views_ads_times_6")
    private Integer viewsAdsTimes6;

    @SerializedName("views_ads_times_7")
    private Integer viewsAdsTimes7;

    @SerializedName("views_ads_times_8")
    private Integer viewsAdsTimes8;

    @SerializedName("views_ads_times_9")
    private Integer viewsAdsTimes9;

    @SerializedName("views_ads_times_10")
    private Integer viewsAdsTimes10;

    @SerializedName("views_ads_times_11_plus")
    private Integer viewsAdsTimes11Plus;

    public Integer getViewsAdsTimes1() {
        return viewsAdsTimes1;
    }

    public StatsViewsTimes setViewsAdsTimes1(Integer viewsAdsTimes1) {
        this.viewsAdsTimes1 = viewsAdsTimes1;
        return this;
    }

    public Integer getViewsAdsTimes2() {
        return viewsAdsTimes2;
    }

    public StatsViewsTimes setViewsAdsTimes2(Integer viewsAdsTimes2) {
        this.viewsAdsTimes2 = viewsAdsTimes2;
        return this;
    }

    public Integer getViewsAdsTimes3() {
        return viewsAdsTimes3;
    }

    public StatsViewsTimes setViewsAdsTimes3(Integer viewsAdsTimes3) {
        this.viewsAdsTimes3 = viewsAdsTimes3;
        return this;
    }

    public Integer getViewsAdsTimes4() {
        return viewsAdsTimes4;
    }

    public StatsViewsTimes setViewsAdsTimes4(Integer viewsAdsTimes4) {
        this.viewsAdsTimes4 = viewsAdsTimes4;
        return this;
    }

    public String getViewsAdsTimes5() {
        return viewsAdsTimes5;
    }

    public StatsViewsTimes setViewsAdsTimes5(String viewsAdsTimes5) {
        this.viewsAdsTimes5 = viewsAdsTimes5;
        return this;
    }

    public Integer getViewsAdsTimes6() {
        return viewsAdsTimes6;
    }

    public StatsViewsTimes setViewsAdsTimes6(Integer viewsAdsTimes6) {
        this.viewsAdsTimes6 = viewsAdsTimes6;
        return this;
    }

    public Integer getViewsAdsTimes7() {
        return viewsAdsTimes7;
    }

    public StatsViewsTimes setViewsAdsTimes7(Integer viewsAdsTimes7) {
        this.viewsAdsTimes7 = viewsAdsTimes7;
        return this;
    }

    public Integer getViewsAdsTimes8() {
        return viewsAdsTimes8;
    }

    public StatsViewsTimes setViewsAdsTimes8(Integer viewsAdsTimes8) {
        this.viewsAdsTimes8 = viewsAdsTimes8;
        return this;
    }

    public Integer getViewsAdsTimes9() {
        return viewsAdsTimes9;
    }

    public StatsViewsTimes setViewsAdsTimes9(Integer viewsAdsTimes9) {
        this.viewsAdsTimes9 = viewsAdsTimes9;
        return this;
    }

    public Integer getViewsAdsTimes10() {
        return viewsAdsTimes10;
    }

    public StatsViewsTimes setViewsAdsTimes10(Integer viewsAdsTimes10) {
        this.viewsAdsTimes10 = viewsAdsTimes10;
        return this;
    }

    public Integer getViewsAdsTimes11Plus() {
        return viewsAdsTimes11Plus;
    }

    public StatsViewsTimes setViewsAdsTimes11Plus(Integer viewsAdsTimes11Plus) {
        this.viewsAdsTimes11Plus = viewsAdsTimes11Plus;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(viewsAdsTimes3, viewsAdsTimes2, viewsAdsTimes1, viewsAdsTimes9, viewsAdsTimes11Plus, viewsAdsTimes8, viewsAdsTimes7, viewsAdsTimes6, viewsAdsTimes5, viewsAdsTimes10, viewsAdsTimes4);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatsViewsTimes statsViewsTimes = (StatsViewsTimes) o;
        return Objects.equals(viewsAdsTimes10, statsViewsTimes.viewsAdsTimes10) &&
                Objects.equals(viewsAdsTimes9, statsViewsTimes.viewsAdsTimes9) &&
                Objects.equals(viewsAdsTimes8, statsViewsTimes.viewsAdsTimes8) &&
                Objects.equals(viewsAdsTimes7, statsViewsTimes.viewsAdsTimes7) &&
                Objects.equals(viewsAdsTimes6, statsViewsTimes.viewsAdsTimes6) &&
                Objects.equals(viewsAdsTimes5, statsViewsTimes.viewsAdsTimes5) &&
                Objects.equals(viewsAdsTimes4, statsViewsTimes.viewsAdsTimes4) &&
                Objects.equals(viewsAdsTimes3, statsViewsTimes.viewsAdsTimes3) &&
                Objects.equals(viewsAdsTimes11Plus, statsViewsTimes.viewsAdsTimes11Plus) &&
                Objects.equals(viewsAdsTimes2, statsViewsTimes.viewsAdsTimes2) &&
                Objects.equals(viewsAdsTimes1, statsViewsTimes.viewsAdsTimes1);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("StatsViewsTimes{");
        sb.append("viewsAdsTimes10=").append(viewsAdsTimes10);
        sb.append(", viewsAdsTimes9=").append(viewsAdsTimes9);
        sb.append(", viewsAdsTimes8=").append(viewsAdsTimes8);
        sb.append(", viewsAdsTimes7=").append(viewsAdsTimes7);
        sb.append(", viewsAdsTimes6=").append(viewsAdsTimes6);
        sb.append(", viewsAdsTimes5='").append(viewsAdsTimes5).append("'");
        sb.append(", viewsAdsTimes4=").append(viewsAdsTimes4);
        sb.append(", viewsAdsTimes3=").append(viewsAdsTimes3);
        sb.append(", viewsAdsTimes11Plus=").append(viewsAdsTimes11Plus);
        sb.append(", viewsAdsTimes2=").append(viewsAdsTimes2);
        sb.append(", viewsAdsTimes1=").append(viewsAdsTimes1);
        sb.append('}');
        return sb.toString();
    }
}
