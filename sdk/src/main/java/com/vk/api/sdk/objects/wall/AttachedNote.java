package com.vk.api.sdk.objects.wall;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * AttachedNote object
 */
public class AttachedNote {
    /**
     * Note ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Note owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Comments number
     */
    @SerializedName("comments")
    private Integer comments;

    /**
     * Read comments number
     */
    @SerializedName("read_comments")
    private Integer readComments;

    /**
     * Date when the note has been created in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Note title
     */
    @SerializedName("title")
    private String title;

    /**
     * URL of the page with note preview
     */
    @SerializedName("view_url")
    private String viewUrl;

    public Integer getId() {
        return id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Integer getComments() {
        return comments;
    }

    public Integer getReadComments() {
        return readComments;
    }

    public Integer getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getViewUrl() {
        return viewUrl;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, comments, viewUrl, id, ownerId, title, readComments);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttachedNote attachedNote = (AttachedNote) o;
        return Objects.equals(id, attachedNote.id) &&
                Objects.equals(ownerId, attachedNote.ownerId) &&
                Objects.equals(comments, attachedNote.comments) &&
                Objects.equals(readComments, attachedNote.readComments) &&
                Objects.equals(date, attachedNote.date) &&
                Objects.equals(title, attachedNote.title) &&
                Objects.equals(viewUrl, attachedNote.viewUrl);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AttachedNote{");
        sb.append("id=").append(id);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", comments=").append(comments);
        sb.append(", readComments=").append(readComments);
        sb.append(", date=").append(date);
        sb.append(", title='").append(title).append("'");
        sb.append(", viewUrl='").append(viewUrl).append("'");
        sb.append('}');
        return sb.toString();
    }
}
