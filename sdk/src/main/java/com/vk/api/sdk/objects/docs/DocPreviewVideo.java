package com.vk.api.sdk.objects.docs;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * DocPreviewVideo object
 */
public class DocPreviewVideo {

    /**
     * Video url
     */
    @SerializedName("src")
    private String src;

    /**
     * Video's width in pixels
     */
    @SerializedName("width")
    private Integer width;

    /**
     * Video's height in pixels
     */
    @SerializedName("height")
    private Integer height;

    /**
     * Video file size in bites
     */
    @SerializedName("filesize")
    private Integer filesize;

    public String getSrc() {
        return src;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getFilesize() {
        return filesize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocPreviewVideo that = (DocPreviewVideo) o;
        return Objects.equals(src, that.src) &&
                Objects.equals(width, that.width) &&
                Objects.equals(height, that.height) &&
                Objects.equals(filesize, that.filesize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(src, width, height, filesize);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DocPreviewVideo{");
        sb.append("src='").append(src).append('\'');
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", filesize=").append(filesize);
        sb.append('}');
        return sb.toString();
    }
}
