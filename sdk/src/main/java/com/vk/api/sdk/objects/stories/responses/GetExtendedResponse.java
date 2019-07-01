package com.vk.api.sdk.objects.stories.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.groups.Group;
import com.vk.api.sdk.objects.stories.Story;
import com.vk.api.sdk.objects.users.User;
import java.util.List;
import java.util.Objects;

/**
 * GetExtendedResponse object
 */
public class GetExtendedResponse implements Validable {
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
    private List<User> profiles;

    @SerializedName("groups")
    @Required
    private List<Group> groups;

    public Integer getCount() {
        return count;
    }

    public GetExtendedResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<List<Story>> getItems() {
        return items;
    }

    public GetExtendedResponse setItems(List<List<Story>> items) {
        this.items = items;
        return this;
    }

    public List<User> getProfiles() {
        return profiles;
    }

    public GetExtendedResponse setProfiles(List<User> profiles) {
        this.profiles = profiles;
        return this;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public GetExtendedResponse setGroups(List<Group> groups) {
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
        GetExtendedResponse getExtendedResponse = (GetExtendedResponse) o;
        return Objects.equals(count, getExtendedResponse.count) &&
                Objects.equals(profiles, getExtendedResponse.profiles) &&
                Objects.equals(groups, getExtendedResponse.groups) &&
                Objects.equals(items, getExtendedResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
