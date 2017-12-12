package com.vk.api.sdk.callback.objects.user;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class CallbackUserUnblock {

    @SerializedName("admin_id")
    private Integer adminId;

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("by_end_date")
    private Integer byEndDate;

    public Integer getAdminId() {
        return adminId;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getByEndDate() {
        return byEndDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallbackUserUnblock that = (CallbackUserUnblock) o;
        return Objects.equals(adminId, that.getAdminId()) &&
                Objects.equals(userId, that.getUserId()) &&
                Objects.equals(byEndDate, that.getByEndDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminId, userId, byEndDate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackUserUnblock{");
        sb.append("adminId=").append(adminId);
        sb.append(", userId=").append(userId);
        sb.append(", byEndDate=").append(byEndDate);
        sb.append('}');
        return sb.toString();
    }
}
