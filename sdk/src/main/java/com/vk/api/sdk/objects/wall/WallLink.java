package com.vk.api.sdk.objects.wall;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.photos.Photo;

import java.util.Objects;

/**
 * WallLink object
 */
public class WallLink {
    /**
     * Link URL
     */
    @SerializedName("url")
    private String url;

    /**
     * Link title
     */
    @SerializedName("title")
    private String title;

    /**
     * Link caption
     */
    @SerializedName("caption")
    private String caption;

    /**
     * Link description
     */
    @SerializedName("description")
    private String description;

    @SerializedName("photo")
    private Photo photo;

    /**
     * Information whether the link is external
     */
    @SerializedName("is_external")
    private BoolInt isExternal;

    /**
     * URL of the page with article preview
     */
    @SerializedName("preview_url")
    private String previewUrl;

    /**
     * String ID of the page with article preview
     */
    @SerializedName("preview_page")
    private String previewPage;

    @SerializedName("button")
    private LinkButton button;

    @SerializedName("product")
    private LinkProduct product;

    @SerializedName("rating")
    private LinkRating rating;

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getCaption() {
        return caption;
    }

    public String getDescription() {
        return description;
    }

    public Photo getPhoto() {
        return photo;
    }

    public boolean isIsExternal() {
        return isExternal == BoolInt.YES;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public String getPreviewPage() {
        return previewPage;
    }

    public LinkButton getButton() {
        return button;
    }

    public LinkProduct getProduct() {
        return product;
    }

    public LinkRating getRating() {
        return rating;
    }

    @Override
    public int hashCode() {
        return Objects.hash(previewPage, button, product, previewUrl, isExternal, rating, caption, description, photo, title, url);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WallLink wallLink = (WallLink) o;
        return Objects.equals(url, wallLink.url) &&
                Objects.equals(title, wallLink.title) &&
                Objects.equals(caption, wallLink.caption) &&
                Objects.equals(description, wallLink.description) &&
                Objects.equals(photo, wallLink.photo) &&
                Objects.equals(isExternal, wallLink.isExternal) &&
                Objects.equals(previewUrl, wallLink.previewUrl) &&
                Objects.equals(previewPage, wallLink.previewPage) &&
                Objects.equals(button, wallLink.button) &&
                Objects.equals(product, wallLink.product) &&
                Objects.equals(rating, wallLink.rating);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WallLink{");
        sb.append("url='").append(url).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append(", caption='").append(caption).append("'");
        sb.append(", description='").append(description).append("'");
        sb.append(", photo=").append(photo);
        sb.append(", isExternal=").append(isExternal);
        sb.append(", previewUrl='").append(previewUrl).append("'");
        sb.append(", previewPage='").append(previewPage).append("'");
        sb.append(", button=").append(button);
        sb.append(", product=").append(product);
        sb.append(", rating=").append(rating);
        sb.append('}');
        return sb.toString();
    }
}
