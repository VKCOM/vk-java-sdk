package com.vk.api.sdk.objects.users;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * UserXtrCounters object
 */
public class UserXtrCounters extends UserFull {
    @SerializedName("counters")
    private UserCounters counters;

    public UserCounters getCounters() {
        return counters;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), counters);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UserXtrCounters userXtrCounters = (UserXtrCounters) o;
        return Objects.equals(counters, userXtrCounters.counters);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserXtrCounters{");
        sb.append("counters=").append(counters);
        sb.append('}');
        return sb.toString();
    }
}
