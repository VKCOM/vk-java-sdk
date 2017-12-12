package com.vk.api.sdk.callback.objects.user;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class CallbackUserBlock {

    @SerializedName("admin_id")
    private Integer adminId;

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("unblock_date")
    private Integer unblockDate;

    @SerializedName("reason")
    private Integer reason;

    @SerializedName("comment")
    private String comment;

    public Integer getAdminId() {
        return adminId;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getUnblockDate() {
        return unblockDate;
    }

    public Integer getReason() {
        return reason;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallbackUserBlock that = (CallbackUserBlock) o;
        return Objects.equals(adminId, that.getAdminId()) &&
                Objects.equals(userId, that.getUserId()) &&
                Objects.equals(unblockDate, that.getUnblockDate()) &&
                Objects.equals(reason, that.getReason()) &&
                Objects.equals(comment, that.getComment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminId, userId, unblockDate, reason, comment);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackUserBlock{");
        sb.append("adminId=").append(adminId);
        sb.append(", userId=").append(userId);
        sb.append(", unblockDate=").append(unblockDate);
        sb.append(", reason=").append(reason);
        sb.append(", comment=").append(comment);
        sb.append('}');
        return sb.toString();
    }

}
