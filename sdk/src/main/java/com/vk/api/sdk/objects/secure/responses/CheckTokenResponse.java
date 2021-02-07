package com.vk.api.sdk.objects.secure.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * CheckTokenResponse object
 */
public class CheckTokenResponse implements Validable {
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

    /**
     * Returns if successfully processed
     */
    @SerializedName("success")
    private Integer success;

    /**
     * User ID
     */
    @SerializedName("user_id")
    private Integer userId;

    public Integer getDate() {
        return date;
    }

    public CheckTokenResponse setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getExpire() {
        return expire;
    }

    public CheckTokenResponse setExpire(Integer expire) {
        this.expire = expire;
        return this;
    }

    public Integer getSuccess() {
        return success;
    }

    public CheckTokenResponse setSuccess(Integer success) {
        this.success = success;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public CheckTokenResponse setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, success, expire, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckTokenResponse checkTokenResponse = (CheckTokenResponse) o;
        return Objects.equals(date, checkTokenResponse.date) &&
                Objects.equals(userId, checkTokenResponse.userId) &&
                Objects.equals(success, checkTokenResponse.success) &&
                Objects.equals(expire, checkTokenResponse.expire);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CheckTokenResponse{");
        sb.append("date=").append(date);
        sb.append(", userId=").append(userId);
        sb.append(", success=").append(success);
        sb.append(", expire=").append(expire);
        sb.append('}');
        return sb.toString();
    }
}
