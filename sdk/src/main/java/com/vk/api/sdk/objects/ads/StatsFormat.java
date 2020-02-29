package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * StatsFormat object
 */
public class StatsFormat implements Validable {
    /**
     * Clicks number
     */
    @SerializedName("clicks")
    private Integer clicks;

    /**
     * Day as YYYY-MM-DD
     */
    @SerializedName("day")
    private String day;

    /**
     * Impressions number
     */
    @SerializedName("impressions")
    private Integer impressions;

    /**
     * Events number
     */
    @SerializedName("join_rate")
    private Integer joinRate;

    /**
     * Month as YYYY-MM
     */
    @SerializedName("month")
    private String month;

    /**
     * 1 if period=overall
     */
    @SerializedName("overall")
    private Integer overall;

    /**
     * Reach 
     */
    @SerializedName("reach")
    private Integer reach;

    /**
     * Spent funds
     */
    @SerializedName("spent")
    private Double spent;

    /**
     * Clickthoughs to the advertised site
     */
    @SerializedName("video_clicks_site")
    private Integer videoClicksSite;

    /**
     * Video views number
     */
    @SerializedName("video_views")
    private Integer videoViews;

    /**
     * Video views (full video)
     */
    @SerializedName("video_views_full")
    private Integer videoViewsFull;

    /**
     * Video views (half of video)
     */
    @SerializedName("video_views_half")
    private Integer videoViewsHalf;

    public Integer getClicks() {
        return clicks;
    }

    public StatsFormat setClicks(Integer clicks) {
        this.clicks = clicks;
        return this;
    }

    public String getDay() {
        return day;
    }

    public StatsFormat setDay(String day) {
        this.day = day;
        return this;
    }

    public Integer getImpressions() {
        return impressions;
    }

    public StatsFormat setImpressions(Integer impressions) {
        this.impressions = impressions;
        return this;
    }

    public Integer getJoinRate() {
        return joinRate;
    }

    public StatsFormat setJoinRate(Integer joinRate) {
        this.joinRate = joinRate;
        return this;
    }

    public String getMonth() {
        return month;
    }

    public StatsFormat setMonth(String month) {
        this.month = month;
        return this;
    }

    public Integer getOverall() {
        return overall;
    }

    public StatsFormat setOverall(Integer overall) {
        this.overall = overall;
        return this;
    }

    public Integer getReach() {
        return reach;
    }

    public StatsFormat setReach(Integer reach) {
        this.reach = reach;
        return this;
    }

    public Double getSpent() {
        return spent;
    }

    public StatsFormat setSpent(Double spent) {
        this.spent = spent;
        return this;
    }

    public Integer getVideoClicksSite() {
        return videoClicksSite;
    }

    public StatsFormat setVideoClicksSite(Integer videoClicksSite) {
        this.videoClicksSite = videoClicksSite;
        return this;
    }

    public Integer getVideoViews() {
        return videoViews;
    }

    public StatsFormat setVideoViews(Integer videoViews) {
        this.videoViews = videoViews;
        return this;
    }

    public Integer getVideoViewsFull() {
        return videoViewsFull;
    }

    public StatsFormat setVideoViewsFull(Integer videoViewsFull) {
        this.videoViewsFull = videoViewsFull;
        return this;
    }

    public Integer getVideoViewsHalf() {
        return videoViewsHalf;
    }

    public StatsFormat setVideoViewsHalf(Integer videoViewsHalf) {
        this.videoViewsHalf = videoViewsHalf;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoViewsHalf, month, videoViewsFull, reach, spent, clicks, overall, videoClicksSite, impressions, joinRate, day, videoViews);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatsFormat statsFormat = (StatsFormat) o;
        return Objects.equals(videoViewsFull, statsFormat.videoViewsFull) &&
                Objects.equals(month, statsFormat.month) &&
                Objects.equals(reach, statsFormat.reach) &&
                Objects.equals(videoViews, statsFormat.videoViews) &&
                Objects.equals(spent, statsFormat.spent) &&
                Objects.equals(clicks, statsFormat.clicks) &&
                Objects.equals(overall, statsFormat.overall) &&
                Objects.equals(videoClicksSite, statsFormat.videoClicksSite) &&
                Objects.equals(impressions, statsFormat.impressions) &&
                Objects.equals(videoViewsHalf, statsFormat.videoViewsHalf) &&
                Objects.equals(day, statsFormat.day) &&
                Objects.equals(joinRate, statsFormat.joinRate);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("StatsFormat{");
        sb.append("videoViewsFull=").append(videoViewsFull);
        sb.append(", month='").append(month).append("'");
        sb.append(", reach=").append(reach);
        sb.append(", videoViews=").append(videoViews);
        sb.append(", spent=").append(spent);
        sb.append(", clicks=").append(clicks);
        sb.append(", overall=").append(overall);
        sb.append(", videoClicksSite=").append(videoClicksSite);
        sb.append(", impressions=").append(impressions);
        sb.append(", videoViewsHalf=").append(videoViewsHalf);
        sb.append(", day='").append(day).append("'");
        sb.append(", joinRate=").append(joinRate);
        sb.append('}');
        return sb.toString();
    }
}
