package com.vk.api.sdk.objects.pages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * WikipageVersion object
 */
public class WikipageVersion {
    /**
     * Date when the page has been edited in Unixtime
     */
    @SerializedName("edited")
    private Integer edited;

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
     * Version ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Page size in bytes
     */
    @SerializedName("length")
    private Integer length;

    public Integer getEdited() {
        return edited;
    }

    public WikipageVersion setEdited(Integer edited) {
        this.edited = edited;
        return this;
    }

    public Integer getEditorId() {
        return editorId;
    }

    public WikipageVersion setEditorId(Integer editorId) {
        this.editorId = editorId;
        return this;
    }

    public String getEditorName() {
        return editorName;
    }

    public WikipageVersion setEditorName(String editorName) {
        this.editorName = editorName;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public WikipageVersion setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getLength() {
        return length;
    }

    public WikipageVersion setLength(Integer length) {
        this.length = length;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(editorName, editorId, edited, length, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WikipageVersion wikipageVersion = (WikipageVersion) o;
        return Objects.equals(editorName, wikipageVersion.editorName) &&
                Objects.equals(edited, wikipageVersion.edited) &&
                Objects.equals(length, wikipageVersion.length) &&
                Objects.equals(editorId, wikipageVersion.editorId) &&
                Objects.equals(id, wikipageVersion.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("WikipageVersion{");
        sb.append("editorName='").append(editorName).append("'");
        sb.append(", edited=").append(edited);
        sb.append(", length=").append(length);
        sb.append(", editorId=").append(editorId);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
