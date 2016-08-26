package com.vk.api.sdk.objects.auth.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * ConfirmResponse object
 */
public class ConfirmResponse {
    /**
     * 1 if success
     */
    @SerializedName("success")
    private ConfirmResponseSuccess success;

    /**
     * User ID
     */
    @SerializedName("user_id")
    private Integer userId;

    public ConfirmResponseSuccess getSuccess() {
        return success;
    }

    public Integer getUserId() {
        return userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConfirmResponse confirmResponse = (ConfirmResponse) o;
        return Objects.equals(success, confirmResponse.success) &&
                Objects.equals(userId, confirmResponse.userId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConfirmResponse{");
        sb.append("success=").append(success);
        sb.append(", userId=").append(userId);
        sb.append('}');
        return sb.toString();
    }
}
