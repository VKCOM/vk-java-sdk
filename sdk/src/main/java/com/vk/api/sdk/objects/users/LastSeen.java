package com.vk.api.sdk.objects.users;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * LastSeen object
 */
public class LastSeen {
    /**
     * Last visit date (in Unix time)
     */
    @SerializedName("time")
    private Integer time;

    /**
     * Type of the platform that used for the last authorization
     */
    @SerializedName("platform")
    private Integer platform;

    public Integer getTime() {
        return time;
    }

    public Integer getPlatform() {
        return platform;
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, platform);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LastSeen lastSeen = (LastSeen) o;
        return Objects.equals(time, lastSeen.time) &&
                Objects.equals(platform, lastSeen.platform);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LastSeen{");
        sb.append("time=").append(time);
        sb.append(", platform=").append(platform);
        sb.append('}');
        return sb.toString();
    }
}
