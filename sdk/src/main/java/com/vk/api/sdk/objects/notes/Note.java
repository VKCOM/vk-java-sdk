package com.vk.api.sdk.objects.notes;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * Note object
 */
public class Note {
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
     * Information whether current user can comment the note
     */
    @SerializedName("can_comment")
    private BoolInt canComment;

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
     * Note text
     */
    @SerializedName("text")
    private String text;

    /**
     * Note text in wiki format
     */
    @SerializedName("text_wiki")
    private String textWiki;

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

    public boolean canComment() {
        return canComment == BoolInt.YES;
    }

    public Integer getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getTextWiki() {
        return textWiki;
    }

    public String getViewUrl() {
        return viewUrl;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, textWiki, comments, viewUrl, id, canComment, text, ownerId, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(id, note.id) &&
                Objects.equals(ownerId, note.ownerId) &&
                Objects.equals(comments, note.comments) &&
                Objects.equals(canComment, note.canComment) &&
                Objects.equals(date, note.date) &&
                Objects.equals(title, note.title) &&
                Objects.equals(text, note.text) &&
                Objects.equals(textWiki, note.textWiki) &&
                Objects.equals(viewUrl, note.viewUrl);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Note{");
        sb.append("id=").append(id);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", comments=").append(comments);
        sb.append(", canComment=").append(canComment);
        sb.append(", date=").append(date);
        sb.append(", title='").append(title).append("'");
        sb.append(", text='").append(text).append("'");
        sb.append(", textWiki='").append(textWiki).append("'");
        sb.append(", viewUrl='").append(viewUrl).append("'");
        sb.append('}');
        return sb.toString();
    }
}
