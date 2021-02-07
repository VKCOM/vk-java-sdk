package com.vk.api.sdk.objects.stats.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.stats.SexAge;
import java.util.List;
import java.util.Objects;

/**
 * GetPostReachResponse object
 */
public class GetPostReachResponse implements Validable {
    @SerializedName("post_id")
    private Integer postId;

    /**
     * Hidings number
     */
    @SerializedName("hide")
    private Integer hide;

    /**
     * People have joined the group
     */
    @SerializedName("join_group")
    private Integer joinGroup;

    /**
     * Link clickthrough
     */
    @SerializedName("links")
    private Integer links;

    /**
     * Subscribers reach
     */
    @SerializedName("reach_subscribers")
    private Integer reachSubscribers;

    @SerializedName("reach_subscribers_count")
    private Integer reachSubscribersCount;

    /**
     * Total reach
     */
    @SerializedName("reach_total")
    private Integer reachTotal;

    @SerializedName("reach_total_count")
    private Integer reachTotalCount;

    @SerializedName("reach_viral")
    private Integer reachViral;

    @SerializedName("reach_ads")
    private Integer reachAds;

    /**
     * Reports number
     */
    @SerializedName("report")
    private Integer report;

    /**
     * Clickthrough to community
     */
    @SerializedName("to_group")
    private Integer toGroup;

    /**
     * Unsubscribed members
     */
    @SerializedName("unsubscribe")
    private Integer unsubscribe;

    @SerializedName("sex_age")
    private List<SexAge> sexAge;

    public Integer getPostId() {
        return postId;
    }

    public GetPostReachResponse setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    public Integer getHide() {
        return hide;
    }

    public GetPostReachResponse setHide(Integer hide) {
        this.hide = hide;
        return this;
    }

    public Integer getJoinGroup() {
        return joinGroup;
    }

    public GetPostReachResponse setJoinGroup(Integer joinGroup) {
        this.joinGroup = joinGroup;
        return this;
    }

    public Integer getLinks() {
        return links;
    }

    public GetPostReachResponse setLinks(Integer links) {
        this.links = links;
        return this;
    }

    public Integer getReachSubscribers() {
        return reachSubscribers;
    }

    public GetPostReachResponse setReachSubscribers(Integer reachSubscribers) {
        this.reachSubscribers = reachSubscribers;
        return this;
    }

    public Integer getReachSubscribersCount() {
        return reachSubscribersCount;
    }

    public GetPostReachResponse setReachSubscribersCount(Integer reachSubscribersCount) {
        this.reachSubscribersCount = reachSubscribersCount;
        return this;
    }

    public Integer getReachTotal() {
        return reachTotal;
    }

    public GetPostReachResponse setReachTotal(Integer reachTotal) {
        this.reachTotal = reachTotal;
        return this;
    }

    public Integer getReachTotalCount() {
        return reachTotalCount;
    }

    public GetPostReachResponse setReachTotalCount(Integer reachTotalCount) {
        this.reachTotalCount = reachTotalCount;
        return this;
    }

    public Integer getReachViral() {
        return reachViral;
    }

    public GetPostReachResponse setReachViral(Integer reachViral) {
        this.reachViral = reachViral;
        return this;
    }

    public Integer getReachAds() {
        return reachAds;
    }

    public GetPostReachResponse setReachAds(Integer reachAds) {
        this.reachAds = reachAds;
        return this;
    }

    public Integer getReport() {
        return report;
    }

    public GetPostReachResponse setReport(Integer report) {
        this.report = report;
        return this;
    }

    public Integer getToGroup() {
        return toGroup;
    }

    public GetPostReachResponse setToGroup(Integer toGroup) {
        this.toGroup = toGroup;
        return this;
    }

    public Integer getUnsubscribe() {
        return unsubscribe;
    }

    public GetPostReachResponse setUnsubscribe(Integer unsubscribe) {
        this.unsubscribe = unsubscribe;
        return this;
    }

    public List<SexAge> getSexAge() {
        return sexAge;
    }

    public GetPostReachResponse setSexAge(List<SexAge> sexAge) {
        this.sexAge = sexAge;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(reachViral, reachSubscribers, reachTotal, postId, joinGroup, reachTotalCount, hide, reachSubscribersCount, unsubscribe, report, reachAds, links, sexAge, toGroup);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetPostReachResponse getPostReachResponse = (GetPostReachResponse) o;
        return Objects.equals(toGroup, getPostReachResponse.toGroup) &&
                Objects.equals(reachAds, getPostReachResponse.reachAds) &&
                Objects.equals(sexAge, getPostReachResponse.sexAge) &&
                Objects.equals(reachSubscribersCount, getPostReachResponse.reachSubscribersCount) &&
                Objects.equals(joinGroup, getPostReachResponse.joinGroup) &&
                Objects.equals(reachSubscribers, getPostReachResponse.reachSubscribers) &&
                Objects.equals(hide, getPostReachResponse.hide) &&
                Objects.equals(postId, getPostReachResponse.postId) &&
                Objects.equals(unsubscribe, getPostReachResponse.unsubscribe) &&
                Objects.equals(reachTotal, getPostReachResponse.reachTotal) &&
                Objects.equals(reachViral, getPostReachResponse.reachViral) &&
                Objects.equals(report, getPostReachResponse.report) &&
                Objects.equals(links, getPostReachResponse.links) &&
                Objects.equals(reachTotalCount, getPostReachResponse.reachTotalCount);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetPostReachResponse{");
        sb.append("toGroup=").append(toGroup);
        sb.append(", reachAds=").append(reachAds);
        sb.append(", sexAge=").append(sexAge);
        sb.append(", reachSubscribersCount=").append(reachSubscribersCount);
        sb.append(", joinGroup=").append(joinGroup);
        sb.append(", reachSubscribers=").append(reachSubscribers);
        sb.append(", hide=").append(hide);
        sb.append(", postId=").append(postId);
        sb.append(", unsubscribe=").append(unsubscribe);
        sb.append(", reachTotal=").append(reachTotal);
        sb.append(", reachViral=").append(reachViral);
        sb.append(", report=").append(report);
        sb.append(", links=").append(links);
        sb.append(", reachTotalCount=").append(reachTotalCount);
        sb.append('}');
        return sb.toString();
    }
}
