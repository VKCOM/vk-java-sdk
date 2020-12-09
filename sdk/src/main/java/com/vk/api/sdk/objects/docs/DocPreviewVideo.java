package com.vk.api.sdk.objects.docs;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.net.URI;
import java.util.Objects;

/**
 * DocPreviewVideo object
 */
public class DocPreviewVideo implements Validable {
    /**
     * Video URL
     */
    @SerializedName("src")
    @Required
    private URI src;

    /**
     * Video's width in pixels
     */
    @SerializedName("width")
    @Required
    private Integer width;

    /**
     * Video's height in pixels
     */
    @SerializedName("height")
    @Required
    private Integer height;

    /**
     * Video file size in bites
     */
    @SerializedName("file_size")
    private Integer fileSize;

    public URI getSrc() {
        return src;
    }

    public DocPreviewVideo setSrc(URI src) {
        this.src = src;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public DocPreviewVideo setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public DocPreviewVideo setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public DocPreviewVideo setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(src, fileSize, width, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocPreviewVideo docPreviewVideo = (DocPreviewVideo) o;
        return Objects.equals(src, docPreviewVideo.src) &&
                Objects.equals(width, docPreviewVideo.width) &&
                Objects.equals(fileSize, docPreviewVideo.fileSize) &&
                Objects.equals(height, docPreviewVideo.height);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("DocPreviewVideo{");
        sb.append("src=").append(src);
        sb.append(", width=").append(width);
        sb.append(", fileSize=").append(fileSize);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
