package com.vk.api.sdk.objects.photos.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * MarketUploadResponse object
 */
public class MarketUploadResponse {
    /**
     * Community ID
     */
    @SerializedName("group_id")
    private Integer groupId;

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

    /**
     * Crop data
     */
    @SerializedName("crop_data")
    private String cropData;

    /**
     * Crop hash
     */
    @SerializedName("crop_hash")
    private String cropHash;

    public Integer getGroupId() {
        return groupId;
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

    public String getCropData() {
        return cropData;
    }

    public String getCropHash() {
        return cropHash;
    }

    @Override
    public int hashCode() {
        return Objects.hash(server, cropData, groupId, photo, hash, cropHash);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketUploadResponse marketUploadResponse = (MarketUploadResponse) o;
        return Objects.equals(groupId, marketUploadResponse.groupId) &&
                Objects.equals(server, marketUploadResponse.server) &&
                Objects.equals(photo, marketUploadResponse.photo) &&
                Objects.equals(hash, marketUploadResponse.hash) &&
                Objects.equals(cropData, marketUploadResponse.cropData) &&
                Objects.equals(cropHash, marketUploadResponse.cropHash);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MarketUploadResponse{");
        sb.append("groupId=").append(groupId);
        sb.append(", server=").append(server);
        sb.append(", photo='").append(photo).append("'");
        sb.append(", hash='").append(hash).append("'");
        sb.append(", cropData='").append(cropData).append("'");
        sb.append(", cropHash='").append(cropHash).append("'");
        sb.append('}');
        return sb.toString();
    }
}
