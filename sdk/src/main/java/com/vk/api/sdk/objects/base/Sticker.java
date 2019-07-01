package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.List;
import java.util.Objects;

/**
 * Sticker object
 */
public class Sticker implements Validable {
    @SerializedName("images")
    private List<Image> images;

    @SerializedName("images_with_background")
    private List<Image> imagesWithBackground;

    /**
     * Collection ID
     */
    @SerializedName("product_id")
    private Integer productId;

    /**
     * Sticker ID
     */
    @SerializedName("sticker_id")
    private Integer stickerId;

    public List<Image> getImages() {
        return images;
    }

    public Sticker setImages(List<Image> images) {
        this.images = images;
        return this;
    }

    public List<Image> getImagesWithBackground() {
        return imagesWithBackground;
    }

    public Sticker setImagesWithBackground(List<Image> imagesWithBackground) {
        this.imagesWithBackground = imagesWithBackground;
        return this;
    }

    public Integer getProductId() {
        return productId;
    }

    public Sticker setProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    public Integer getStickerId() {
        return stickerId;
    }

    public Sticker setStickerId(Integer stickerId) {
        this.stickerId = stickerId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(images, productId, imagesWithBackground, stickerId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sticker sticker = (Sticker) o;
        return Objects.equals(images, sticker.images) &&
                Objects.equals(stickerId, sticker.stickerId) &&
                Objects.equals(productId, sticker.productId) &&
                Objects.equals(imagesWithBackground, sticker.imagesWithBackground);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Sticker{");
        sb.append("images=").append(images);
        sb.append(", stickerId=").append(stickerId);
        sb.append(", productId=").append(productId);
        sb.append(", imagesWithBackground=").append(imagesWithBackground);
        sb.append('}');
        return sb.toString();
    }
}
