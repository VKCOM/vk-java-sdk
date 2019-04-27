package com.vk.api.sdk.objects.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class UploadImageResponse {

    @SerializedName("hash")
    private String hash;

    @SerializedName("image")
    private String image;

    public String getHash() {
        return hash;
    }

    public String getImage() {
        return image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UploadImageResponse that = (UploadImageResponse) o;
        return Objects.equals(hash, that.hash) &&
                Objects.equals(image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hash, image);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UploadImageResponse{");
        sb.append("hash='").append(hash).append('\'');
        sb.append(", image='").append(image).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
