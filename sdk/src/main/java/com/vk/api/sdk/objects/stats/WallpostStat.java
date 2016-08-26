package com.vk.api.sdk.objects.stats;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * WallpostStat object
 */
public class WallpostStat {
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
     * LInk clickthrough
     */
    @SerializedName("links")
    private Integer links;

    /**
     * Clickthrough  to  community
     */
    @SerializedName("to_group")
    private Integer toGroup;

    /**
     * People have joined the group
     */
    @SerializedName("join_group")
    private Integer joinGroup;

    /**
     * Reports number
     */
    @SerializedName("report")
    private Integer report;

    /**
     * Hidings number
     */
    @SerializedName("hide")
    private Integer hide;

    /**
     * Unsubscribed members
     */
    @SerializedName("unsubscribe")
    private Integer unsubscribe;

    public Integer getReachSubscribers() {
        return reachSubscribers;
    }

    public Integer getReachTotal() {
        return reachTotal;
    }

    public Integer getLinks() {
        return links;
    }

    public Integer getToGroup() {
        return toGroup;
    }

    public Integer getJoinGroup() {
        return joinGroup;
    }

    public Integer getReport() {
        return report;
    }

    public Integer getHide() {
        return hide;
    }

    public Integer getUnsubscribe() {
        return unsubscribe;
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
        return Objects.equals(reachSubscribers, wallpostStat.reachSubscribers) &&
                Objects.equals(reachTotal, wallpostStat.reachTotal) &&
                Objects.equals(links, wallpostStat.links) &&
                Objects.equals(toGroup, wallpostStat.toGroup) &&
                Objects.equals(joinGroup, wallpostStat.joinGroup) &&
                Objects.equals(report, wallpostStat.report) &&
                Objects.equals(hide, wallpostStat.hide) &&
                Objects.equals(unsubscribe, wallpostStat.unsubscribe);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WallpostStat{");
        sb.append("reachSubscribers=").append(reachSubscribers);
        sb.append(", reachTotal=").append(reachTotal);
        sb.append(", links=").append(links);
        sb.append(", toGroup=").append(toGroup);
        sb.append(", joinGroup=").append(joinGroup);
        sb.append(", report=").append(report);
        sb.append(", hide=").append(hide);
        sb.append(", unsubscribe=").append(unsubscribe);
        sb.append('}');
        return sb.toString();
    }
}
