package com.vk.api.sdk.objects.secure;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * SmsNotification object
 */
public class SmsNotification {
    /**
     * Notification ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Application ID
     */
    @SerializedName("app_id")
    private Integer appId;

    /**
     * User ID
     */
    @SerializedName("user_id")
    private Integer userId;

    /**
     * Date when message has been sent in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Messsage text
     */
    @SerializedName("message")
    private String message;

    public Integer getId() {
        return id;
    }

    public Integer getAppId() {
        return appId;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, appId, id, message, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmsNotification smsNotification = (SmsNotification) o;
        return Objects.equals(id, smsNotification.id) &&
                Objects.equals(appId, smsNotification.appId) &&
                Objects.equals(userId, smsNotification.userId) &&
                Objects.equals(date, smsNotification.date) &&
                Objects.equals(message, smsNotification.message);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SmsNotification{");
        sb.append("id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", userId=").append(userId);
        sb.append(", date=").append(date);
        sb.append(", message='").append(message).append("'");
        sb.append('}');
        return sb.toString();
    }
}
