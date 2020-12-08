package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import java.net.URI;
import java.util.Objects;

/**
 * Group object
 */
public class Group implements Validable {
    /**
     * Community ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Community name
     */
    @SerializedName("name")
    @Required
    private String name;

    /**
     * Domain of the community page
     */
    @SerializedName("screen_name")
    private String screenName;

    @SerializedName("is_closed")
    private GroupIsClosed isClosed;

    @SerializedName("type")
    private GroupType type;

    /**
     * Information whether current user is administrator
     */
    @SerializedName("is_admin")
    private BoolInt isAdmin;

    @SerializedName("admin_level")
    private GroupAdminLevel adminLevel;

    /**
     * Information whether current user is member
     */
    @SerializedName("is_member")
    private BoolInt isMember;

    /**
     * Information whether current user is advertiser
     */
    @SerializedName("is_advertiser")
    private BoolInt isAdvertiser;

    /**
     * Start date in Unixtime format
     */
    @SerializedName("start_date")
    private Integer startDate;

    /**
     * Finish date in Unixtime format
     */
    @SerializedName("finish_date")
    private Integer finishDate;

    /**
     * Information whether community is banned
     */
    @SerializedName("deactivated")
    private String deactivated;

    /**
     * URL of square photo of the community with 50 pixels in width
     */
    @SerializedName("photo_50")
    private URI photo50;

    /**
     * URL of square photo of the community with 100 pixels in width
     */
    @SerializedName("photo_100")
    private URI photo100;

    /**
     * URL of square photo of the community with 200 pixels in width
     */
    @SerializedName("photo_200")
    private URI photo200;

    public Integer getId() {
        return id;
    }

    public Group setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Group setName(String name) {
        this.name = name;
        return this;
    }

    public String getScreenName() {
        return screenName;
    }

    public Group setScreenName(String screenName) {
        this.screenName = screenName;
        return this;
    }

    public GroupIsClosed getIsClosed() {
        return isClosed;
    }

    public Group setIsClosed(GroupIsClosed isClosed) {
        this.isClosed = isClosed;
        return this;
    }

    public GroupType getType() {
        return type;
    }

    public Group setType(GroupType type) {
        this.type = type;
        return this;
    }

    public boolean isAdmin() {
        return isAdmin == BoolInt.YES;
    }

    public BoolInt getIsAdmin() {
        return isAdmin;
    }

    public GroupAdminLevel getAdminLevel() {
        return adminLevel;
    }

    public Group setAdminLevel(GroupAdminLevel adminLevel) {
        this.adminLevel = adminLevel;
        return this;
    }

    public boolean isMember() {
        return isMember == BoolInt.YES;
    }

    public BoolInt getIsMember() {
        return isMember;
    }

    public boolean isAdvertiser() {
        return isAdvertiser == BoolInt.YES;
    }

    public BoolInt getIsAdvertiser() {
        return isAdvertiser;
    }

    public Integer getStartDate() {
        return startDate;
    }

    public Group setStartDate(Integer startDate) {
        this.startDate = startDate;
        return this;
    }

    public Integer getFinishDate() {
        return finishDate;
    }

    public Group setFinishDate(Integer finishDate) {
        this.finishDate = finishDate;
        return this;
    }

    public String getDeactivated() {
        return deactivated;
    }

    public Group setDeactivated(String deactivated) {
        this.deactivated = deactivated;
        return this;
    }

    public URI getPhoto50() {
        return photo50;
    }

    public Group setPhoto50(URI photo50) {
        this.photo50 = photo50;
        return this;
    }

    public URI getPhoto100() {
        return photo100;
    }

    public Group setPhoto100(URI photo100) {
        this.photo100 = photo100;
        return this;
    }

    public URI getPhoto200() {
        return photo200;
    }

    public Group setPhoto200(URI photo200) {
        this.photo200 = photo200;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAdvertiser, adminLevel, photo50, isMember, isAdmin, screenName, photo200, type, deactivated, photo100, isClosed, name, finishDate, id, startDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(isMember, group.isMember) &&
                Objects.equals(photo50, group.photo50) &&
                Objects.equals(type, group.type) &&
                Objects.equals(deactivated, group.deactivated) &&
                Objects.equals(isAdmin, group.isAdmin) &&
                Objects.equals(screenName, group.screenName) &&
                Objects.equals(isAdvertiser, group.isAdvertiser) &&
                Objects.equals(finishDate, group.finishDate) &&
                Objects.equals(adminLevel, group.adminLevel) &&
                Objects.equals(name, group.name) &&
                Objects.equals(id, group.id) &&
                Objects.equals(photo100, group.photo100) &&
                Objects.equals(photo200, group.photo200) &&
                Objects.equals(isClosed, group.isClosed) &&
                Objects.equals(startDate, group.startDate);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Group{");
        sb.append("isMember=").append(isMember);
        sb.append(", photo50=").append(photo50);
        sb.append(", type=").append(type);
        sb.append(", deactivated='").append(deactivated).append("'");
        sb.append(", isAdmin=").append(isAdmin);
        sb.append(", screenName='").append(screenName).append("'");
        sb.append(", isAdvertiser=").append(isAdvertiser);
        sb.append(", finishDate=").append(finishDate);
        sb.append(", adminLevel=").append(adminLevel);
        sb.append(", name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append(", photo100=").append(photo100);
        sb.append(", photo200=").append(photo200);
        sb.append(", isClosed=").append(isClosed);
        sb.append(", startDate=").append(startDate);
        sb.append('}');
        return sb.toString();
    }
}
