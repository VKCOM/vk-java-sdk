package com.vk.api.sdk.objects.docs;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.net.URL;
import java.util.Objects;

/**
 * DocPreviewVideo object
 */
public class DocPreviewVideo implements Validable {
    /**
     * Video file size in bites
     */
    @SerializedName("filesize")
    @Required
    private Integer filesize;

    /**
     * Video's height in pixels
     */
    @SerializedName("height")
    @Required
    private Integer height;

    /**
     * Video URL
     */
    @SerializedName("src")
    @Required
    private URL src;

    /**
     * Video's width in pixels
     */
    @SerializedName("width")
    @Required
    private Integer width;

    public Integer getFilesize() {
        return filesize;
    }

    public DocPreviewVideo setFilesize(Integer filesize) {
        this.filesize = filesize;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public DocPreviewVideo setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public URL getSrc() {
        return src;
    }

    public DocPreviewVideo setSrc(URL src) {
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

    @Override
    public int hashCode() {
        return Objects.hash(src, width, filesize, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocPreviewVideo docPreviewVideo = (DocPreviewVideo) o;
        return Objects.equals(src, docPreviewVideo.src) &&
                Objects.equals(width, docPreviewVideo.width) &&
                Objects.equals(filesize, docPreviewVideo.filesize) &&
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
        sb.append(", filesize=").append(filesize);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
