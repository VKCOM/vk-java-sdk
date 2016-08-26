package com.vk.api.sdk.objects.pages;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Wikipage object
 */
public class Wikipage {
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
     * Last editor name
     */
    @SerializedName("editor_name")
    private String editorName;

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

    public Integer getId() {
        return id;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public String getTitle() {
        return title;
    }

    public PrivacySettings getWhoCanView() {
        return whoCanView;
    }

    public PrivacySettings getWhoCanEdit() {
        return whoCanEdit;
    }

    public Integer getViews() {
        return views;
    }

    public Integer getEditorId() {
        return editorId;
    }

    public String getEditorName() {
        return editorName;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public Integer getCreatorName() {
        return creatorName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(editorName, editorId, whoCanEdit, whoCanView, groupId, creatorId, creatorName, id, title, views);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wikipage wikipage = (Wikipage) o;
        return Objects.equals(id, wikipage.id) &&
                Objects.equals(groupId, wikipage.groupId) &&
                Objects.equals(title, wikipage.title) &&
                Objects.equals(whoCanView, wikipage.whoCanView) &&
                Objects.equals(whoCanEdit, wikipage.whoCanEdit) &&
                Objects.equals(views, wikipage.views) &&
                Objects.equals(editorId, wikipage.editorId) &&
                Objects.equals(editorName, wikipage.editorName) &&
                Objects.equals(creatorId, wikipage.creatorId) &&
                Objects.equals(creatorName, wikipage.creatorName);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Wikipage{");
        sb.append("id=").append(id);
        sb.append(", groupId=").append(groupId);
        sb.append(", title='").append(title).append("'");
        sb.append(", whoCanView=").append(whoCanView);
        sb.append(", whoCanEdit=").append(whoCanEdit);
        sb.append(", views=").append(views);
        sb.append(", editorId=").append(editorId);
        sb.append(", editorName='").append(editorName).append("'");
        sb.append(", creatorId=").append(creatorId);
        sb.append(", creatorName=").append(creatorName);
        sb.append('}');
        return sb.toString();
    }
}
