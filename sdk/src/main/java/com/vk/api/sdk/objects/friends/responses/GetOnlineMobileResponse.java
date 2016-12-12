package com.vk.api.sdk.objects.friends.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * GetOnlineMobileResponse object
 */
public class GetOnlineMobileResponse {

    @SerializedName("online")
    private List<Integer> online;

    @SerializedName("online_mobile")
    private List<Integer> onlineMobile;

    public List<Integer> getOnline() {
        return online;
    }

    public List<Integer> getOnlineMobile() {
        return onlineMobile;
    }

    @Override
    public int hashCode() {
        return Objects.hash(online, onlineMobile);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetOnlineMobileResponse getOnlineMobileResponse = (GetOnlineMobileResponse) o;
        return Objects.equals(online, getOnlineMobileResponse.online) &&
                Objects.equals(onlineMobile, getOnlineMobileResponse.onlineMobile);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetOnlineMobileResponse{");
        sb.append("online=").append(online);
        sb.append(", onlineMobile=").append(onlineMobile);
        sb.append('}');
        return sb.toString();
    }
}
