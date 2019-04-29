package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * BanInfo object
 */
public class BanInfo {
    /**
     * Administrator ID
     */
    @SerializedName("admin_id")
    private Integer adminId;

    /**
     * Comment for a ban
     */
    @SerializedName("comment")
    private String comment;

    /**
     * Date when user has been added to blacklist in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Date when user will be removed from blacklist in Unixtime
     */
    @SerializedName("end_date")
    private Integer endDate;

    @SerializedName("reason")
    private BanInfoReason reason;

    public Integer getAdminId() {
        return adminId;
    }

    public BanInfo setAdminId(Integer adminId) {
        this.adminId = adminId;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public BanInfo setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public BanInfo setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getEndDate() {
        return endDate;
    }

    public BanInfo setEndDate(Integer endDate) {
        this.endDate = endDate;
        return this;
    }

    public BanInfoReason getReason() {
        return reason;
    }

    public BanInfo setReason(BanInfoReason reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, reason, endDate, adminId, comment);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BanInfo banInfo = (BanInfo) o;
        return Objects.equals(date, banInfo.date) &&
                Objects.equals(endDate, banInfo.endDate) &&
                Objects.equals(reason, banInfo.reason) &&
                Objects.equals(adminId, banInfo.adminId) &&
                Objects.equals(comment, banInfo.comment);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("BanInfo{");
        sb.append("date=").append(date);
        sb.append(", endDate=").append(endDate);
        sb.append(", reason=").append(reason);
        sb.append(", adminId=").append(adminId);
        sb.append(", comment='").append(comment).append("'");
        sb.append('}');
        return sb.toString();
    }
}
