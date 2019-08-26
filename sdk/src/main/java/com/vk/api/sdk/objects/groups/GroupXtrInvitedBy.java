package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import java.net.URL;
import java.util.Objects;

/**
 * GroupXtrInvitedBy object
 */
public class GroupXtrInvitedBy implements Validable {
    @SerializedName("admin_level")
    private GroupXtrInvitedByAdminLevel adminLevel;

    /**
     * Community ID
     */
    @SerializedName("id")
    private String id;

    /**
     * Inviter ID
     */
    @SerializedName("invited_by")
    private Integer invitedBy;

    /**
     * Information whether current user is manager
     */
    @SerializedName("is_admin")
    private BoolInt isAdmin;

    /**
     * Information whether current user is advertiser
     */
    @SerializedName("is_advertiser")
    private BoolInt isAdvertiser;

    /**
     * Information whether community is closed
     */
    @SerializedName("is_closed")
    private BoolInt isClosed;

    /**
     * Information whether current user is member
     */
    @SerializedName("is_member")
    private BoolInt isMember;

    /**
     * Community name
     */
    @SerializedName("name")
    private String name;

    /**
     * URL of square photo of the community with 100 pixels in width
     */
    @SerializedName("photo_100")
    private URL photo100;

    /**
     * URL of square photo of the community with 200 pixels in width
     */
    @SerializedName("photo_200")
    private URL photo200;

    /**
     * URL of square photo of the community with 50 pixels in width
     */
    @SerializedName("photo_50")
    private URL photo50;

    /**
     * Domain of the community page
     */
    @SerializedName("screen_name")
    private String screenName;

    @SerializedName("type")
    private GroupXtrInvitedByType type;

    public GroupXtrInvitedByAdminLevel getAdminLevel() {
        return adminLevel;
    }

    public GroupXtrInvitedBy setAdminLevel(GroupXtrInvitedByAdminLevel adminLevel) {
        this.adminLevel = adminLevel;
        return this;
    }

    public String getId() {
        return id;
    }

    public GroupXtrInvitedBy setId(String id) {
        this.id = id;
        return this;
    }

    public Integer getInvitedBy() {
        return invitedBy;
    }

    public GroupXtrInvitedBy setInvitedBy(Integer invitedBy) {
        this.invitedBy = invitedBy;
        return this;
    }

    public boolean isAdmin() {
        return isAdmin == BoolInt.YES;
    }

    public BoolInt getIsAdmin() {
        return isAdmin;
    }

    public boolean isAdvertiser() {
        return isAdvertiser == BoolInt.YES;
    }

    public BoolInt getIsAdvertiser() {
        return isAdvertiser;
    }

    public boolean isClosed() {
        return isClosed == BoolInt.YES;
    }

    public BoolInt getIsClosed() {
        return isClosed;
    }

    public boolean isMember() {
        return isMember == BoolInt.YES;
    }

    public BoolInt getIsMember() {
        return isMember;
    }

    public String getName() {
        return name;
    }

    public GroupXtrInvitedBy setName(String name) {
        this.name = name;
        return this;
    }

    public URL getPhoto100() {
        return photo100;
    }

    public GroupXtrInvitedBy setPhoto100(URL photo100) {
        this.photo100 = photo100;
        return this;
    }

    public URL getPhoto200() {
        return photo200;
    }

    public GroupXtrInvitedBy setPhoto200(URL photo200) {
        this.photo200 = photo200;
        return this;
    }

    public URL getPhoto50() {
        return photo50;
    }

    public GroupXtrInvitedBy setPhoto50(URL photo50) {
        this.photo50 = photo50;
        return this;
    }

    public String getScreenName() {
        return screenName;
    }

    public GroupXtrInvitedBy setScreenName(String screenName) {
        this.screenName = screenName;
        return this;
    }

    public GroupXtrInvitedByType getType() {
        return type;
    }

    public GroupXtrInvitedBy setType(GroupXtrInvitedByType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(invitedBy, isAdvertiser, adminLevel, photo50, isMember, isAdmin, screenName, photo200, type, photo100, isClosed, name, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupXtrInvitedBy groupXtrInvitedBy = (GroupXtrInvitedBy) o;
        return Objects.equals(isMember, groupXtrInvitedBy.isMember) &&
                Objects.equals(photo50, groupXtrInvitedBy.photo50) &&
                Objects.equals(invitedBy, groupXtrInvitedBy.invitedBy) &&
                Objects.equals(type, groupXtrInvitedBy.type) &&
                Objects.equals(isAdmin, groupXtrInvitedBy.isAdmin) &&
                Objects.equals(isAdvertiser, groupXtrInvitedBy.isAdvertiser) &&
                Objects.equals(screenName, groupXtrInvitedBy.screenName) &&
                Objects.equals(adminLevel, groupXtrInvitedBy.adminLevel) &&
                Objects.equals(name, groupXtrInvitedBy.name) &&
                Objects.equals(id, groupXtrInvitedBy.id) &&
                Objects.equals(photo100, groupXtrInvitedBy.photo100) &&
                Objects.equals(photo200, groupXtrInvitedBy.photo200) &&
                Objects.equals(isClosed, groupXtrInvitedBy.isClosed);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GroupXtrInvitedBy{");
        sb.append("isMember=").append(isMember);
        sb.append(", photo50=").append(photo50);
        sb.append(", invitedBy=").append(invitedBy);
        sb.append(", type=").append(type);
        sb.append(", isAdmin=").append(isAdmin);
        sb.append(", isAdvertiser=").append(isAdvertiser);
        sb.append(", screenName='").append(screenName).append("'");
        sb.append(", adminLevel=").append(adminLevel);
        sb.append(", name='").append(name).append("'");
        sb.append(", id='").append(id).append("'");
        sb.append(", photo100=").append(photo100);
        sb.append(", photo200=").append(photo200);
        sb.append(", isClosed=").append(isClosed);
        sb.append('}');
        return sb.toString();
    }
}
