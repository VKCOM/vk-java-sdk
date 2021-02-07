package com.vk.api.sdk.objects.users;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * OnlineInfo object
 */
public class OnlineInfo implements Validable {
    /**
     * Whether you can see real online status of user or not
     */
    @SerializedName("visible")
    @Required
    private Boolean visible;

    /**
     * Last time we saw user being active
     */
    @SerializedName("last_seen")
    private Integer lastSeen;

    /**
     * Whether user is currently online or not
     */
    @SerializedName("is_online")
    private Boolean isOnline;

    /**
     * Application id from which user is currently online or was last seen online
     */
    @SerializedName("app_id")
    private Integer appId;

    /**
     * Is user online from desktop app or mobile app
     */
    @SerializedName("is_mobile")
    private Boolean isMobile;

    /**
     * In case user online is not visible, it indicates approximate timeframe of user online
     */
    @SerializedName("status")
    private OnlineInfoStatus status;

    public Boolean getVisible() {
        return visible;
    }

    public OnlineInfo setVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }

    public Integer getLastSeen() {
        return lastSeen;
    }

    public OnlineInfo setLastSeen(Integer lastSeen) {
        this.lastSeen = lastSeen;
        return this;
    }

    public Boolean getIsOnline() {
        return isOnline;
    }

    public OnlineInfo setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
        return this;
    }

    public Integer getAppId() {
        return appId;
    }

    public OnlineInfo setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }

    public Boolean getIsMobile() {
        return isMobile;
    }

    public OnlineInfo setIsMobile(Boolean isMobile) {
        this.isMobile = isMobile;
        return this;
    }

    public OnlineInfoStatus getStatus() {
        return status;
    }

    public OnlineInfo setStatus(OnlineInfoStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(visible, lastSeen, appId, isOnline, isMobile, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OnlineInfo onlineInfo = (OnlineInfo) o;
        return Objects.equals(visible, onlineInfo.visible) &&
                Objects.equals(lastSeen, onlineInfo.lastSeen) &&
                Objects.equals(isMobile, onlineInfo.isMobile) &&
                Objects.equals(isOnline, onlineInfo.isOnline) &&
                Objects.equals(appId, onlineInfo.appId) &&
                Objects.equals(status, onlineInfo.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("OnlineInfo{");
        sb.append("visible=").append(visible);
        sb.append(", lastSeen=").append(lastSeen);
        sb.append(", isMobile=").append(isMobile);
        sb.append(", isOnline=").append(isOnline);
        sb.append(", appId=").append(appId);
        sb.append(", status='").append(status).append("'");
        sb.append('}');
        return sb.toString();
    }
}
