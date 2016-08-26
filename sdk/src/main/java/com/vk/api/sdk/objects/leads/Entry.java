package com.vk.api.sdk.objects.leads;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * Entry object
 */
public class Entry {
    /**
     * User ID
     */
    @SerializedName("uid")
    private Integer uid;

    /**
     * Application ID
     */
    @SerializedName("aid")
    private Integer aid;

    /**
     * Session string ID
     */
    @SerializedName("sid")
    private String sid;

    /**
     * Date when the action has been started in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Action type
     */
    @SerializedName("status")
    private Integer status;

    /**
     * Information whether test mode is enabled
     */
    @SerializedName("test_mode")
    private BoolInt testMode;

    /**
     * Start date in Unixtime (for status=2)
     */
    @SerializedName("start_date")
    private Integer startDate;

    /**
     * Comment text
     */
    @SerializedName("comment")
    private String comment;

    public Integer getUid() {
        return uid;
    }

    public Integer getAid() {
        return aid;
    }

    public String getSid() {
        return sid;
    }

    public Integer getDate() {
        return date;
    }

    public Integer getStatus() {
        return status;
    }

    public boolean isTestMode() {
        return testMode == BoolInt.YES;
    }

    public Integer getStartDate() {
        return startDate;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, uid, testMode, comment, aid, startDate, sid, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry entry = (Entry) o;
        return Objects.equals(uid, entry.uid) &&
                Objects.equals(aid, entry.aid) &&
                Objects.equals(sid, entry.sid) &&
                Objects.equals(date, entry.date) &&
                Objects.equals(status, entry.status) &&
                Objects.equals(testMode, entry.testMode) &&
                Objects.equals(startDate, entry.startDate) &&
                Objects.equals(comment, entry.comment);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Entry{");
        sb.append("uid=").append(uid);
        sb.append(", aid=").append(aid);
        sb.append(", sid='").append(sid).append("'");
        sb.append(", date=").append(date);
        sb.append(", status=").append(status);
        sb.append(", testMode=").append(testMode);
        sb.append(", startDate=").append(startDate);
        sb.append(", comment='").append(comment).append("'");
        sb.append('}');
        return sb.toString();
    }
}
