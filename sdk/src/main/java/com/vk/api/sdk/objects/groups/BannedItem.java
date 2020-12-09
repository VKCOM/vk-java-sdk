package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.users.User;
import java.util.Objects;

/**
 * BannedItem object
 */
public class BannedItem implements Validable {
    @SerializedName("ban_info")
    private BanInfo banInfo;

    /**
     * Information about group if type = group
     */
    @SerializedName("group")
    private Group group;

    /**
     * Information about group if type = profile
     */
    @SerializedName("profile")
    private User profile;

    @SerializedName("type")
    private OwnerXtrBanInfoType type;

    public BanInfo getBanInfo() {
        return banInfo;
    }

    public BannedItem setBanInfo(BanInfo banInfo) {
        this.banInfo = banInfo;
        return this;
    }

    public Group getGroup() {
        return group;
    }

    public BannedItem setGroup(Group group) {
        this.group = group;
        return this;
    }

    public User getProfile() {
        return profile;
    }

    public BannedItem setProfile(User profile) {
        this.profile = profile;
        return this;
    }

    public OwnerXtrBanInfoType getType() {
        return type;
    }

    public BannedItem setType(OwnerXtrBanInfoType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(banInfo, profile, type, group);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BannedItem bannedItem = (BannedItem) o;
        return Objects.equals(profile, bannedItem.profile) &&
                Objects.equals(type, bannedItem.type) &&
                Objects.equals(banInfo, bannedItem.banInfo) &&
                Objects.equals(group, bannedItem.group);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("BannedItem{");
        sb.append("profile=").append(profile);
        sb.append(", type=").append(type);
        sb.append(", banInfo=").append(banInfo);
        sb.append(", group=").append(group);
        sb.append('}');
        return sb.toString();
    }
}
