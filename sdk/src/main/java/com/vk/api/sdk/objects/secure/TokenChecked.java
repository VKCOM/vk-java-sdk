package com.vk.api.sdk.objects.secure;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Objects;

/**
 * TokenChecked object
 */
public class TokenChecked {
    /**
     * Returns if successfully processed
     */
    @SerializedName("success")
    private OkResponse success;

    /**
     * User ID
     */
    @SerializedName("user_id")
    private Integer userId;

    /**
     * Date when access_token has been generated in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Date when access_token will expire in Unixtime
     */
    @SerializedName("expire")
    private Integer expire;

    public OkResponse getSuccess() {
        return success;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getDate() {
        return date;
    }

    public Integer getExpire() {
        return expire;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, success, expire, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TokenChecked tokenChecked = (TokenChecked) o;
        return Objects.equals(success, tokenChecked.success) &&
                Objects.equals(userId, tokenChecked.userId) &&
                Objects.equals(date, tokenChecked.date) &&
                Objects.equals(expire, tokenChecked.expire);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TokenChecked{");
        sb.append("success=").append(success);
        sb.append(", userId=").append(userId);
        sb.append(", date=").append(date);
        sb.append(", expire=").append(expire);
        sb.append('}');
        return sb.toString();
    }
}
