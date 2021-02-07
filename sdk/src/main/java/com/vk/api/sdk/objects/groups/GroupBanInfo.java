package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * GroupBanInfo object
 */
public class GroupBanInfo implements Validable {
    /**
     * Ban comment
     */
    @SerializedName("comment")
    private String comment;

    /**
     * End date of ban in Unixtime
     */
    @SerializedName("end_date")
    private Integer endDate;

    @SerializedName("reason")
    private BanInfoReason reason;

    public String getComment() {
        return comment;
    }

    public GroupBanInfo setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public Integer getEndDate() {
        return endDate;
    }

    public GroupBanInfo setEndDate(Integer endDate) {
        this.endDate = endDate;
        return this;
    }

    public BanInfoReason getReason() {
        return reason;
    }

    public GroupBanInfo setReason(BanInfoReason reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason, endDate, comment);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupBanInfo groupBanInfo = (GroupBanInfo) o;
        return Objects.equals(endDate, groupBanInfo.endDate) &&
                Objects.equals(reason, groupBanInfo.reason) &&
                Objects.equals(comment, groupBanInfo.comment);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GroupBanInfo{");
        sb.append("endDate=").append(endDate);
        sb.append(", reason=").append(reason);
        sb.append(", comment='").append(comment).append("'");
        sb.append('}');
        return sb.toString();
    }
}
