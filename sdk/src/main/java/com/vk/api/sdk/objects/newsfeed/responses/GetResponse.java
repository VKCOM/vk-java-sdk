package com.vk.api.sdk.objects.newsfeed.responses;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.users.UserFull;
import com.vk.api.sdk.oneofs.NewsfeedNewsfeedItemOneOf;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * GetResponse object
 */
public class GetResponse implements Validable {
    @SerializedName("items")
    private List<JsonObject> items;

    @SerializedName("profiles")
    private List<UserFull> profiles;

    @SerializedName("groups")
    private List<GroupFull> groups;

    /**
     * New from value
     */
    @SerializedName("next_from")
    private String nextFrom;

    public List<NewsfeedNewsfeedItemOneOf> getItems() {
        return items.stream().map(NewsfeedNewsfeedItemOneOf::new).collect(Collectors.toList());
    }

    public List<UserFull> getProfiles() {
        return profiles;
    }

    public GetResponse setProfiles(List<UserFull> profiles) {
        this.profiles = profiles;
        return this;
    }

    public List<GroupFull> getGroups() {
        return groups;
    }

    public GetResponse setGroups(List<GroupFull> groups) {
        this.groups = groups;
        return this;
    }

    public String getNextFrom() {
        return nextFrom;
    }

    public GetResponse setNextFrom(String nextFrom) {
        this.nextFrom = nextFrom;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(profiles, groups, nextFrom, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetResponse getResponse = (GetResponse) o;
        return Objects.equals(nextFrom, getResponse.nextFrom) &&
                Objects.equals(profiles, getResponse.profiles) &&
                Objects.equals(groups, getResponse.groups) &&
                Objects.equals(items, getResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetResponse{");
        sb.append("nextFrom='").append(nextFrom).append("'");
        sb.append(", profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
