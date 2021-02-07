package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URI;
import java.util.Objects;

/**
 * UploadServer object
 */
public class UploadServer implements Validable {
    /**
     * Upload URL
     */
    @SerializedName("upload_url")
    private URI uploadUrl;

    public URI getUploadUrl() {
        return uploadUrl;
    }

    public UploadServer setUploadUrl(URI uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadUrl);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UploadServer uploadServer = (UploadServer) o;
        return Objects.equals(uploadUrl, uploadServer.uploadUrl);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UploadServer{");
        sb.append("uploadUrl=").append(uploadUrl);
        sb.append('}');
        return sb.toString();
    }
}
