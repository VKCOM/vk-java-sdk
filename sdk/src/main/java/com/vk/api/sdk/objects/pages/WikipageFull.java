package com.vk.api.sdk.objects.pages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * WikipageFull object
 */
public class WikipageFull {
    /**
     * Page ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Community ID
     */
    @SerializedName("group_id")
    private Integer groupId;

    /**
     * Page title
     */
    @SerializedName("title")
    private String title;

    /**
     * Information whether current user can edit the page
     */
    @SerializedName("current_user_can_edit")
    private BoolInt currentUserCanEdit;

    /**
     * Information whether current user can edit the page access settings
     */
    @SerializedName("current_user_can_edit_access")
    private BoolInt currentUserCanEditAccess;

    /**
     * View settings of the page
     */
    @SerializedName("who_can_view")
    private PrivacySettings whoCanView;

    /**
     * Edit settings of the page
     */
    @SerializedName("who_can_edit")
    private PrivacySettings whoCanEdit;

    /**
     * Date when the page has been edited in Unixtime
     */
    @SerializedName("edited")
    private Integer edited;

    /**
     * Date when the page has been created in Unixtime
     */
    @SerializedName("created")
    private Integer created;

    /**
     * Views number
     */
    @SerializedName("views")
    private Integer views;

    /**
     * Last editor ID
     */
    @SerializedName("editor_id")
    private Integer editorId;

    /**
     * Page creator ID
     */
    @SerializedName("creator_id")
    private Integer creatorId;

    /**
     * Page content, wiki
     */
    @SerializedName("source")
    private String source;

    /**
     * Page content, HTML
     */
    @SerializedName("html")
    private String html;

    /**
     * URL of the page preview
     */
    @SerializedName("view_url")
    private String viewUrl;

    public Integer getId() {
        return id;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCurrentUserCanEdit() {
        return currentUserCanEdit == BoolInt.YES;
    }

    public boolean isCurrentUserCanEditAccess() {
        return currentUserCanEditAccess == BoolInt.YES;
    }

    public PrivacySettings getWhoCanView() {
        return whoCanView;
    }

    public PrivacySettings getWhoCanEdit() {
        return whoCanEdit;
    }

    public Integer getEdited() {
        return edited;
    }

    public Integer getCreated() {
        return created;
    }

    public Integer getViews() {
        return views;
    }

    public Integer getEditorId() {
        return editorId;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public String getSource() {
        return source;
    }

    public String getHtml() {
        return html;
    }

    public String getViewUrl() {
        return viewUrl;
    }

    @Override
    public int hashCode() {
        return Objects.hash(editorId, edited, currentUserCanEditAccess, whoCanView, created, groupId, creatorId, source, title, whoCanEdit, viewUrl, currentUserCanEdit, html, id, views);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WikipageFull wikipageFull = (WikipageFull) o;
        return Objects.equals(id, wikipageFull.id) &&
                Objects.equals(groupId, wikipageFull.groupId) &&
                Objects.equals(title, wikipageFull.title) &&
                Objects.equals(currentUserCanEdit, wikipageFull.currentUserCanEdit) &&
                Objects.equals(currentUserCanEditAccess, wikipageFull.currentUserCanEditAccess) &&
                Objects.equals(whoCanView, wikipageFull.whoCanView) &&
                Objects.equals(whoCanEdit, wikipageFull.whoCanEdit) &&
                Objects.equals(edited, wikipageFull.edited) &&
                Objects.equals(created, wikipageFull.created) &&
                Objects.equals(views, wikipageFull.views) &&
                Objects.equals(editorId, wikipageFull.editorId) &&
                Objects.equals(creatorId, wikipageFull.creatorId) &&
                Objects.equals(source, wikipageFull.source) &&
                Objects.equals(html, wikipageFull.html) &&
                Objects.equals(viewUrl, wikipageFull.viewUrl);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WikipageFull{");
        sb.append("id=").append(id);
        sb.append(", groupId=").append(groupId);
        sb.append(", title='").append(title).append("'");
        sb.append(", currentUserCanEdit=").append(currentUserCanEdit);
        sb.append(", currentUserCanEditAccess=").append(currentUserCanEditAccess);
        sb.append(", whoCanView=").append(whoCanView);
        sb.append(", whoCanEdit=").append(whoCanEdit);
        sb.append(", edited=").append(edited);
        sb.append(", created=").append(created);
        sb.append(", views=").append(views);
        sb.append(", editorId=").append(editorId);
        sb.append(", creatorId=").append(creatorId);
        sb.append(", source='").append(source).append("'");
        sb.append(", html='").append(html).append("'");
        sb.append(", viewUrl='").append(viewUrl).append("'");
        sb.append('}');
        return sb.toString();
    }
}
