package com.vk.api.sdk.objects.articles;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.photos.Photo;
import java.net.URL;
import java.util.Objects;

/**
 * Article object
 */
public class Article implements Validable {
    /**
     * Article access key
     */
    @SerializedName("access_key")
    private String accessKey;

    /**
     * Article id
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Information whether the current article has been added to bookmarks
     */
    @SerializedName("is_favorite")
    private Boolean isFavorite;

    /**
     * Article owner id
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Article owner name
     */
    @SerializedName("owner_name")
    private String ownerName;

    /**
     * Link to article's owner photo
     */
    @SerializedName("owner_photo")
    private String ownerPhoto;

    /**
     * Article cover
     */
    @SerializedName("photo")
    private Photo photo;

    /**
     * Article publish date in Unixtime
     */
    @SerializedName("published_date")
    private Integer publishedDate;

    @SerializedName("state")
    private ArticleState state;

    /**
     * Article subtitle
     */
    @SerializedName("subtitle")
    private String subtitle;

    /**
     * Article title
     */
    @SerializedName("title")
    private String title;

    /**
     * Article URL
     */
    @SerializedName("url")
    private URL url;

    /**
     * Article URL for opening in webview
     */
    @SerializedName("view_url")
    private URL viewUrl;

    /**
     * Number of views
     */
    @SerializedName("views")
    private Integer views;

    public String getAccessKey() {
        return accessKey;
    }

    public Article setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Article setId(Integer id) {
        this.id = id;
        return this;
    }

    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public Article setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Article setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public Article setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    public String getOwnerPhoto() {
        return ownerPhoto;
    }

    public Article setOwnerPhoto(String ownerPhoto) {
        this.ownerPhoto = ownerPhoto;
        return this;
    }

    public Photo getPhoto() {
        return photo;
    }

    public Article setPhoto(Photo photo) {
        this.photo = photo;
        return this;
    }

    public Integer getPublishedDate() {
        return publishedDate;
    }

    public Article setPublishedDate(Integer publishedDate) {
        this.publishedDate = publishedDate;
        return this;
    }

    public ArticleState getState() {
        return state;
    }

    public Article setState(ArticleState state) {
        this.state = state;
        return this;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public Article setSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Article setTitle(String title) {
        this.title = title;
        return this;
    }

    public URL getUrl() {
        return url;
    }

    public Article setUrl(URL url) {
        this.url = url;
        return this;
    }

    public URL getViewUrl() {
        return viewUrl;
    }

    public Article setViewUrl(URL viewUrl) {
        this.viewUrl = viewUrl;
        return this;
    }

    public Integer getViews() {
        return views;
    }

    public Article setViews(Integer views) {
        this.views = views;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerPhoto, photo, ownerId, title, url, ownerName, accessKey, subtitle, viewUrl, id, state, publishedDate, views, isFavorite);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(isFavorite, article.isFavorite) &&
                Objects.equals(ownerName, article.ownerName) &&
                Objects.equals(ownerId, article.ownerId) &&
                Objects.equals(photo, article.photo) &&
                Objects.equals(title, article.title) &&
                Objects.equals(url, article.url) &&
                Objects.equals(ownerPhoto, article.ownerPhoto) &&
                Objects.equals(accessKey, article.accessKey) &&
                Objects.equals(subtitle, article.subtitle) &&
                Objects.equals(viewUrl, article.viewUrl) &&
                Objects.equals(id, article.id) &&
                Objects.equals(state, article.state) &&
                Objects.equals(publishedDate, article.publishedDate) &&
                Objects.equals(views, article.views);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Article{");
        sb.append("isFavorite=").append(isFavorite);
        sb.append(", ownerName='").append(ownerName).append("'");
        sb.append(", ownerId=").append(ownerId);
        sb.append(", photo=").append(photo);
        sb.append(", title='").append(title).append("'");
        sb.append(", url=").append(url);
        sb.append(", ownerPhoto='").append(ownerPhoto).append("'");
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", subtitle='").append(subtitle).append("'");
        sb.append(", viewUrl=").append(viewUrl);
        sb.append(", id=").append(id);
        sb.append(", state=").append(state);
        sb.append(", publishedDate=").append(publishedDate);
        sb.append(", views=").append(views);
        sb.append('}');
        return sb.toString();
    }
}
