package com.vk.api.sdk.objects.video.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.users.UserMin;
import com.vk.api.sdk.objects.wall.WallComment;
import java.util.List;
import java.util.Objects;

/**
 * GetCommentsExtendedResponse object
 */
public class GetCommentsExtendedResponse implements Validable {
    /**
     * Total number
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<WallComment> items;

    @SerializedName("profiles")
    @Required
    private List<UserMin> profiles;

    @SerializedName("groups")
    @Required
    private List<GroupFull> groups;

    public Integer getCount() {
        return count;
    }

    public GetCommentsExtendedResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<WallComment> getItems() {
        return items;
    }

    public GetCommentsExtendedResponse setItems(List<WallComment> items) {
        this.items = items;
        return this;
    }

    public List<UserMin> getProfiles() {
        return profiles;
    }

    public GetCommentsExtendedResponse setProfiles(List<UserMin> profiles) {
        this.profiles = profiles;
        return this;
    }

    public List<GroupFull> getGroups() {
        return groups;
    }

    public GetCommentsExtendedResponse setGroups(List<GroupFull> groups) {
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
        GetCommentsExtendedResponse getCommentsExtendedResponse = (GetCommentsExtendedResponse) o;
        return Objects.equals(count, getCommentsExtendedResponse.count) &&
                Objects.equals(profiles, getCommentsExtendedResponse.profiles) &&
                Objects.equals(groups, getCommentsExtendedResponse.groups) &&
                Objects.equals(items, getCommentsExtendedResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetCommentsExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
