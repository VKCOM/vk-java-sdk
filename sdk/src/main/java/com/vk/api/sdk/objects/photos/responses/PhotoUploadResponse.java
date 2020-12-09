package com.vk.api.sdk.objects.photos.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * PhotoUploadResponse object
 */
public class PhotoUploadResponse implements Validable {
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

    /**
     * Uploaded photo data
     */
    @SerializedName("photo")
    private String photo;

    /**
     * Uploaded photos data
     */
    @SerializedName("photos_list")
    private String photosList;

    /**
     * Upload server number
     */
    @SerializedName("server")
    private Integer server;

    public Integer getAid() {
        return aid;
    }

    public PhotoUploadResponse setAid(Integer aid) {
        this.aid = aid;
        return this;
    }

    public String getHash() {
        return hash;
    }

    public PhotoUploadResponse setHash(String hash) {
        this.hash = hash;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public PhotoUploadResponse setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getPhotosList() {
        return photosList;
    }

    public PhotoUploadResponse setPhotosList(String photosList) {
        this.photosList = photosList;
        return this;
    }

    public Integer getServer() {
        return server;
    }

    public PhotoUploadResponse setServer(Integer server) {
        this.server = server;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(server, photo, photosList, aid, hash);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoUploadResponse photoUploadResponse = (PhotoUploadResponse) o;
        return Objects.equals(server, photoUploadResponse.server) &&
                Objects.equals(photo, photoUploadResponse.photo) &&
                Objects.equals(photosList, photoUploadResponse.photosList) &&
                Objects.equals(aid, photoUploadResponse.aid) &&
                Objects.equals(hash, photoUploadResponse.hash);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PhotoUploadResponse{");
        sb.append("server=").append(server);
        sb.append(", photo='").append(photo).append("'");
        sb.append(", photosList='").append(photosList).append("'");
        sb.append(", aid=").append(aid);
        sb.append(", hash='").append(hash).append("'");
        sb.append('}');
        return sb.toString();
    }
}
