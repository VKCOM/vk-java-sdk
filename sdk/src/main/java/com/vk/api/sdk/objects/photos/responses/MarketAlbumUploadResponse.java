package com.vk.api.sdk.objects.photos.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * MarketAlbumUploadResponse object
 */
public class MarketAlbumUploadResponse {
    /**
     * Community ID
     */
    @SerializedName("gid")
    private Integer gid;

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

    public Integer getGid() {
        return gid;
    }

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
        return Objects.hash(server, gid, photo, hash);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketAlbumUploadResponse marketAlbumUploadResponse = (MarketAlbumUploadResponse) o;
        return Objects.equals(gid, marketAlbumUploadResponse.gid) &&
                Objects.equals(server, marketAlbumUploadResponse.server) &&
                Objects.equals(photo, marketAlbumUploadResponse.photo) &&
                Objects.equals(hash, marketAlbumUploadResponse.hash);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MarketAlbumUploadResponse{");
        sb.append("gid=").append(gid);
        sb.append(", server=").append(server);
        sb.append(", photo='").append(photo).append("'");
        sb.append(", hash='").append(hash).append("'");
        sb.append('}');
        return sb.toString();
    }
}
