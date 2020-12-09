package com.vk.api.sdk.objects.users;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.Sex;
import com.vk.api.sdk.objects.friends.FriendStatusStatus;
import com.vk.api.sdk.objects.friends.RequestsMutual;
import java.net.URI;
import java.util.Objects;

/**
 * User object
 */
public class User extends UserMin implements Validable {
    /**
     * User sex
     */
    @SerializedName("sex")
    private Sex sex;

    /**
     * Domain name of the user's page
     */
    @SerializedName("screen_name")
    private String screenName;

    /**
     * URL of square photo of the user with 50 pixels in width
     */
    @SerializedName("photo_50")
    private URI photo50;

    /**
     * URL of square photo of the user with 100 pixels in width
     */
    @SerializedName("photo_100")
    private URI photo100;

    @SerializedName("online_info")
    private OnlineInfo onlineInfo;

    /**
     * Information whether the user is online
     */
    @SerializedName("online")
    private BoolInt online;

    /**
     * Information whether the user is online in mobile site or application
     */
    @SerializedName("online_mobile")
    private BoolInt onlineMobile;

    /**
     * Application ID
     */
    @SerializedName("online_app")
    private Integer onlineApp;

    /**
     * Information whether the user is verified
     */
    @SerializedName("verified")
    private BoolInt verified;

    /**
     * Information whether the user has a "fire" pictogram.
     */
    @SerializedName("trending")
    private BoolInt trending;

    @SerializedName("friend_status")
    private FriendStatusStatus friendStatus;

    @SerializedName("mutual")
    private RequestsMutual mutual;

    public Sex getSex() {
        return sex;
    }

    public User setSex(Sex sex) {
        this.sex = sex;
        return this;
    }

    public String getScreenName() {
        return screenName;
    }

    public User setScreenName(String screenName) {
        this.screenName = screenName;
        return this;
    }

    public URI getPhoto50() {
        return photo50;
    }

    public User setPhoto50(URI photo50) {
        this.photo50 = photo50;
        return this;
    }

    public URI getPhoto100() {
        return photo100;
    }

    public User setPhoto100(URI photo100) {
        this.photo100 = photo100;
        return this;
    }

    public OnlineInfo getOnlineInfo() {
        return onlineInfo;
    }

    public User setOnlineInfo(OnlineInfo onlineInfo) {
        this.onlineInfo = onlineInfo;
        return this;
    }

    public boolean isOnline() {
        return online == BoolInt.YES;
    }

    public BoolInt getOnline() {
        return online;
    }

    public boolean isOnlineMobile() {
        return onlineMobile == BoolInt.YES;
    }

    public BoolInt getOnlineMobile() {
        return onlineMobile;
    }

    public Integer getOnlineApp() {
        return onlineApp;
    }

    public User setOnlineApp(Integer onlineApp) {
        this.onlineApp = onlineApp;
        return this;
    }

    public boolean isVerified() {
        return verified == BoolInt.YES;
    }

    public BoolInt getVerified() {
        return verified;
    }

    public boolean isTrending() {
        return trending == BoolInt.YES;
    }

    public BoolInt getTrending() {
        return trending;
    }

    public FriendStatusStatus getFriendStatus() {
        return friendStatus;
    }

    public User setFriendStatus(FriendStatusStatus friendStatus) {
        this.friendStatus = friendStatus;
        return this;
    }

    public RequestsMutual getMutual() {
        return mutual;
    }

    public User setMutual(RequestsMutual mutual) {
        this.mutual = mutual;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trending, friendStatus, mutual, photo100, onlineInfo, onlineApp, sex, verified, photo50, online, screenName, onlineMobile);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(trending, user.trending) &&
                Objects.equals(friendStatus, user.friendStatus) &&
                Objects.equals(mutual, user.mutual) &&
                Objects.equals(photo50, user.photo50) &&
                Objects.equals(screenName, user.screenName) &&
                Objects.equals(onlineMobile, user.onlineMobile) &&
                Objects.equals(sex, user.sex) &&
                Objects.equals(onlineApp, user.onlineApp) &&
                Objects.equals(verified, user.verified) &&
                Objects.equals(online, user.online) &&
                Objects.equals(photo100, user.photo100) &&
                Objects.equals(onlineInfo, user.onlineInfo);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("trending=").append(trending);
        sb.append(", friendStatus=").append(friendStatus);
        sb.append(", mutual=").append(mutual);
        sb.append(", photo50=").append(photo50);
        sb.append(", screenName='").append(screenName).append("'");
        sb.append(", onlineMobile=").append(onlineMobile);
        sb.append(", sex=").append(sex);
        sb.append(", onlineApp=").append(onlineApp);
        sb.append(", verified=").append(verified);
        sb.append(", online=").append(online);
        sb.append(", photo100=").append(photo100);
        sb.append(", onlineInfo=").append(onlineInfo);
        sb.append('}');
        return sb.toString();
    }
}
