package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * Group object
 */
public class Group {
    /**
     * Community ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Community name
     */
    @SerializedName("name")
    private String name;

    /**
     * Returns if a group is deleted or blocked
     */
    @SerializedName("deactivated")
    private String deactivated;

    /**
     * Domain of the community page
     */
    @SerializedName("screen_name")
    private String screenName;

    /**
     * Information whether community is closed
     */
    @SerializedName("is_closed")
    private GroupIsClosed isClosed;

    /**
     * Community type
     */
    @SerializedName("type")
    private GroupType type;

    /**
     * Information whether current user is administrator
     */
    @SerializedName("is_admin")
    private BoolInt isAdmin;

    /**
     * Level of current user's credentials as manager
     */
    @SerializedName("admin_level")
    private GroupAdminLevel adminLevel;

    /**
     * Information whether current user is member
     */
    @SerializedName("is_member")
    private BoolInt isMember;

    /**
     * URL of square photo of the community with 50 pixels in width
     */
    @SerializedName("photo_50")
    private String photo50;

    /**
     * URL of square photo of the community with 100 pixels in width
     */
    @SerializedName("photo_100")
    private String photo100;

    /**
     * URL of square photo of the community with 200 pixels in width
     */
    @SerializedName("photo_200")
    private String photo200;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDeactivated() {
        return deactivated;
    }

    public String getScreenName() {
        return screenName;
    }

    public GroupIsClosed getIsClosed() {
        return isClosed;
    }

    public GroupType getType() {
        return type;
    }

    public boolean isAdmin() {
        return isAdmin == BoolInt.YES;
    }

    public GroupAdminLevel getAdminLevel() {
        return adminLevel;
    }

    public boolean isMember() {
        return isMember == BoolInt.YES;
    }

    public String getPhoto50() {
        return photo50;
    }

    public String getPhoto100() {
        return photo100;
    }

    public String getPhoto200() {
        return photo200;
    }

    @Override
    public int hashCode() {
        return Objects.hash(deactivated, isClosed, adminLevel, photo100, name, photo50, id, screenName, isAdmin, isMember, photo200, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(id, group.id) &&
                Objects.equals(name, group.name) &&
                Objects.equals(deactivated, group.deactivated) &&
                Objects.equals(screenName, group.screenName) &&
                Objects.equals(isClosed, group.isClosed) &&
                Objects.equals(type, group.type) &&
                Objects.equals(isAdmin, group.isAdmin) &&
                Objects.equals(adminLevel, group.adminLevel) &&
                Objects.equals(isMember, group.isMember) &&
                Objects.equals(photo50, group.photo50) &&
                Objects.equals(photo100, group.photo100) &&
                Objects.equals(photo200, group.photo200);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Group{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append("'");
        sb.append(", deactivated='").append(deactivated).append("'");
        sb.append(", screenName='").append(screenName).append("'");
        sb.append(", isClosed=").append(isClosed);
        sb.append(", type='").append(type).append("'");
        sb.append(", isAdmin=").append(isAdmin);
        sb.append(", adminLevel=").append(adminLevel);
        sb.append(", isMember=").append(isMember);
        sb.append(", photo50='").append(photo50).append("'");
        sb.append(", photo100='").append(photo100).append("'");
        sb.append(", photo200='").append(photo200).append("'");
        sb.append('}');
        return sb.toString();
    }
}
