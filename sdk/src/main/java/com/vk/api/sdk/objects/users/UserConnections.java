package com.vk.api.sdk.objects.users;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * UserConnections object
 */
public class UserConnections implements Validable {
    /**
     * User's Skype nickname
     */
    @SerializedName("skype")
    @Required
    private String skype;

    /**
     * User's Facebook account
     */
    @SerializedName("facebook")
    @Required
    private String facebook;

    /**
     * User's Facebook name
     */
    @SerializedName("facebook_name")
    private String facebookName;

    /**
     * User's Twitter account
     */
    @SerializedName("twitter")
    @Required
    private String twitter;

    /**
     * User's Livejournal account
     */
    @SerializedName("livejournal")
    private String livejournal;

    /**
     * User's Instagram account
     */
    @SerializedName("instagram")
    @Required
    private String instagram;

    public String getSkype() {
        return skype;
    }

    public UserConnections setSkype(String skype) {
        this.skype = skype;
        return this;
    }

    public String getFacebook() {
        return facebook;
    }

    public UserConnections setFacebook(String facebook) {
        this.facebook = facebook;
        return this;
    }

    public String getFacebookName() {
        return facebookName;
    }

    public UserConnections setFacebookName(String facebookName) {
        this.facebookName = facebookName;
        return this;
    }

    public String getTwitter() {
        return twitter;
    }

    public UserConnections setTwitter(String twitter) {
        this.twitter = twitter;
        return this;
    }

    public String getLivejournal() {
        return livejournal;
    }

    public UserConnections setLivejournal(String livejournal) {
        this.livejournal = livejournal;
        return this;
    }

    public String getInstagram() {
        return instagram;
    }

    public UserConnections setInstagram(String instagram) {
        this.instagram = instagram;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(skype, twitter, facebook, livejournal, instagram, facebookName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserConnections userConnections = (UserConnections) o;
        return Objects.equals(skype, userConnections.skype) &&
                Objects.equals(twitter, userConnections.twitter) &&
                Objects.equals(facebook, userConnections.facebook) &&
                Objects.equals(facebookName, userConnections.facebookName) &&
                Objects.equals(livejournal, userConnections.livejournal) &&
                Objects.equals(instagram, userConnections.instagram);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UserConnections{");
        sb.append("skype='").append(skype).append("'");
        sb.append(", twitter='").append(twitter).append("'");
        sb.append(", facebook='").append(facebook).append("'");
        sb.append(", facebookName='").append(facebookName).append("'");
        sb.append(", livejournal='").append(livejournal).append("'");
        sb.append(", instagram='").append(instagram).append("'");
        sb.append('}');
        return sb.toString();
    }
}
