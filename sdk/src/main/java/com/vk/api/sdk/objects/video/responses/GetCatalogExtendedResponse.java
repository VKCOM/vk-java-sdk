package com.vk.api.sdk.objects.video.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.users.UserFull;
import com.vk.api.sdk.objects.video.CatBlock;

import java.util.List;
import java.util.Objects;

/**
 * GetCatalogExtendedResponse object
 */
public class GetCatalogExtendedResponse {
    @SerializedName("items")
    private List<CatBlock> items;

    @SerializedName("profiles")
    private List<UserFull> profiles;

    @SerializedName("groups")
    private List<GroupFull> groups;

    /**
     * New value for _from_ parameter
     */
    @SerializedName("next")
    private String next;

    public List<CatBlock> getItems() {
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
        GetCatalogExtendedResponse getCatalogExtendedResponse = (GetCatalogExtendedResponse) o;
        return Objects.equals(items, getCatalogExtendedResponse.items) &&
                Objects.equals(profiles, getCatalogExtendedResponse.profiles) &&
                Objects.equals(groups, getCatalogExtendedResponse.groups) &&
                Objects.equals(next, getCatalogExtendedResponse.next);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCatalogExtendedResponse{");
        sb.append("items=").append(items);
        sb.append(", profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append(", next='").append(next).append("'");
        sb.append('}');
        return sb.toString();
    }
}
