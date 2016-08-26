package com.vk.api.sdk.objects.video.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.users.UserFull;
import com.vk.api.sdk.objects.video.CatElement;

import java.util.List;
import java.util.Objects;

/**
 * GetCatalogSectionExtendedResponse object
 */
public class GetCatalogSectionExtendedResponse {
    @SerializedName("items")
    private List<CatElement> items;

    @SerializedName("profiles")
    private List<UserFull> profiles;

    @SerializedName("groups")
    private List<GroupFull> groups;

    /**
     * New value for _from_ parameter
     */
    @SerializedName("next")
    private String next;

    public List<CatElement> getItems() {
        return items;
    }

    public List<UserFull> getProfiles() {
        return profiles;
    }

    public List<GroupFull> getGroups() {
        return groups;
    }

    public String getNext() {
        return next;
    }

    @Override
    public int hashCode() {
        return Objects.hash(next, profiles, groups, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCatalogSectionExtendedResponse getCatalogSectionExtendedResponse = (GetCatalogSectionExtendedResponse) o;
        return Objects.equals(items, getCatalogSectionExtendedResponse.items) &&
                Objects.equals(profiles, getCatalogSectionExtendedResponse.profiles) &&
                Objects.equals(groups, getCatalogSectionExtendedResponse.groups) &&
                Objects.equals(next, getCatalogSectionExtendedResponse.next);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCatalogSectionExtendedResponse{");
        sb.append("items=").append(items);
        sb.append(", profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append(", next='").append(next).append("'");
        sb.append('}');
        return sb.toString();
    }
}
