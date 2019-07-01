package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import java.net.URL;
import java.util.Objects;

/**
 * Group object
 */
public class Group implements Validable {
    @SerializedName("admin_level")
    private GroupAdminLevel adminLevel;

    /**
     * Information whether community is banned
     */
    @SerializedName("deactivated")
    private String deactivated;

    /**
     * Finish date in Unixtime format
     */
    @SerializedName("finish_date")
    private Integer finishDate;

    /**
     * Community ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Information whether current user is administrator
     */
    @SerializedName("is_admin")
    private BoolInt isAdmin;

    /**
     * Information whether current user is advertiser
     */
    @SerializedName("is_advertiser")
    private BoolInt isAdvertiser;

    @SerializedName("is_closed")
    private GroupIsClosed isClosed;

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

    /**
     * Start date in Unixtime format
     */
    @SerializedName("start_date")
    private Integer startDate;

    @SerializedName("type")
    private GroupType type;

    public GroupAdminLevel getAdminLevel() {
        return adminLevel;
    }

    public Group setAdminLevel(GroupAdminLevel adminLevel) {
        this.adminLevel = adminLevel;
        return this;
    }

    public String getDeactivated() {
        return deactivated;
    }

    public Group setDeactivated(String deactivated) {
        this.deactivated = deactivated;
        return this;
    }

    public Integer getFinishDate() {
        return finishDate;
    }

    public Group setFinishDate(Integer finishDate) {
        this.finishDate = finishDate;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Group setId(Integer id) {
        this.id = id;
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

    public GroupIsClosed getIsClosed() {
        return isClosed;
    }

    public Group setIsClosed(GroupIsClosed isClosed) {
        this.isClosed = isClosed;
        return this;
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

    public Group setName(String name) {
        this.name = name;
        return this;
    }

    public URL getPhoto100() {
        return photo100;
    }

    public Group setPhoto100(URL photo100) {
        this.photo100 = photo100;
        return this;
    }

    public URL getPhoto200() {
        return photo200;
    }

    public Group setPhoto200(URL photo200) {
        this.photo200 = photo200;
        return this;
    }

    public URL getPhoto50() {
        return photo50;
    }

    public Group setPhoto50(URL photo50) {
        this.photo50 = photo50;
        return this;
    }

    public String getScreenName() {
        return screenName;
    }

    public Group setScreenName(String screenName) {
        this.screenName = screenName;
        return this;
    }

    public Integer getStartDate() {
        return startDate;
    }

    public Group setStartDate(Integer startDate) {
        this.startDate = startDate;
        return this;
    }

    public GroupType getType() {
        return type;
    }

    public Group setType(GroupType type) {
        this.type = type;
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
                Objects.equals(finishDate, group.finishDate) &&
                Objects.equals(isAdvertiser, group.isAdvertiser) &&
                Objects.equals(screenName, group.screenName) &&
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
        sb.append(", finishDate=").append(finishDate);
        sb.append(", isAdvertiser=").append(isAdvertiser);
        sb.append(", screenName='").append(screenName).append("'");
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
