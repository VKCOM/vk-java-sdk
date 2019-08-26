package com.vk.api.sdk.objects.newsfeed.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.users.UserFull;
import com.vk.api.sdk.objects.wall.WallpostFull;
import java.util.List;
import java.util.Objects;

/**
 * SearchExtendedResponse object
 */
public class SearchExtendedResponse implements Validable {
    @SerializedName("items")
    private List<WallpostFull> items;

    @SerializedName("profiles")
    private List<UserFull> profiles;

    @SerializedName("groups")
    private List<GroupFull> groups;

    /**
     * Filtered number
     */
    @SerializedName("count")
    private Integer count;

    /**
     * Total number
     */
    @SerializedName("total_count")
    private Integer totalCount;

    @SerializedName("next_from")
    private String nextFrom;

    public List<WallpostFull> getItems() {
        return items;
    }

    public SearchExtendedResponse setItems(List<WallpostFull> items) {
        this.items = items;
        return this;
    }

    public List<UserFull> getProfiles() {
        return profiles;
    }

    public SearchExtendedResponse setProfiles(List<UserFull> profiles) {
        this.profiles = profiles;
        return this;
    }

    public List<GroupFull> getGroups() {
        return groups;
    }

    public SearchExtendedResponse setGroups(List<GroupFull> groups) {
        this.groups = groups;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public SearchExtendedResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public SearchExtendedResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public String getNextFrom() {
        return nextFrom;
    }

    public SearchExtendedResponse setNextFrom(String nextFrom) {
        this.nextFrom = nextFrom;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(profiles, count, groups, totalCount, nextFrom, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchExtendedResponse searchExtendedResponse = (SearchExtendedResponse) o;
        return Objects.equals(nextFrom, searchExtendedResponse.nextFrom) &&
                Objects.equals(totalCount, searchExtendedResponse.totalCount) &&
                Objects.equals(profiles, searchExtendedResponse.profiles) &&
                Objects.equals(count, searchExtendedResponse.count) &&
                Objects.equals(groups, searchExtendedResponse.groups) &&
                Objects.equals(items, searchExtendedResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SearchExtendedResponse{");
        sb.append("nextFrom='").append(nextFrom).append("'");
        sb.append(", totalCount=").append(totalCount);
        sb.append(", profiles=").append(profiles);
        sb.append(", count=").append(count);
        sb.append(", groups=").append(groups);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
