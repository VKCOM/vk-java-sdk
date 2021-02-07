package com.vk.api.sdk.objects.stories.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * UploadResponse object
 */
public class UploadResponse implements Validable {
    /**
     * A string hash that is used in the stories.save method
     */
    @SerializedName("upload_result")
    private String uploadResult;

    public String getUploadResult() {
        return uploadResult;
    }

    public UploadResponse setUploadResult(String uploadResult) {
        this.uploadResult = uploadResult;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadResult);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UploadResponse uploadResponse = (UploadResponse) o;
        return Objects.equals(uploadResult, uploadResponse.uploadResult);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UploadResponse{");
        sb.append("uploadResult='").append(uploadResult).append("'");
        sb.append('}');
        return sb.toString();
    }
}
