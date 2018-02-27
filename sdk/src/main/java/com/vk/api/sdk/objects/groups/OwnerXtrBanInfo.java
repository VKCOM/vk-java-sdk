package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.users.User;

import java.util.Objects;

/**
 * OwnerXtrBanInfo object
 */
public class OwnerXtrBanInfo {

    @SerializedName("type")
    private OwnerXtrBanInfoType type;

    @SerializedName("group")
    private Group group;

    @SerializedName("user")
    private User user;

    @SerializedName("ban_info")
    private BanInfo banInfo;

    public OwnerXtrBanInfoType getType() {
        return type;
    }

    public Group getGroup() {
        return group;
    }

    public User getUser() {
        return user;
    }

    public BanInfo getBanInfo() {
        return banInfo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OwnerXtrBanInfo{");
        sb.append("banInfo=").append(banInfo);
        sb.append(", group=").append(group);
        sb.append(", type='").append(type).append('\'');
        sb.append(", user=").append(user);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OwnerXtrBanInfo that = (OwnerXtrBanInfo) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(group, that.group) &&
                Objects.equals(user, that.user) &&
                Objects.equals(banInfo, that.banInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, group, user, banInfo);
    }
}
