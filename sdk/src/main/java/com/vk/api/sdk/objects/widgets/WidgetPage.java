package com.vk.api.sdk.objects.widgets;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.ObjectCount;
import java.net.URI;
import java.util.Objects;

/**
 * WidgetPage object
 */
public class WidgetPage implements Validable {
    @SerializedName("comments")
    private ObjectCount comments;

    /**
     * Date when widgets on the page has been initialized firstly in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Page description
     */
    @SerializedName("description")
    private String description;

    /**
     * Page ID
     */
    @SerializedName("id")
    private Integer id;

    @SerializedName("likes")
    private ObjectCount likes;

    /**
     * page_id parameter value
     */
    @SerializedName("page_id")
    private String pageId;

    /**
     * URL of the preview image
     */
    @SerializedName("photo")
    private URI photo;

    /**
     * Page title
     */
    @SerializedName("title")
    private String title;

    /**
     * Page absolute URL
     */
    @SerializedName("url")
    private URI url;

    public ObjectCount getComments() {
        return comments;
    }

    public WidgetPage setComments(ObjectCount comments) {
        this.comments = comments;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public WidgetPage setDate(Integer date) {
        this.date = date;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public WidgetPage setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public WidgetPage setId(Integer id) {
        this.id = id;
        return this;
    }

    public ObjectCount getLikes() {
        return likes;
    }

    public WidgetPage setLikes(ObjectCount likes) {
        this.likes = likes;
        return this;
    }

    public String getPageId() {
        return pageId;
    }

    public WidgetPage setPageId(String pageId) {
        this.pageId = pageId;
        return this;
    }

    public URI getPhoto() {
        return photo;
    }

    public WidgetPage setPhoto(URI photo) {
        this.photo = photo;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public WidgetPage setTitle(String title) {
        this.title = title;
        return this;
    }

    public URI getUrl() {
        return url;
    }

    public WidgetPage setUrl(URI url) {
        this.url = url;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, comments, description, photo, id, pageId, title, url, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WidgetPage widgetPage = (WidgetPage) o;
        return Objects.equals(date, widgetPage.date) &&
                Objects.equals(pageId, widgetPage.pageId) &&
                Objects.equals(comments, widgetPage.comments) &&
                Objects.equals(description, widgetPage.description) &&
                Objects.equals(photo, widgetPage.photo) &&
                Objects.equals(id, widgetPage.id) &&
                Objects.equals(title, widgetPage.title) &&
                Objects.equals(url, widgetPage.url) &&
                Objects.equals(likes, widgetPage.likes);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("WidgetPage{");
        sb.append("date=").append(date);
        sb.append(", pageId='").append(pageId).append("'");
        sb.append(", comments=").append(comments);
        sb.append(", description='").append(description).append("'");
        sb.append(", photo=").append(photo);
        sb.append(", id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append(", url=").append(url);
        sb.append(", likes=").append(likes);
        sb.append('}');
        return sb.toString();
    }
}
