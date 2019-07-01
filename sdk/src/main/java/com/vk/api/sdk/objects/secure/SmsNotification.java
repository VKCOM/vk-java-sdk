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
    private Integer appId;

    /**
     * Date when message has been sent in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Notification ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Messsage text
     */
    @SerializedName("message")
    private String message;

    /**
     * User ID
     */
    @SerializedName("user_id")
    private Integer userId;

    public Integer getAppId() {
        return appId;
    }

    public SmsNotification setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public SmsNotification setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public SmsNotification setId(Integer id) {
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

    public Integer getUserId() {
        return userId;
    }

    public SmsNotification setUserId(Integer userId) {
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
        sb.append("date=").append(date);
        sb.append(", userId=").append(userId);
        sb.append(", id=").append(id);
        sb.append(", message='").append(message).append("'");
        sb.append(", appId=").append(appId);
        sb.append('}');
        return sb.toString();
    }
}
