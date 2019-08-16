package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.photos.Photo;
import java.net.URL;
import java.util.Objects;

/**
 * Link object
 */
public class Link implements Validable {
    @SerializedName("application")
    private LinkApplication application;

    @SerializedName("button")
    private LinkButton button;

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

    /**
     * Link ID
     */
    @SerializedName("id")
    private String id;

    @SerializedName("is_favorite")
    private Boolean isFavorite;

    @SerializedName("photo")
    private Photo photo;

    /**
     * String ID of the page with article preview
     */
    @SerializedName("preview_page")
    private String previewPage;

    /**
     * URL of the page with article preview
     */
    @SerializedName("preview_url")
    private URL previewUrl;

    @SerializedName("product")
    private LinkProduct product;

    @SerializedName("rating")
    private LinkRating rating;

    /**
     * Link title
     */
    @SerializedName("title")
    private String title;

    /**
     * Link URL
     */
    @SerializedName("url")
    @Required
    private URL url;

    public LinkApplication getApplication() {
        return application;
    }

    public Link setApplication(LinkApplication application) {
        this.application = application;
        return this;
    }

    public LinkButton getButton() {
        return button;
    }

    public Link setButton(LinkButton button) {
        this.button = button;
        return this;
    }

    public String getCaption() {
        return caption;
    }

    public Link setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Link setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getId() {
        return id;
    }

    public Link setId(String id) {
        this.id = id;
        return this;
    }

    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public Link setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }

    public Photo getPhoto() {
        return photo;
    }

    public Link setPhoto(Photo photo) {
        this.photo = photo;
        return this;
    }

    public String getPreviewPage() {
        return previewPage;
    }

    public Link setPreviewPage(String previewPage) {
        this.previewPage = previewPage;
        return this;
    }

    public URL getPreviewUrl() {
        return previewUrl;
    }

    public Link setPreviewUrl(URL previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }

    public LinkProduct getProduct() {
        return product;
    }

    public Link setProduct(LinkProduct product) {
        this.product = product;
        return this;
    }

    public LinkRating getRating() {
        return rating;
    }

    public Link setRating(LinkRating rating) {
        this.rating = rating;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Link setTitle(String title) {
        this.title = title;
        return this;
    }

    public URL getUrl() {
        return url;
    }

    public Link setUrl(URL url) {
        this.url = url;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, previewUrl, rating, caption, description, photo, title, url, previewPage, button, application, id, isFavorite);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Link link = (Link) o;
        return Objects.equals(product, link.product) &&
                Objects.equals(isFavorite, link.isFavorite) &&
                Objects.equals(previewPage, link.previewPage) &&
                Objects.equals(rating, link.rating) &&
                Objects.equals(caption, link.caption) &&
                Objects.equals(description, link.description) &&
                Objects.equals(photo, link.photo) &&
                Objects.equals(title, link.title) &&
                Objects.equals(url, link.url) &&
                Objects.equals(button, link.button) &&
                Objects.equals(application, link.application) &&
                Objects.equals(previewUrl, link.previewUrl) &&
                Objects.equals(id, link.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Link{");
        sb.append("product=").append(product);
        sb.append(", isFavorite=").append(isFavorite);
        sb.append(", previewPage='").append(previewPage).append("'");
        sb.append(", rating=").append(rating);
        sb.append(", caption='").append(caption).append("'");
        sb.append(", description='").append(description).append("'");
        sb.append(", photo=").append(photo);
        sb.append(", title='").append(title).append("'");
        sb.append(", url=").append(url);
        sb.append(", button=").append(button);
        sb.append(", application=").append(application);
        sb.append(", previewUrl=").append(previewUrl);
        sb.append(", id='").append(id).append("'");
        sb.append('}');
        return sb.toString();
    }
}
