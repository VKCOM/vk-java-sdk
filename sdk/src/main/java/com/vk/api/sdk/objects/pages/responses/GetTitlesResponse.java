package com.vk.api.sdk.objects.pages.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.pages.PrivacySettings;
import java.util.Objects;

/**
 * GetTitlesResponse object
 */
public class GetTitlesResponse implements Validable {
    /**
     * Page creator ID
     */
    @SerializedName("creator_id")
    private Integer creatorId;

    /**
     * Page creator name
     */
    @SerializedName("creator_name")
    private Integer creatorName;

    /**
     * Last editor ID
     */
    @SerializedName("editor_id")
    private Integer editorId;

    /**
     * Last editor name
     */
    @SerializedName("editor_name")
    private String editorName;

    /**
     * Community ID
     */
    @SerializedName("group_id")
    private Integer groupId;

    /**
     * Page ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Page title
     */
    @SerializedName("title")
    @Required
    private String title;

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

    public Integer getCreatorId() {
        return creatorId;
    }

    public GetTitlesResponse setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    public Integer getCreatorName() {
        return creatorName;
    }

    public GetTitlesResponse setCreatorName(Integer creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    public Integer getEditorId() {
        return editorId;
    }

    public GetTitlesResponse setEditorId(Integer editorId) {
        this.editorId = editorId;
        return this;
    }

    public String getEditorName() {
        return editorName;
    }

    public GetTitlesResponse setEditorName(String editorName) {
        this.editorName = editorName;
        return this;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public GetTitlesResponse setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GetTitlesResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public GetTitlesResponse setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getViews() {
        return views;
    }

    public GetTitlesResponse setViews(Integer views) {
        this.views = views;
        return this;
    }

    public PrivacySettings getWhoCanEdit() {
        return whoCanEdit;
    }

    public GetTitlesResponse setWhoCanEdit(PrivacySettings whoCanEdit) {
        this.whoCanEdit = whoCanEdit;
        return this;
    }

    public PrivacySettings getWhoCanView() {
        return whoCanView;
    }

    public GetTitlesResponse setWhoCanView(PrivacySettings whoCanView) {
        this.whoCanView = whoCanView;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(editorName, editorId, whoCanEdit, whoCanView, groupId, creatorId, creatorName, id, title, views);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTitlesResponse getTitlesResponse = (GetTitlesResponse) o;
        return Objects.equals(editorName, getTitlesResponse.editorName) &&
                Objects.equals(whoCanEdit, getTitlesResponse.whoCanEdit) &&
                Objects.equals(whoCanView, getTitlesResponse.whoCanView) &&
                Objects.equals(groupId, getTitlesResponse.groupId) &&
                Objects.equals(creatorId, getTitlesResponse.creatorId) &&
                Objects.equals(creatorName, getTitlesResponse.creatorName) &&
                Objects.equals(editorId, getTitlesResponse.editorId) &&
                Objects.equals(id, getTitlesResponse.id) &&
                Objects.equals(title, getTitlesResponse.title) &&
                Objects.equals(views, getTitlesResponse.views);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetTitlesResponse{");
        sb.append("editorName='").append(editorName).append("'");
        sb.append(", whoCanEdit=").append(whoCanEdit);
        sb.append(", whoCanView=").append(whoCanView);
        sb.append(", groupId=").append(groupId);
        sb.append(", creatorId=").append(creatorId);
        sb.append(", creatorName=").append(creatorName);
        sb.append(", editorId=").append(editorId);
        sb.append(", id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append(", views=").append(views);
        sb.append('}');
        return sb.toString();
    }
}
