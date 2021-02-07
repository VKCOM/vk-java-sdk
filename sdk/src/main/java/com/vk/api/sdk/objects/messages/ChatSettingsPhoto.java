package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URI;
import java.util.Objects;

/**
 * ChatSettingsPhoto object
 */
public class ChatSettingsPhoto implements Validable {
    /**
     * URL of the preview image with 50px in width
     */
    @SerializedName("photo_50")
    private URI photo50;

    /**
     * URL of the preview image with 100px in width
     */
    @SerializedName("photo_100")
    private URI photo100;

    /**
     * URL of the preview image with 200px in width
     */
    @SerializedName("photo_200")
    private URI photo200;

    /**
     * If provided photo is default
     */
    @SerializedName("is_default_photo")
    private Boolean isDefaultPhoto;

    public URI getPhoto50() {
        return photo50;
    }

    public ChatSettingsPhoto setPhoto50(URI photo50) {
        this.photo50 = photo50;
        return this;
    }

    public URI getPhoto100() {
        return photo100;
    }

    public ChatSettingsPhoto setPhoto100(URI photo100) {
        this.photo100 = photo100;
        return this;
    }

    public URI getPhoto200() {
        return photo200;
    }

    public ChatSettingsPhoto setPhoto200(URI photo200) {
        this.photo200 = photo200;
        return this;
    }

    public Boolean getIsDefaultPhoto() {
        return isDefaultPhoto;
    }

    public ChatSettingsPhoto setIsDefaultPhoto(Boolean isDefaultPhoto) {
        this.isDefaultPhoto = isDefaultPhoto;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo100, photo50, photo200, isDefaultPhoto);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatSettingsPhoto chatSettingsPhoto = (ChatSettingsPhoto) o;
        return Objects.equals(photo50, chatSettingsPhoto.photo50) &&
                Objects.equals(isDefaultPhoto, chatSettingsPhoto.isDefaultPhoto) &&
                Objects.equals(photo100, chatSettingsPhoto.photo100) &&
                Objects.equals(photo200, chatSettingsPhoto.photo200);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ChatSettingsPhoto{");
        sb.append("photo50=").append(photo50);
        sb.append(", isDefaultPhoto=").append(isDefaultPhoto);
        sb.append(", photo100=").append(photo100);
        sb.append(", photo200=").append(photo200);
        sb.append('}');
        return sb.toString();
    }
}
