package com.vk.api.sdk.objects.docs.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * DocUploadResponse object
 */
public class DocUploadResponse {
    /**
     * Uploaded file data
     */
    @SerializedName("file")
    private String file;

    public String getFile() {
        return file;
    }

    @Override
    public int hashCode() {
        return Objects.hash(file);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocUploadResponse docUploadResponse = (DocUploadResponse) o;
        return Objects.equals(file, docUploadResponse.file);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DocUploadResponse{");
        sb.append("file='").append(file).append("'");
        sb.append('}');
        return sb.toString();
    }
}
