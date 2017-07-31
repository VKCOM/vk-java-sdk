package com.vk.api.sdk.objects.users;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * UserXtrType object
 */
public class UserXtrType extends User {
    /**
     * Object type
     */
    @SerializedName("type")
    private UserXtrTypeType type;

    public UserXtrTypeType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UserXtrType userXtrType = (UserXtrType) o;
        return Objects.equals(type, userXtrType.type);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserXtrType{");
        sb.append("deactivated='").append(getDeactivated()).append('\'');
        sb.append(", firstName='").append(getFirstName()).append('\'');
        sb.append(", hidden=").append(getHidden());
        sb.append(", id=").append(getId());
        sb.append(", lastName='").append(getLastName()).append('\'');
        sb.append(", online=").append(isOnline());
        sb.append(", onlineApp=").append(getOnlineApp());
        sb.append(", onlineMobile=").append(isOnlineMobile());
        sb.append(", photo100='").append(getPhoto100()).append('\'');
        sb.append(", photo50='").append(getPhoto50()).append('\'');
        sb.append(", screenName='").append(getScreenName()).append('\'');
        sb.append(", sex=").append(getSex());
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
