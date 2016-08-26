package com.vk.api.sdk.objects.newsfeed.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.newsfeed.NewsfeedItem;
import com.vk.api.sdk.objects.users.UserFull;

import java.util.List;
import java.util.Objects;

/**
 * GetRecommendedResponse object
 */
public class GetRecommendedResponse {
    @SerializedName("items")
    private List<NewsfeedItem> items;

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
     * New from value
     */
    @SerializedName("new_from")
    private String newFrom;

    public List<NewsfeedItem> getItems() {
        return items;
    }

    public List<UserFull> getProfiles() {
        return profiles;
    }

    public List<GroupFull> getGroups() {
        return groups;
    }

    public String getNewOffset() {
        return newOffset;
    }

    public String getNewFrom() {
        return newFrom;
    }

    @Override
    public int hashCode() {
        return Objects.hash(newOffset, profiles, groups, items, newFrom);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetRecommendedResponse getRecommendedResponse = (GetRecommendedResponse) o;
        return Objects.equals(items, getRecommendedResponse.items) &&
                Objects.equals(profiles, getRecommendedResponse.profiles) &&
                Objects.equals(groups, getRecommendedResponse.groups) &&
                Objects.equals(newOffset, getRecommendedResponse.newOffset) &&
                Objects.equals(newFrom, getRecommendedResponse.newFrom);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetRecommendedResponse{");
        sb.append("items=").append(items);
        sb.append(", profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append(", newOffset='").append(newOffset).append("'");
        sb.append(", newFrom='").append(newFrom).append("'");
        sb.append('}');
        return sb.toString();
    }
}
