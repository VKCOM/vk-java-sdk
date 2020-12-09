package com.vk.api.sdk.objects.pages.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.pages.PrivacySettings;
import java.net.URI;
import java.util.Objects;

/**
 * GetVersionResponse object
 */
public class GetVersionResponse implements Validable {
    /**
     * Date when the page has been created in Unixtime
     */
    @SerializedName("created")
    @Required
    private Integer created;

    /**
     * Page creator ID
     */
    @SerializedName("creator_id")
    private Integer creatorId;

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
     * Date when the page has been edited in Unixtime
     */
    @SerializedName("edited")
    @Required
    private Integer edited;

    /**
     * Last editor ID
     */
    @SerializedName("editor_id")
    private Integer editorId;

    /**
     * Community ID
     */
    @SerializedName("group_id")
    private Integer groupId;

    /**
     * Page content, HTML
     */
    @SerializedName("html")
    private String html;

    /**
     * Page ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Page content, wiki
     */
    @SerializedName("source")
    private String source;

    /**
     * Page title
     */
    @SerializedName("title")
    @Required
    private String title;

    /**
     * URL of the page preview
     */
    @SerializedName("view_url")
    private URI viewUrl;

    /**
     * Views number
     */
    @SerializedName("views")
    @Required
    private Integer views;

    /**
     * Edit settings of the page
     */
    @SerializedName("who_can_edit")
    private PrivacySettings whoCanEdit;

    /**
     * View settings of the page
     */
    @SerializedName("who_can_view")
    private PrivacySettings whoCanView;

    public Integer getCreated() {
        return created;
    }

    public GetVersionResponse setCreated(Integer created) {
        this.created = created;
        return this;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public GetVersionResponse setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    public boolean isCurrentUserCanEdit() {
        return currentUserCanEdit == BoolInt.YES;
    }

    public BoolInt getCurrentUserCanEdit() {
        return currentUserCanEdit;
    }

    public boolean isCurrentUserCanEditAccess() {
        return currentUserCanEditAccess == BoolInt.YES;
    }

    public BoolInt getCurrentUserCanEditAccess() {
        return currentUserCanEditAccess;
    }

    public Integer getEdited() {
        return edited;
    }

    public GetVersionResponse setEdited(Integer edited) {
        this.edited = edited;
        return this;
    }

    public Integer getEditorId() {
        return editorId;
    }

    public GetVersionResponse setEditorId(Integer editorId) {
        this.editorId = editorId;
        return this;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public GetVersionResponse setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getHtml() {
        return html;
    }

    public GetVersionResponse setHtml(String html) {
        this.html = html;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GetVersionResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getSource() {
        return source;
    }

    public GetVersionResponse setSource(String source) {
        this.source = source;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public GetVersionResponse setTitle(String title) {
        this.title = title;
        return this;
    }

    public URI getViewUrl() {
        return viewUrl;
    }

    public GetVersionResponse setViewUrl(URI viewUrl) {
        this.viewUrl = viewUrl;
        return this;
    }

    public Integer getViews() {
        return views;
    }

    public GetVersionResponse setViews(Integer views) {
        this.views = views;
        return this;
    }

    public PrivacySettings getWhoCanEdit() {
        return whoCanEdit;
    }

    public GetVersionResponse setWhoCanEdit(PrivacySettings whoCanEdit) {
        this.whoCanEdit = whoCanEdit;
        return this;
    }

    public PrivacySettings getWhoCanView() {
        return whoCanView;
    }

    public GetVersionResponse setWhoCanView(PrivacySettings whoCanView) {
        this.whoCanView = whoCanView;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(editorId, edited, whoCanView, created, currentUserCanEditAccess, groupId, creatorId, source, title, whoCanEdit, viewUrl, currentUserCanEdit, html, id, views);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetVersionResponse getVersionResponse = (GetVersionResponse) o;
        return Objects.equals(whoCanView, getVersionResponse.whoCanView) &&
                Objects.equals(edited, getVersionResponse.edited) &&
                Objects.equals(created, getVersionResponse.created) &&
                Objects.equals(editorId, getVersionResponse.editorId) &&
                Objects.equals(source, getVersionResponse.source) &&
                Objects.equals(title, getVersionResponse.title) &&
                Objects.equals(whoCanEdit, getVersionResponse.whoCanEdit) &&
                Objects.equals(currentUserCanEdit, getVersionResponse.currentUserCanEdit) &&
                Objects.equals(groupId, getVersionResponse.groupId) &&
                Objects.equals(creatorId, getVersionResponse.creatorId) &&
                Objects.equals(viewUrl, getVersionResponse.viewUrl) &&
                Objects.equals(html, getVersionResponse.html) &&
                Objects.equals(id, getVersionResponse.id) &&
                Objects.equals(currentUserCanEditAccess, getVersionResponse.currentUserCanEditAccess) &&
                Objects.equals(views, getVersionResponse.views);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetVersionResponse{");
        sb.append("whoCanView=").append(whoCanView);
        sb.append(", edited=").append(edited);
        sb.append(", created=").append(created);
        sb.append(", editorId=").append(editorId);
        sb.append(", source='").append(source).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append(", whoCanEdit=").append(whoCanEdit);
        sb.append(", currentUserCanEdit=").append(currentUserCanEdit);
        sb.append(", groupId=").append(groupId);
        sb.append(", creatorId=").append(creatorId);
        sb.append(", viewUrl=").append(viewUrl);
        sb.append(", html='").append(html).append("'");
        sb.append(", id=").append(id);
        sb.append(", currentUserCanEditAccess=").append(currentUserCanEditAccess);
        sb.append(", views=").append(views);
        sb.append('}');
        return sb.toString();
    }
}
