package com.vk.api.sdk.objects.appwidgets.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * GetAppImageUploadServerResponse object
 */
public class GetAppImageUploadServerResponse implements Validable {
    /**
     * To upload an image, generate POST-request to upload_url with a file in photo field. Then call appWidgets.saveAppImage method
     */
    @SerializedName("upload_url")
    private String uploadUrl;

    public String getUploadUrl() {
        return uploadUrl;
    }

    public GetAppImageUploadServerResponse setUploadUrl(String uploadUrl) {
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
        GetAppImageUploadServerResponse getAppImageUploadServerResponse = (GetAppImageUploadServerResponse) o;
        return Objects.equals(uploadUrl, getAppImageUploadServerResponse.uploadUrl);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetAppImageUploadServerResponse{");
        sb.append("uploadUrl='").append(uploadUrl).append("'");
        sb.append('}');
        return sb.toString();
    }
}
