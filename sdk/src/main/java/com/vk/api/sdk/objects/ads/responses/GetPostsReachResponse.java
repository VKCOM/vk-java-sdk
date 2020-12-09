package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * GetPostsReachResponse object
 */
public class GetPostsReachResponse implements Validable {
    /**
     * Hides amount
     */
    @SerializedName("hide")
    @Required
    private Integer hide;

    /**
     * Object ID from 'ids' parameter
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Community joins
     */
    @SerializedName("join_group")
    private Integer joinGroup;

    /**
     * Link clicks
     */
    @SerializedName("links")
    @Required
    private Integer links;

    /**
     * Subscribers reach
     */
    @SerializedName("reach_subscribers")
    private Integer reachSubscribers;

    /**
     * Total reach
     */
    @SerializedName("reach_total")
    private Integer reachTotal;

    /**
     * Reports amount
     */
    @SerializedName("report")
    @Required
    private Integer report;

    /**
     * Community clicks
     */
    @SerializedName("to_group")
    private Integer toGroup;

    /**
     * 'Unsubscribe' events amount
     */
    @SerializedName("unsubscribe")
    @Required
    private Integer unsubscribe;

    /**
     * Video views for 100 percent
     */
    @SerializedName("video_views_100p")
    private Integer videoViews100p;

    /**
     * Video views for 25 percent
     */
    @SerializedName("video_views_25p")
    private Integer videoViews25p;

    /**
     * Video views for 3 seconds
     */
    @SerializedName("video_views_3s")
    private Integer videoViews3s;

    /**
     * Video views for 50 percent
     */
    @SerializedName("video_views_50p")
    private Integer videoViews50p;

    /**
     * Video views for 75 percent
     */
    @SerializedName("video_views_75p")
    private Integer videoViews75p;

    /**
     * Video starts
     */
    @SerializedName("video_views_start")
    private Integer videoViewsStart;

    public Integer getHide() {
        return hide;
    }

    public GetPostsReachResponse setHide(Integer hide) {
        this.hide = hide;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GetPostsReachResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getJoinGroup() {
        return joinGroup;
    }

    public GetPostsReachResponse setJoinGroup(Integer joinGroup) {
        this.joinGroup = joinGroup;
        return this;
    }

    public Integer getLinks() {
        return links;
    }

    public GetPostsReachResponse setLinks(Integer links) {
        this.links = links;
        return this;
    }

    public Integer getReachSubscribers() {
        return reachSubscribers;
    }

    public GetPostsReachResponse setReachSubscribers(Integer reachSubscribers) {
        this.reachSubscribers = reachSubscribers;
        return this;
    }

    public Integer getReachTotal() {
        return reachTotal;
    }

    public GetPostsReachResponse setReachTotal(Integer reachTotal) {
        this.reachTotal = reachTotal;
        return this;
    }

    public Integer getReport() {
        return report;
    }

    public GetPostsReachResponse setReport(Integer report) {
        this.report = report;
        return this;
    }

    public Integer getToGroup() {
        return toGroup;
    }

    public GetPostsReachResponse setToGroup(Integer toGroup) {
        this.toGroup = toGroup;
        return this;
    }

    public Integer getUnsubscribe() {
        return unsubscribe;
    }

    public GetPostsReachResponse setUnsubscribe(Integer unsubscribe) {
        this.unsubscribe = unsubscribe;
        return this;
    }

    public Integer getVideoViews100p() {
        return videoViews100p;
    }

    public GetPostsReachResponse setVideoViews100p(Integer videoViews100p) {
        this.videoViews100p = videoViews100p;
        return this;
    }

    public Integer getVideoViews25p() {
        return videoViews25p;
    }

    public GetPostsReachResponse setVideoViews25p(Integer videoViews25p) {
        this.videoViews25p = videoViews25p;
        return this;
    }

    public Integer getVideoViews3s() {
        return videoViews3s;
    }

    public GetPostsReachResponse setVideoViews3s(Integer videoViews3s) {
        this.videoViews3s = videoViews3s;
        return this;
    }

    public Integer getVideoViews50p() {
        return videoViews50p;
    }

    public GetPostsReachResponse setVideoViews50p(Integer videoViews50p) {
        this.videoViews50p = videoViews50p;
        return this;
    }

    public Integer getVideoViews75p() {
        return videoViews75p;
    }

    public GetPostsReachResponse setVideoViews75p(Integer videoViews75p) {
        this.videoViews75p = videoViews75p;
        return this;
    }

    public Integer getVideoViewsStart() {
        return videoViewsStart;
    }

    public GetPostsReachResponse setVideoViewsStart(Integer videoViewsStart) {
        this.videoViewsStart = videoViewsStart;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(reachSubscribers, videoViewsStart, videoViews100p, reachTotal, joinGroup, videoViews50p, hide, videoViews75p, unsubscribe, videoViews25p, report, links, id, toGroup, videoViews3s);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetPostsReachResponse getPostsReachResponse = (GetPostsReachResponse) o;
        return Objects.equals(toGroup, getPostsReachResponse.toGroup) &&
                Objects.equals(videoViews75p, getPostsReachResponse.videoViews75p) &&
                Objects.equals(videoViews25p, getPostsReachResponse.videoViews25p) &&
                Objects.equals(joinGroup, getPostsReachResponse.joinGroup) &&
                Objects.equals(reachSubscribers, getPostsReachResponse.reachSubscribers) &&
                Objects.equals(hide, getPostsReachResponse.hide) &&
                Objects.equals(unsubscribe, getPostsReachResponse.unsubscribe) &&
                Objects.equals(reachTotal, getPostsReachResponse.reachTotal) &&
                Objects.equals(videoViewsStart, getPostsReachResponse.videoViewsStart) &&
                Objects.equals(videoViews50p, getPostsReachResponse.videoViews50p) &&
                Objects.equals(report, getPostsReachResponse.report) &&
                Objects.equals(links, getPostsReachResponse.links) &&
                Objects.equals(id, getPostsReachResponse.id) &&
                Objects.equals(videoViews100p, getPostsReachResponse.videoViews100p) &&
                Objects.equals(videoViews3s, getPostsReachResponse.videoViews3s);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetPostsReachResponse{");
        sb.append("toGroup=").append(toGroup);
        sb.append(", videoViews75p=").append(videoViews75p);
        sb.append(", videoViews25p=").append(videoViews25p);
        sb.append(", joinGroup=").append(joinGroup);
        sb.append(", reachSubscribers=").append(reachSubscribers);
        sb.append(", hide=").append(hide);
        sb.append(", unsubscribe=").append(unsubscribe);
        sb.append(", reachTotal=").append(reachTotal);
        sb.append(", videoViewsStart=").append(videoViewsStart);
        sb.append(", videoViews50p=").append(videoViews50p);
        sb.append(", report=").append(report);
        sb.append(", links=").append(links);
        sb.append(", id=").append(id);
        sb.append(", videoViews100p=").append(videoViews100p);
        sb.append(", videoViews3s=").append(videoViews3s);
        sb.append('}');
        return sb.toString();
    }
}
