package com.vk.api.sdk.objects.widgets;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BaseCount;

import java.util.Objects;

/**
 * WidgetPage object
 */
public class WidgetPage {
    /**
     * Page ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Page title
     */
    @SerializedName("title")
    private String title;

    /**
     * Page description
     */
    @SerializedName("description")
    private String description;

    /**
     * URL of the preview image
     */
    @SerializedName("photo")
    private String photo;

    /**
     * Page abcolute URL
     */
    @SerializedName("url")
    private String url;

    @SerializedName("likes")
    private BaseCount likes;

    @SerializedName("comments")
    private BaseCount comments;

    /**
     * Date when widgets on the page has been initialized firstly in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * page_id parameter value
     */
    @SerializedName("page_id")
    private String pageId;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPhoto() {
        return photo;
    }

    public String getUrl() {
        return url;
    }

    public BaseCount getLikes() {
        return likes;
    }

    public BaseCount getComments() {
        return comments;
    }

    public Integer getDate() {
        return date;
    }

    public String getPageId() {
        return pageId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, comments, description, photo, id, title, pageId, url, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WidgetPage widgetPage = (WidgetPage) o;
        return Objects.equals(id, widgetPage.id) &&
                Objects.equals(title, widgetPage.title) &&
                Objects.equals(description, widgetPage.description) &&
                Objects.equals(photo, widgetPage.photo) &&
                Objects.equals(url, widgetPage.url) &&
                Objects.equals(likes, widgetPage.likes) &&
                Objects.equals(comments, widgetPage.comments) &&
                Objects.equals(date, widgetPage.date) &&
                Objects.equals(pageId, widgetPage.pageId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WidgetPage{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append(", description='").append(description).append("'");
        sb.append(", photo='").append(photo).append("'");
        sb.append(", url='").append(url).append("'");
        sb.append(", likes=").append(likes);
        sb.append(", comments=").append(comments);
        sb.append(", date=").append(date);
        sb.append(", pageId='").append(pageId).append("'");
        sb.append('}');
        return sb.toString();
    }
}
