package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * GroupXtrInvitedBy object
 */
public class GroupXtrInvitedBy {
    /**
     * Community ID
     */
    @SerializedName("id")
    private String id;

    /**
     * Community name
     */
    @SerializedName("name")
    private String name;

    /**
     * Domain of the community page
     */
    @SerializedName("screen_name")
    private String screenName;

    /**
     * Information whether community is closed
     */
    @SerializedName("is_closed")
    private BoolInt isClosed;

    /**
     * Community type
     */
    @SerializedName("type")
    private GroupXtrInvitedByType type;

    /**
     * Information whether current user is manager
     */
    @SerializedName("is_admin")
    private BoolInt isAdmin;

    /**
     * Level of current user's credentials as manager
     */
    @SerializedName("admin_level")
    private GroupXtrInvitedByAdminLevel adminLevel;

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

    /**
     * Inviter ID
     */
    @SerializedName("invited_by")
    private Integer invitedBy;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getScreenName() {
        return screenName;
    }

    public boolean isClosed() {
        return isClosed == BoolInt.YES;
    }

    public GroupXtrInvitedByType getType() {
        return type;
    }

    public boolean isAdmin() {
        return isAdmin == BoolInt.YES;
    }

    public GroupXtrInvitedByAdminLevel getAdminLevel() {
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

    public Integer getInvitedBy() {
        return invitedBy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(invitedBy, isClosed, adminLevel, photo100, name, photo50, id, screenName, isAdmin, isMember, photo200, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupXtrInvitedBy groupXtrInvitedBy = (GroupXtrInvitedBy) o;
        return Objects.equals(id, groupXtrInvitedBy.id) &&
                Objects.equals(name, groupXtrInvitedBy.name) &&
                Objects.equals(screenName, groupXtrInvitedBy.screenName) &&
                Objects.equals(isClosed, groupXtrInvitedBy.isClosed) &&
                Objects.equals(type, groupXtrInvitedBy.type) &&
                Objects.equals(isAdmin, groupXtrInvitedBy.isAdmin) &&
                Objects.equals(adminLevel, groupXtrInvitedBy.adminLevel) &&
                Objects.equals(isMember, groupXtrInvitedBy.isMember) &&
                Objects.equals(photo50, groupXtrInvitedBy.photo50) &&
                Objects.equals(photo100, groupXtrInvitedBy.photo100) &&
                Objects.equals(photo200, groupXtrInvitedBy.photo200) &&
                Objects.equals(invitedBy, groupXtrInvitedBy.invitedBy);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GroupXtrInvitedBy{");
        sb.append("id='").append(id).append("'");
        sb.append(", name='").append(name).append("'");
        sb.append(", screenName='").append(screenName).append("'");
        sb.append(", isClosed=").append(isClosed);
        sb.append(", type='").append(type).append("'");
        sb.append(", isAdmin=").append(isAdmin);
        sb.append(", adminLevel=").append(adminLevel);
        sb.append(", isMember=").append(isMember);
        sb.append(", photo50='").append(photo50).append("'");
        sb.append(", photo100='").append(photo100).append("'");
        sb.append(", photo200='").append(photo200).append("'");
        sb.append(", invitedBy=").append(invitedBy);
        sb.append('}');
        return sb.toString();
    }
}
