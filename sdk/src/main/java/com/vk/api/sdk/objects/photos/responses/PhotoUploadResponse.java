package com.vk.api.sdk.objects.photos.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * PhotoUploadResponse object
 */
public class PhotoUploadResponse {
    /**
     * Upload server number
     */
    @SerializedName("server")
    private Integer server;

    /**
     * Uploaded photos data
     */
    @SerializedName("photos_list")
    private String photosList;

    /**
     * Album ID
     */
    @SerializedName("aid")
    private Integer aid;

    /**
     * Uploading hash
     */
    @SerializedName("hash")
    private String hash;

    public Integer getServer() {
        return server;
    }

    public String getPhotosList() {
        return photosList;
    }

    public Integer getAid() {
        return aid;
    }

    public String getHash() {
        return hash;
    }

    @Override
    public int hashCode() {
        return Objects.hash(server, photosList, aid, hash);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoUploadResponse photoUploadResponse = (PhotoUploadResponse) o;
        return Objects.equals(server, photoUploadResponse.server) &&
                Objects.equals(photosList, photoUploadResponse.photosList) &&
                Objects.equals(aid, photoUploadResponse.aid) &&
                Objects.equals(hash, photoUploadResponse.hash);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PhotoUploadResponse{");
        sb.append("server=").append(server);
        sb.append(", photosList='").append(photosList).append("'");
        sb.append(", aid=").append(aid);
        sb.append(", hash='").append(hash).append("'");
        sb.append('}');
        return sb.toString();
    }
}
