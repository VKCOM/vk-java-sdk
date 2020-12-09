package com.vk.api.sdk.objects.notes;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import java.net.URI;
import java.util.Objects;

/**
 * Note object
 */
public class Note implements Validable {
    @SerializedName("read_comments")
    private Integer readComments;

    /**
     * Information whether current user can comment the note
     */
    @SerializedName("can_comment")
    private BoolInt canComment;

    /**
     * Comments number
     */
    @SerializedName("comments")
    @Required
    private Integer comments;

    /**
     * Date when the note has been created in Unixtime
     */
    @SerializedName("date")
    @Required
    private Integer date;

    /**
     * Note ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Note owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

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
     * Note title
     */
    @SerializedName("title")
    @Required
    private String title;

    /**
     * URL of the page with note preview
     */
    @SerializedName("view_url")
    private URI viewUrl;

    public Integer getReadComments() {
        return readComments;
    }

    public Note setReadComments(Integer readComments) {
        this.readComments = readComments;
        return this;
    }

    public boolean canComment() {
        return canComment == BoolInt.YES;
    }

    public BoolInt getCanComment() {
        return canComment;
    }

    public Integer getComments() {
        return comments;
    }

    public Note setComments(Integer comments) {
        this.comments = comments;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public Note setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Note setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Note setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public String getText() {
        return text;
    }

    public Note setText(String text) {
        this.text = text;
        return this;
    }

    public String getTextWiki() {
        return textWiki;
    }

    public Note setTextWiki(String textWiki) {
        this.textWiki = textWiki;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Note setTitle(String title) {
        this.title = title;
        return this;
    }

    public URI getViewUrl() {
        return viewUrl;
    }

    public Note setViewUrl(URI viewUrl) {
        this.viewUrl = viewUrl;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, textWiki, comments, viewUrl, canComment, id, text, ownerId, title, readComments);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(date, note.date) &&
                Objects.equals(canComment, note.canComment) &&
                Objects.equals(comments, note.comments) &&
                Objects.equals(ownerId, note.ownerId) &&
                Objects.equals(readComments, note.readComments) &&
                Objects.equals(viewUrl, note.viewUrl) &&
                Objects.equals(id, note.id) &&
                Objects.equals(text, note.text) &&
                Objects.equals(textWiki, note.textWiki) &&
                Objects.equals(title, note.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Note{");
        sb.append("date=").append(date);
        sb.append(", canComment=").append(canComment);
        sb.append(", comments=").append(comments);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", readComments=").append(readComments);
        sb.append(", viewUrl=").append(viewUrl);
        sb.append(", id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", textWiki='").append(textWiki).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
