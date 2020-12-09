package com.vk.api.sdk.objects.notifications.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.notifications.SendMessageError;
import java.util.Objects;

/**
 * SendMessageResponse object
 */
public class SendMessageResponse implements Validable {
    /**
     * User ID
     */
    @SerializedName("user_id")
    private Integer userId;

    /**
     * Notification status
     */
    @SerializedName("status")
    private Boolean status;

    @SerializedName("error")
    private SendMessageError error;

    public Integer getUserId() {
        return userId;
    }

    public SendMessageResponse setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Boolean getStatus() {
        return status;
    }

    public SendMessageResponse setStatus(Boolean status) {
        this.status = status;
        return this;
    }

    public SendMessageError getError() {
        return error;
    }

    public SendMessageResponse setError(SendMessageError error) {
        this.error = error;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(error, userId, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SendMessageResponse sendMessageResponse = (SendMessageResponse) o;
        return Objects.equals(userId, sendMessageResponse.userId) &&
                Objects.equals(error, sendMessageResponse.error) &&
                Objects.equals(status, sendMessageResponse.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SendMessageResponse{");
        sb.append("userId=").append(userId);
        sb.append(", error=").append(error);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
