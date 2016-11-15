package com.vk.api.sdk.objects.friends;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * RequestsXtrMessage object
 */
public class RequestsXtrMessage {
    /**
     * User ID
     */
    @SerializedName("user_id")
    private Integer userId;

    /**
     * ID of the user by whom friend has been suggested
     */
    @SerializedName("from")
    private String from;

    @SerializedName("mutual")
    private RequestsManual mutual;

    /**
     * Message sent with a request
     */
    @SerializedName("message")
    private String message;

    public Integer getUserId() {
        return userId;
    }

    public String getFrom() {
        return from;
    }

    public RequestsManual getMutual() {
        return mutual;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mutual, from, message, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestsXtrMessage requestsXtrMessage = (RequestsXtrMessage) o;
        return Objects.equals(userId, requestsXtrMessage.userId) &&
                Objects.equals(from, requestsXtrMessage.from) &&
                Objects.equals(mutual, requestsXtrMessage.mutual) &&
                Objects.equals(message, requestsXtrMessage.message);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RequestsXtrMessage{");
        sb.append("userId=").append(userId);
        sb.append(", from='").append(from).append("'");
        sb.append(", mutual=").append(mutual);
        sb.append(", message='").append(message).append("'");
        sb.append('}');
        return sb.toString();
    }
}
