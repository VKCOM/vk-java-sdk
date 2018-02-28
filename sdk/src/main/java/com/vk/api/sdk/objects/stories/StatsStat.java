package com.vk.api.sdk.objects.stories;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.account.OnoffOptions;

import java.util.Objects;

public class StatsStat {

    @SerializedName("state")
    private OnoffOptions state;

    @SerializedName("count")
    private Integer count;

    public OnoffOptions getState() {
        return state;
    }

    public Integer getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatsStat statsStat = (StatsStat) o;
        return state == statsStat.state &&
            Objects.equals(count, statsStat.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, count);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StatsStat{");
        sb.append("state=").append(state);
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
