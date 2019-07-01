package com.vk.api.sdk.objects.stats;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * WallpostStat object
 */
public class WallpostStat implements Validable {
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

    /**
     * Total reach
     */
    @SerializedName("reach_total")
    private Integer reachTotal;

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

    public Integer getHide() {
        return hide;
    }

    public WallpostStat setHide(Integer hide) {
        this.hide = hide;
        return this;
    }

    public Integer getJoinGroup() {
        return joinGroup;
    }

    public WallpostStat setJoinGroup(Integer joinGroup) {
        this.joinGroup = joinGroup;
        return this;
    }

    public Integer getLinks() {
        return links;
    }

    public WallpostStat setLinks(Integer links) {
        this.links = links;
        return this;
    }

    public Integer getReachSubscribers() {
        return reachSubscribers;
    }

    public WallpostStat setReachSubscribers(Integer reachSubscribers) {
        this.reachSubscribers = reachSubscribers;
        return this;
    }

    public Integer getReachTotal() {
        return reachTotal;
    }

    public WallpostStat setReachTotal(Integer reachTotal) {
        this.reachTotal = reachTotal;
        return this;
    }

    public Integer getReport() {
        return report;
    }

    public WallpostStat setReport(Integer report) {
        this.report = report;
        return this;
    }

    public Integer getToGroup() {
        return toGroup;
    }

    public WallpostStat setToGroup(Integer toGroup) {
        this.toGroup = toGroup;
        return this;
    }

    public Integer getUnsubscribe() {
        return unsubscribe;
    }

    public WallpostStat setUnsubscribe(Integer unsubscribe) {
        this.unsubscribe = unsubscribe;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hide, reachSubscribers, unsubscribe, report, reachTotal, links, joinGroup, toGroup);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WallpostStat wallpostStat = (WallpostStat) o;
        return Objects.equals(joinGroup, wallpostStat.joinGroup) &&
                Objects.equals(reachSubscribers, wallpostStat.reachSubscribers) &&
                Objects.equals(hide, wallpostStat.hide) &&
                Objects.equals(toGroup, wallpostStat.toGroup) &&
                Objects.equals(unsubscribe, wallpostStat.unsubscribe) &&
                Objects.equals(reachTotal, wallpostStat.reachTotal) &&
                Objects.equals(report, wallpostStat.report) &&
                Objects.equals(links, wallpostStat.links);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("WallpostStat{");
        sb.append("joinGroup=").append(joinGroup);
        sb.append(", reachSubscribers=").append(reachSubscribers);
        sb.append(", hide=").append(hide);
        sb.append(", toGroup=").append(toGroup);
        sb.append(", unsubscribe=").append(unsubscribe);
        sb.append(", reachTotal=").append(reachTotal);
        sb.append(", report=").append(report);
        sb.append(", links=").append(links);
        sb.append('}');
        return sb.toString();
    }
}
