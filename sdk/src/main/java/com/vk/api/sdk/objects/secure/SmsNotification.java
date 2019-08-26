package com.vk.api.sdk.objects.secure;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * SmsNotification object
 */
public class SmsNotification implements Validable {
    /**
     * Application ID
     */
    @SerializedName("app_id")
    private String appId;

    /**
     * Date when message has been sent in Unixtime
     */
    @SerializedName("date")
    private String date;

    /**
     * Notification ID
     */
    @SerializedName("id")
    private String id;

    /**
     * Messsage text
     */
    @SerializedName("message")
    private String message;

    /**
     * User ID
     */
    @SerializedName("user_id")
    private String userId;

    public String getAppId() {
        return appId;
    }

    public SmsNotification setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getDate() {
        return date;
    }

    public SmsNotification setDate(String date) {
        this.date = date;
        return this;
    }

    public String getId() {
        return id;
    }

    public SmsNotification setId(String id) {
        this.id = id;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public SmsNotification setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public SmsNotification setUserId(String userId) {
        this.userId = userId;
        return this;
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
        return Objects.equals(date, smsNotification.date) &&
                Objects.equals(userId, smsNotification.userId) &&
                Objects.equals(id, smsNotification.id) &&
                Objects.equals(message, smsNotification.message) &&
                Objects.equals(appId, smsNotification.appId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SmsNotification{");
        sb.append("date='").append(date).append("'");
        sb.append(", userId='").append(userId).append("'");
        sb.append(", id='").append(id).append("'");
        sb.append(", message='").append(message).append("'");
        sb.append(", appId='").append(appId).append("'");
        sb.append('}');
        return sb.toString();
    }
}
