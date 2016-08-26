package com.vk.api.sdk.objects.apps.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.apps.Leaderboard;
import com.vk.api.sdk.objects.users.UserMin;

import java.util.List;
import java.util.Objects;

/**
 * GetLeaderboardExtendedResponse object
 */
public class GetLeaderboardExtendedResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<Leaderboard> items;

    @SerializedName("profiles")
    private List<UserMin> profiles;

    public Integer getCount() {
        return count;
    }

    public List<Leaderboard> getItems() {
        return items;
    }

    public List<UserMin> getProfiles() {
        return profiles;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, profiles, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetLeaderboardExtendedResponse getLeaderboardExtendedResponse = (GetLeaderboardExtendedResponse) o;
        return Objects.equals(count, getLeaderboardExtendedResponse.count) &&
                Objects.equals(items, getLeaderboardExtendedResponse.items) &&
                Objects.equals(profiles, getLeaderboardExtendedResponse.profiles);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetLeaderboardExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append(", profiles=").append(profiles);
        sb.append('}');
        return sb.toString();
    }
}
