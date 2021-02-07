package com.vk.api.sdk.objects.wall.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.groups.Group;
import com.vk.api.sdk.objects.users.User;
import com.vk.api.sdk.objects.wall.WallComment;
import java.util.List;
import java.util.Objects;

/**
 * GetCommentExtendedResponse object
 */
public class GetCommentExtendedResponse implements Validable {
    @SerializedName("items")
    @Required
    private List<WallComment> items;

    @SerializedName("profiles")
    @Required
    private List<User> profiles;

    @SerializedName("groups")
    @Required
    private List<Group> groups;

    public List<WallComment> getItems() {
        return items;
    }

    public GetCommentExtendedResponse setItems(List<WallComment> items) {
        this.items = items;
        return this;
    }

    public List<User> getProfiles() {
        return profiles;
    }

    public GetCommentExtendedResponse setProfiles(List<User> profiles) {
        this.profiles = profiles;
        return this;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public GetCommentExtendedResponse setGroups(List<Group> groups) {
        this.groups = groups;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(profiles, groups, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCommentExtendedResponse getCommentExtendedResponse = (GetCommentExtendedResponse) o;
        return Objects.equals(profiles, getCommentExtendedResponse.profiles) &&
                Objects.equals(groups, getCommentExtendedResponse.groups) &&
                Objects.equals(items, getCommentExtendedResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetCommentExtendedResponse{");
        sb.append("profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
