package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * GetLastActivityResponse object
 */
public class GetLastActivityResponse implements Validable {
    /**
     * Information whether user is online
     */
    @SerializedName("online")
    @Required
    private BoolInt online;

    /**
     * Time when user was online in Unixtime
     */
    @SerializedName("time")
    @Required
    private Integer time;

    public boolean isOnline() {
        return online == BoolInt.YES;
    }

    public BoolInt getOnline() {
        return online;
    }

    public Integer getTime() {
        return time;
    }

    public GetLastActivityResponse setTime(Integer time) {
        this.time = time;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(online, time);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetLastActivityResponse getLastActivityResponse = (GetLastActivityResponse) o;
        return Objects.equals(online, getLastActivityResponse.online) &&
                Objects.equals(time, getLastActivityResponse.time);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetLastActivityResponse{");
        sb.append("online=").append(online);
        sb.append(", time=").append(time);
        sb.append('}');
        return sb.toString();
    }
}
