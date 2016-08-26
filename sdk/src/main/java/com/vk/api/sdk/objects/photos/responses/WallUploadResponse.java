package com.vk.api.sdk.objects.photos.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * WallUploadResponse object
 */
public class WallUploadResponse {
    /**
     * Upload server number
     */
    @SerializedName("server")
    private Integer server;

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

    public Integer getServer() {
        return server;
    }

    public String getPhoto() {
        return photo;
    }

    public String getHash() {
        return hash;
    }

    @Override
    public int hashCode() {
        return Objects.hash(server, photo, hash);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WallUploadResponse wallUploadResponse = (WallUploadResponse) o;
        return Objects.equals(server, wallUploadResponse.server) &&
                Objects.equals(photo, wallUploadResponse.photo) &&
                Objects.equals(hash, wallUploadResponse.hash);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WallUploadResponse{");
        sb.append("server=").append(server);
        sb.append(", photo='").append(photo).append("'");
        sb.append(", hash='").append(hash).append("'");
        sb.append('}');
        return sb.toString();
    }
}
