package com.vk.api.sdk.callback.objects.group;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.groups.GroupFullAgeLimits;
import com.vk.api.sdk.objects.groups.GroupIsClosed;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 11.08.17.
 */
public class CallbackGroupSettingsChanges {

    @SerializedName("title")
    private CallbackGroupSettingsChange<String> title;

    @SerializedName("description")
    private CallbackGroupSettingsChange<String> description;

    @SerializedName("access")
    private CallbackGroupSettingsChange<GroupIsClosed> access;

    @SerializedName("screen_name")
    private CallbackGroupSettingsChange<String> screenName;

    @SerializedName("public_category")
    private CallbackGroupSettingsChange<Integer> publicCategory;

    @SerializedName("public_subcategory")
    private CallbackGroupSettingsChange<Integer> publicSubcategory;

    @SerializedName("age_limits")
    private CallbackGroupSettingsChange<GroupFullAgeLimits> ageLimits;

    @SerializedName("website")
    private CallbackGroupSettingsChange<String> website;

    @SerializedName("enable_status_default")
    private CallbackGroupSettingsChange<CallbackGroupWall> enableStatusDefault;

    @SerializedName("enable_audio")
    private CallbackGroupSettingsChange<CallbackGroupAudio> enableAudio;

    @SerializedName("enable_video")
    private CallbackGroupSettingsChange<CallbackGroupVideo> enableVideo;

    @SerializedName("enable_photo")
    private CallbackGroupSettingsChange<CallbackGroupPhotos> enablePhoto;

    @SerializedName("enable_market")
    private CallbackGroupSettingsChange<CallbackGroupMarket> enableMarket;

    public CallbackGroupSettingsChange<String> getTitle() {
        return title;
    }

    public CallbackGroupSettingsChange<String> getDescription() {
        return description;
    }

    public CallbackGroupSettingsChange<GroupIsClosed> getAccess() {
        return access;
    }

    public CallbackGroupSettingsChange<String> getScreenName() {
        return screenName;
    }

    public CallbackGroupSettingsChange<Integer> getPublicCategory() {
        return publicCategory;
    }

    public CallbackGroupSettingsChange<Integer> getPublicSubcategory() {
        return publicSubcategory;
    }

    public CallbackGroupSettingsChange<GroupFullAgeLimits> getAgeLimits() {
        return ageLimits;
    }

    public CallbackGroupSettingsChange<String> getWebsite() {
        return website;
    }

    public CallbackGroupSettingsChange<CallbackGroupWall> getEnableStatusDefault() {
        return enableStatusDefault;
    }

    public CallbackGroupSettingsChange<CallbackGroupAudio> getEnableAudio() {
        return enableAudio;
    }

    public CallbackGroupSettingsChange<CallbackGroupVideo> getEnableVideo() {
        return enableVideo;
    }

    public CallbackGroupSettingsChange<CallbackGroupPhotos> getEnablePhoto() {
        return enablePhoto;
    }

    public CallbackGroupSettingsChange<CallbackGroupMarket> getEnableMarket() {
        return enableMarket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallbackGroupSettingsChanges that = (CallbackGroupSettingsChanges) o;
        return Objects.equals(title, that.title) &&
                Objects.equals(description, that.description) &&
                Objects.equals(access, that.access) &&
                Objects.equals(screenName, that.screenName) &&
                Objects.equals(publicCategory, that.publicCategory) &&
                Objects.equals(publicSubcategory, that.publicSubcategory) &&
                Objects.equals(ageLimits, that.ageLimits) &&
                Objects.equals(website, that.website) &&
                Objects.equals(enableStatusDefault, that.enableStatusDefault) &&
                Objects.equals(enableAudio, that.enableAudio) &&
                Objects.equals(enableVideo, that.enableVideo) &&
                Objects.equals(enablePhoto, that.enablePhoto) &&
                Objects.equals(enableMarket, that.enableMarket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, access, screenName, publicCategory, publicSubcategory, ageLimits, website, enableStatusDefault, enableAudio, enableVideo, enablePhoto, enableMarket);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackGroupSettingsChanges{");
        sb.append("access=").append(access);
        sb.append(", ageLimits=").append(ageLimits);
        sb.append(", description=").append(description);
        sb.append(", enableAudio=").append(enableAudio);
        sb.append(", enableMarket=").append(enableMarket);
        sb.append(", enablePhoto=").append(enablePhoto);
        sb.append(", enableStatusDefault=").append(enableStatusDefault);
        sb.append(", enableVideo=").append(enableVideo);
        sb.append(", publicCategory=").append(publicCategory);
        sb.append(", publicSubcategory=").append(publicSubcategory);
        sb.append(", screenName=").append(screenName);
        sb.append(", title=").append(title);
        sb.append(", website=").append(website);
        sb.append('}');
        return sb.toString();
    }
}
