package com.vk.api.sdk.objects.photos.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * SaveOwnerPhotoResponse object
 */
public class SaveOwnerPhotoResponse implements Validable {
    /**
     * Parameter for saveProfilePhoto method
     */
    @SerializedName("photo_hash")
    private String photoHash;

    /**
     * Uploaded image url
     */
    @SerializedName("photo_src")
    private String photoSrc;

    public String getPhotoHash() {
        return photoHash;
    }

    public SaveOwnerPhotoResponse setPhotoHash(String photoHash) {
        this.photoHash = photoHash;
        return this;
    }

    public String getPhotoSrc() {
        return photoSrc;
    }

    public SaveOwnerPhotoResponse setPhotoSrc(String photoSrc) {
        this.photoSrc = photoSrc;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photoSrc, photoHash);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveOwnerPhotoResponse saveOwnerPhotoResponse = (SaveOwnerPhotoResponse) o;
        return Objects.equals(photoHash, saveOwnerPhotoResponse.photoHash) &&
                Objects.equals(photoSrc, saveOwnerPhotoResponse.photoSrc);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SaveOwnerPhotoResponse{");
        sb.append("photoHash='").append(photoHash).append("'");
        sb.append(", photoSrc='").append(photoSrc).append("'");
        sb.append('}');
        return sb.toString();
    }
}
