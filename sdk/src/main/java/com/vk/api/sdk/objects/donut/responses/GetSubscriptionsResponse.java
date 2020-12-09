package com.vk.api.sdk.objects.donut.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.donut.DonatorSubscriptionInfo;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.users.UserFull;
import java.util.List;
import java.util.Objects;

/**
 * GetSubscriptionsResponse object
 */
public class GetSubscriptionsResponse implements Validable {
    @SerializedName("subscriptions")
    @Required
    private List<DonatorSubscriptionInfo> subscriptions;

    @SerializedName("count")
    private Integer count;

    @SerializedName("profiles")
    private List<UserFull> profiles;

    @SerializedName("groups")
    private List<GroupFull> groups;

    public List<DonatorSubscriptionInfo> getSubscriptions() {
        return subscriptions;
    }

    public GetSubscriptionsResponse setSubscriptions(List<DonatorSubscriptionInfo> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public GetSubscriptionsResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<UserFull> getProfiles() {
        return profiles;
    }

    public GetSubscriptionsResponse setProfiles(List<UserFull> profiles) {
        this.profiles = profiles;
        return this;
    }

    public List<GroupFull> getGroups() {
        return groups;
    }

    public GetSubscriptionsResponse setGroups(List<GroupFull> groups) {
        this.groups = groups;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptions, count, profiles, groups);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetSubscriptionsResponse getSubscriptionsResponse = (GetSubscriptionsResponse) o;
        return Objects.equals(subscriptions, getSubscriptionsResponse.subscriptions) &&
                Objects.equals(count, getSubscriptionsResponse.count) &&
                Objects.equals(profiles, getSubscriptionsResponse.profiles) &&
                Objects.equals(groups, getSubscriptionsResponse.groups);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetSubscriptionsResponse{");
        sb.append("subscriptions=").append(subscriptions);
        sb.append(", count=").append(count);
        sb.append(", profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append('}');
        return sb.toString();
    }
}
