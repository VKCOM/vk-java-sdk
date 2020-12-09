package com.vk.api.sdk.objects.docs;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.net.URI;
import java.util.Objects;

/**
 * DocPreviewGraffiti object
 */
public class DocPreviewGraffiti implements Validable {
    /**
     * Graffiti file URL
     */
    @SerializedName("src")
    @Required
    private URI src;

    /**
     * Graffiti width
     */
    @SerializedName("width")
    @Required
    private Integer width;

    /**
     * Graffiti height
     */
    @SerializedName("height")
    @Required
    private Integer height;

    public URI getSrc() {
        return src;
    }

    public DocPreviewGraffiti setSrc(URI src) {
        this.src = src;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public DocPreviewGraffiti setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public DocPreviewGraffiti setHeight(Integer height) {
        this.height = height;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(src, width, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocPreviewGraffiti docPreviewGraffiti = (DocPreviewGraffiti) o;
        return Objects.equals(src, docPreviewGraffiti.src) &&
                Objects.equals(width, docPreviewGraffiti.width) &&
                Objects.equals(height, docPreviewGraffiti.height);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("DocPreviewGraffiti{");
        sb.append("src=").append(src);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
