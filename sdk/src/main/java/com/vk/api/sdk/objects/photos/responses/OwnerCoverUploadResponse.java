package com.vk.api.sdk.objects.photos.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * OwnerCoverUploadResponse object
 */
public class OwnerCoverUploadResponse {

    /**
     * Uploaded photo data
     */
    @SerializedName("photo")
    private String photo;

    /**
     * Uploading hash
     */
    @SerializedName("hash")
    private String hash;

    public String getPhoto() {
        return photo;
    }

    public String getHash() {
        return hash;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo, hash);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OwnerCoverUploadResponse ownerUploadResponse = (OwnerCoverUploadResponse) o;
        return Objects.equals(photo, ownerUploadResponse.photo) &&
                Objects.equals(hash, ownerUploadResponse.hash);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OwnerCoverUploadResponse{");
        sb.append("photo='").append(photo).append("'");
        sb.append(", hash='").append(hash).append("'");
        sb.append('}');
        return sb.toString();
    }
}
