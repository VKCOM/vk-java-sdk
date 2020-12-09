package com.vk.api.sdk.objects.gifts;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URI;
import java.util.Objects;

/**
 * Layout object
 */
public class Layout implements Validable {
    /**
     * Gift ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * URL of the preview image with 512 px in width
     */
    @SerializedName("thumb_512")
    private URI thumb512;

    /**
     * URL of the preview image with 256 px in width
     */
    @SerializedName("thumb_256")
    private URI thumb256;

    /**
     * URL of the preview image with 48 px in width
     */
    @SerializedName("thumb_48")
    private URI thumb48;

    /**
     * URL of the preview image with 96 px in width
     */
    @SerializedName("thumb_96")
    private URI thumb96;

    /**
     * ID of the sticker pack, if the gift is representing one
     */
    @SerializedName("stickers_product_id")
    private Integer stickersProductId;

    /**
     * Information whether gift represents a stickers style
     */
    @SerializedName("is_stickers_style")
    private Boolean isStickersStyle;

    /**
     * ID of the build of constructor gift
     */
    @SerializedName("build_id")
    private String buildId;

    /**
     * Keywords used for search
     */
    @SerializedName("keywords")
    private String keywords;

    public Integer getId() {
        return id;
    }

    public Layout setId(Integer id) {
        this.id = id;
        return this;
    }

    public URI getThumb512() {
        return thumb512;
    }

    public Layout setThumb512(URI thumb512) {
        this.thumb512 = thumb512;
        return this;
    }

    public URI getThumb256() {
        return thumb256;
    }

    public Layout setThumb256(URI thumb256) {
        this.thumb256 = thumb256;
        return this;
    }

    public URI getThumb48() {
        return thumb48;
    }

    public Layout setThumb48(URI thumb48) {
        this.thumb48 = thumb48;
        return this;
    }

    public URI getThumb96() {
        return thumb96;
    }

    public Layout setThumb96(URI thumb96) {
        this.thumb96 = thumb96;
        return this;
    }

    public Integer getStickersProductId() {
        return stickersProductId;
    }

    public Layout setStickersProductId(Integer stickersProductId) {
        this.stickersProductId = stickersProductId;
        return this;
    }

    public Boolean getIsStickersStyle() {
        return isStickersStyle;
    }

    public Layout setIsStickersStyle(Boolean isStickersStyle) {
        this.isStickersStyle = isStickersStyle;
        return this;
    }

    public String getBuildId() {
        return buildId;
    }

    public Layout setBuildId(String buildId) {
        this.buildId = buildId;
        return this;
    }

    public String getKeywords() {
        return keywords;
    }

    public Layout setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(keywords, thumb48, thumb512, thumb256, isStickersStyle, buildId, id, thumb96, stickersProductId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Layout layout = (Layout) o;
        return Objects.equals(thumb96, layout.thumb96) &&
                Objects.equals(stickersProductId, layout.stickersProductId) &&
                Objects.equals(isStickersStyle, layout.isStickersStyle) &&
                Objects.equals(keywords, layout.keywords) &&
                Objects.equals(buildId, layout.buildId) &&
                Objects.equals(thumb48, layout.thumb48) &&
                Objects.equals(id, layout.id) &&
                Objects.equals(thumb512, layout.thumb512) &&
                Objects.equals(thumb256, layout.thumb256);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Layout{");
        sb.append("thumb96=").append(thumb96);
        sb.append(", stickersProductId=").append(stickersProductId);
        sb.append(", isStickersStyle=").append(isStickersStyle);
        sb.append(", keywords='").append(keywords).append("'");
        sb.append(", buildId='").append(buildId).append("'");
        sb.append(", thumb48=").append(thumb48);
        sb.append(", id=").append(id);
        sb.append(", thumb512=").append(thumb512);
        sb.append(", thumb256=").append(thumb256);
        sb.append('}');
        return sb.toString();
    }
}
