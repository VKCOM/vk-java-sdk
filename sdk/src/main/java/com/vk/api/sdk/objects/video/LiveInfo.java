package com.vk.api.sdk.objects.video;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * LiveInfo object
 */
public class LiveInfo implements Validable {
    @SerializedName("enabled")
    private BoolInt enabled;

    @SerializedName("is_notifications_blocked")
    private BoolInt isNotificationsBlocked;

    public boolean isEnabled() {
        return enabled == BoolInt.YES;
    }

    public BoolInt getEnabled() {
        return enabled;
    }

    public boolean isNotificationsBlocked() {
        return isNotificationsBlocked == BoolInt.YES;
    }

    public BoolInt getIsNotificationsBlocked() {
        return isNotificationsBlocked;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isNotificationsBlocked, enabled);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LiveInfo liveInfo = (LiveInfo) o;
        return Objects.equals(isNotificationsBlocked, liveInfo.isNotificationsBlocked) &&
                Objects.equals(enabled, liveInfo.enabled);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("LiveInfo{");
        sb.append("isNotificationsBlocked=").append(isNotificationsBlocked);
        sb.append(", enabled=").append(enabled);
        sb.append('}');
        return sb.toString();
    }
}
