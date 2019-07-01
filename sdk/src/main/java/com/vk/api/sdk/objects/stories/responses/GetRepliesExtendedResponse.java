package com.vk.api.sdk.objects.stories.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.stories.Story;
import com.vk.api.sdk.objects.users.UserFull;
import java.util.List;
import java.util.Objects;

/**
 * GetRepliesExtendedResponse object
 */
public class GetRepliesExtendedResponse implements Validable {
    /**
     * Stories count
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<List<Story>> items;

    @SerializedName("profiles")
    @Required
    private List<UserFull> profiles;

    @SerializedName("groups")
    @Required
    private List<GroupFull> groups;

    public Integer getCount() {
        return count;
    }

    public GetRepliesExtendedResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<List<Story>> getItems() {
        return items;
    }

    public GetRepliesExtendedResponse setItems(List<List<Story>> items) {
        this.items = items;
        return this;
    }

    public List<UserFull> getProfiles() {
        return profiles;
    }

    public GetRepliesExtendedResponse setProfiles(List<UserFull> profiles) {
        this.profiles = profiles;
        return this;
    }

    public List<GroupFull> getGroups() {
        return groups;
    }

    public GetRepliesExtendedResponse setGroups(List<GroupFull> groups) {
        this.groups = groups;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, profiles, groups, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetRepliesExtendedResponse getRepliesExtendedResponse = (GetRepliesExtendedResponse) o;
        return Objects.equals(count, getRepliesExtendedResponse.count) &&
                Objects.equals(profiles, getRepliesExtendedResponse.profiles) &&
                Objects.equals(groups, getRepliesExtendedResponse.groups) &&
                Objects.equals(items, getRepliesExtendedResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetRepliesExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
