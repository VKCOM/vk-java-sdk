package com.vk.api.sdk.objects.users;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * UserXtrCounters object
 */
public class UserXtrCounters extends UserFull implements Validable {
    @SerializedName("counters")
    private UserCounters counters;

    public UserCounters getCounters() {
        return counters;
    }

    public UserXtrCounters setCounters(UserCounters counters) {
        this.counters = counters;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(counters);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserXtrCounters userXtrCounters = (UserXtrCounters) o;
        return Objects.equals(counters, userXtrCounters.counters);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UserXtrCounters{");
        sb.append("counters=").append(counters);
        sb.append('}');
        return sb.toString();
    }
}
