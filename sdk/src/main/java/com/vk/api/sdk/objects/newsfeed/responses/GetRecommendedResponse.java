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
 * GetRecommendedResponse object
 */
public class GetRecommendedResponse implements Validable {
    @SerializedName("items")
    private List<JsonObject> items;

    @SerializedName("profiles")
    private List<UserFull> profiles;

    @SerializedName("groups")
    private List<GroupFull> groups;

    /**
     * New offset value
     */
    @SerializedName("new_offset")
    private String newOffset;

    /**
     * Next from value
     */
    @SerializedName("next_from")
    private String nextFrom;

    public List<NewsfeedNewsfeedItemOneOf> getItems() {
        return items.stream().map(NewsfeedNewsfeedItemOneOf::new).collect(Collectors.toList());
    }

    public List<UserFull> getProfiles() {
        return profiles;
    }

    public GetRecommendedResponse setProfiles(List<UserFull> profiles) {
        this.profiles = profiles;
        return this;
    }

    public List<GroupFull> getGroups() {
        return groups;
    }

    public GetRecommendedResponse setGroups(List<GroupFull> groups) {
        this.groups = groups;
        return this;
    }

    public String getNewOffset() {
        return newOffset;
    }

    public GetRecommendedResponse setNewOffset(String newOffset) {
        this.newOffset = newOffset;
        return this;
    }

    public String getNextFrom() {
        return nextFrom;
    }

    public GetRecommendedResponse setNextFrom(String nextFrom) {
        this.nextFrom = nextFrom;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(newOffset, profiles, groups, nextFrom, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetRecommendedResponse getRecommendedResponse = (GetRecommendedResponse) o;
        return Objects.equals(nextFrom, getRecommendedResponse.nextFrom) &&
                Objects.equals(newOffset, getRecommendedResponse.newOffset) &&
                Objects.equals(profiles, getRecommendedResponse.profiles) &&
                Objects.equals(groups, getRecommendedResponse.groups) &&
                Objects.equals(items, getRecommendedResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetRecommendedResponse{");
        sb.append("nextFrom='").append(nextFrom).append("'");
        sb.append(", newOffset='").append(newOffset).append("'");
        sb.append(", profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
