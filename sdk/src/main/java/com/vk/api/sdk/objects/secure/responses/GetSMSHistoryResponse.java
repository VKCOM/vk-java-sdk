package com.vk.api.sdk.objects.secure.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * GetSMSHistoryResponse object
 */
public class GetSMSHistoryResponse implements Validable {
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

    public GetSMSHistoryResponse setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getDate() {
        return date;
    }

    public GetSMSHistoryResponse setDate(String date) {
        this.date = date;
        return this;
    }

    public String getId() {
        return id;
    }

    public GetSMSHistoryResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public GetSMSHistoryResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public GetSMSHistoryResponse setUserId(String userId) {
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
        GetSMSHistoryResponse getSMSHistoryResponse = (GetSMSHistoryResponse) o;
        return Objects.equals(date, getSMSHistoryResponse.date) &&
                Objects.equals(userId, getSMSHistoryResponse.userId) &&
                Objects.equals(id, getSMSHistoryResponse.id) &&
                Objects.equals(message, getSMSHistoryResponse.message) &&
                Objects.equals(appId, getSMSHistoryResponse.appId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetSMSHistoryResponse{");
        sb.append("date='").append(date).append("'");
        sb.append(", userId='").append(userId).append("'");
        sb.append(", id='").append(id).append("'");
        sb.append(", message='").append(message).append("'");
        sb.append(", appId='").append(appId).append("'");
        sb.append('}');
        return sb.toString();
    }
}
