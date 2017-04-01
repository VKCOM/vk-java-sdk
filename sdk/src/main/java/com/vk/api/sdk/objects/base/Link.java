package com.vk.api.sdk.objects.base;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.photos.Photo;

import java.util.Objects;

/**
 * Link object
 */
public class Link {
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

    @SerializedName("application")
    private LinkApplication application;

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

    public LinkApplication getApplication() {
        return application;
    }

    @Override
    public int hashCode() {
        return Objects.hash(previewPage, button, product, previewUrl, rating, caption, description, photo, title, url);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Link link = (Link) o;
        return Objects.equals(url, link.url) &&
                Objects.equals(title, link.title) &&
                Objects.equals(caption, link.caption) &&
                Objects.equals(description, link.description) &&
                Objects.equals(photo, link.photo) &&
                Objects.equals(previewUrl, link.previewUrl) &&
                Objects.equals(previewPage, link.previewPage) &&
                Objects.equals(button, link.button) &&
                Objects.equals(product, link.product) &&
                Objects.equals(rating, link.rating) &&
                Objects.equals(application, link.application);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Link{");
        sb.append("url='").append(url).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append(", caption='").append(caption).append("'");
        sb.append(", description='").append(description).append("'");
        sb.append(", photo=").append(photo);
        sb.append(", previewUrl='").append(previewUrl).append("'");
        sb.append(", previewPage='").append(previewPage).append("'");
        sb.append(", button=").append(button);
        sb.append(", product=").append(product);
        sb.append(", rating=").append(rating);
        sb.append(", application=").append(application);
        sb.append('}');
        return sb.toString();
    }
}
