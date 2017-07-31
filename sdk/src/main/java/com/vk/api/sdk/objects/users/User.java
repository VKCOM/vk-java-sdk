package com.vk.api.sdk.objects.users;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.Sex;

import java.util.Objects;

/**
 * User object
 */
public class User extends UserMin {
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
    private String photo50;

    /**
     * URL of square photo of the user with 100 pixels in width
     */
    @SerializedName("photo_100")
    private String photo100;

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

    public Sex getSex() {
        return sex;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getPhoto50() {
        return photo50;
    }

    public String getPhoto100() {
        return photo100;
    }

    public boolean isOnline() {
        return online == BoolInt.YES;
    }

    public boolean isOnlineMobile() {
        return onlineMobile == BoolInt.YES;
    }

    public Integer getOnlineApp() {
        return onlineApp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), photo100, sex, photo50, online, onlineMobile, onlineApp, screenName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return Objects.equals(sex, user.sex) &&
                Objects.equals(screenName, user.screenName) &&
                Objects.equals(photo50, user.photo50) &&
                Objects.equals(photo100, user.photo100) &&
                Objects.equals(online, user.online) &&
                Objects.equals(onlineMobile, user.onlineMobile) &&
                Objects.equals(onlineApp, user.onlineApp);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("deactivated='").append(getDeactivated()).append('\'');
        sb.append(", firstName='").append(getFirstName()).append('\'');
        sb.append(", hidden=").append(getHidden());
        sb.append(", id=").append(getId());
        sb.append(", lastName='").append(getLastName()).append('\'');
        sb.append(", online=").append(online);
        sb.append(", onlineApp=").append(onlineApp);
        sb.append(", onlineMobile=").append(onlineMobile);
        sb.append(", photo100='").append(photo100).append('\'');
        sb.append(", photo50='").append(photo50).append('\'');
        sb.append(", screenName='").append(screenName).append('\'');
        sb.append(", sex=").append(sex);
        sb.append('}');
        return sb.toString();
    }
}
