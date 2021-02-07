package com.vk.api.sdk.objects.stats.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.stats.Activity;
import com.vk.api.sdk.objects.stats.Reach;
import com.vk.api.sdk.objects.stats.Views;
import java.util.Objects;

/**
 * GetResponse object
 */
public class GetResponse implements Validable {
    @SerializedName("activity")
    private Activity activity;

    /**
     * Unix timestamp
     */
    @SerializedName("period_from")
    private Integer periodFrom;

    /**
     * Unix timestamp
     */
    @SerializedName("period_to")
    private Integer periodTo;

    @SerializedName("reach")
    private Reach reach;

    @SerializedName("visitors")
    private Views visitors;

    public Activity getActivity() {
        return activity;
    }

    public GetResponse setActivity(Activity activity) {
        this.activity = activity;
        return this;
    }

    public Integer getPeriodFrom() {
        return periodFrom;
    }

    public GetResponse setPeriodFrom(Integer periodFrom) {
        this.periodFrom = periodFrom;
        return this;
    }

    public Integer getPeriodTo() {
        return periodTo;
    }

    public GetResponse setPeriodTo(Integer periodTo) {
        this.periodTo = periodTo;
        return this;
    }

    public Reach getReach() {
        return reach;
    }

    public GetResponse setReach(Reach reach) {
        this.reach = reach;
        return this;
    }

    public Views getVisitors() {
        return visitors;
    }

    public GetResponse setVisitors(Views visitors) {
        this.visitors = visitors;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(visitors, periodTo, activity, reach, periodFrom);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetResponse getResponse = (GetResponse) o;
        return Objects.equals(visitors, getResponse.visitors) &&
                Objects.equals(activity, getResponse.activity) &&
                Objects.equals(reach, getResponse.reach) &&
                Objects.equals(periodFrom, getResponse.periodFrom) &&
                Objects.equals(periodTo, getResponse.periodTo);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetResponse{");
        sb.append("visitors=").append(visitors);
        sb.append(", activity=").append(activity);
        sb.append(", reach=").append(reach);
        sb.append(", periodFrom=").append(periodFrom);
        sb.append(", periodTo=").append(periodTo);
        sb.append('}');
        return sb.toString();
    }
}
