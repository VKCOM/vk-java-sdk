package com.vk.api.sdk.objects.leads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * Entry object
 */
public class Entry implements Validable {
    /**
     * Application ID
     */
    @SerializedName("aid")
    private Integer aid;

    /**
     * Comment text
     */
    @SerializedName("comment")
    private String comment;

    /**
     * Date when the action has been started in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Session string ID
     */
    @SerializedName("sid")
    private String sid;

    /**
     * Start date in Unixtime (for status=2)
     */
    @SerializedName("start_date")
    private Integer startDate;

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
     * User ID
     */
    @SerializedName("uid")
    private Integer uid;

    public Integer getAid() {
        return aid;
    }

    public Entry setAid(Integer aid) {
        this.aid = aid;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public Entry setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public Entry setDate(Integer date) {
        this.date = date;
        return this;
    }

    public String getSid() {
        return sid;
    }

    public Entry setSid(String sid) {
        this.sid = sid;
        return this;
    }

    public Integer getStartDate() {
        return startDate;
    }

    public Entry setStartDate(Integer startDate) {
        this.startDate = startDate;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public Entry setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public boolean isTestMode() {
        return testMode == BoolInt.YES;
    }

    public BoolInt getTestMode() {
        return testMode;
    }

    public Integer getUid() {
        return uid;
    }

    public Entry setUid(Integer uid) {
        this.uid = uid;
        return this;
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
        return Objects.equals(date, entry.date) &&
                Objects.equals(uid, entry.uid) &&
                Objects.equals(testMode, entry.testMode) &&
                Objects.equals(comment, entry.comment) &&
                Objects.equals(aid, entry.aid) &&
                Objects.equals(sid, entry.sid) &&
                Objects.equals(startDate, entry.startDate) &&
                Objects.equals(status, entry.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Entry{");
        sb.append("date=").append(date);
        sb.append(", uid=").append(uid);
        sb.append(", testMode=").append(testMode);
        sb.append(", comment='").append(comment).append("'");
        sb.append(", aid=").append(aid);
        sb.append(", sid='").append(sid).append("'");
        sb.append(", startDate=").append(startDate);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
