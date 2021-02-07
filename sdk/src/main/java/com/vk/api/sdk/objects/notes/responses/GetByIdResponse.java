package com.vk.api.sdk.objects.notes.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import java.net.URI;
import java.util.Objects;

/**
 * GetByIdResponse object
 */
public class GetByIdResponse implements Validable {
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

    public GetByIdResponse setReadComments(Integer readComments) {
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

    public GetByIdResponse setComments(Integer comments) {
        this.comments = comments;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public GetByIdResponse setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GetByIdResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public GetByIdResponse setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public String getText() {
        return text;
    }

    public GetByIdResponse setText(String text) {
        this.text = text;
        return this;
    }

    public String getTextWiki() {
        return textWiki;
    }

    public GetByIdResponse setTextWiki(String textWiki) {
        this.textWiki = textWiki;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public GetByIdResponse setTitle(String title) {
        this.title = title;
        return this;
    }

    public URI getViewUrl() {
        return viewUrl;
    }

    public GetByIdResponse setViewUrl(URI viewUrl) {
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
        GetByIdResponse getByIdResponse = (GetByIdResponse) o;
        return Objects.equals(date, getByIdResponse.date) &&
                Objects.equals(canComment, getByIdResponse.canComment) &&
                Objects.equals(comments, getByIdResponse.comments) &&
                Objects.equals(ownerId, getByIdResponse.ownerId) &&
                Objects.equals(readComments, getByIdResponse.readComments) &&
                Objects.equals(viewUrl, getByIdResponse.viewUrl) &&
                Objects.equals(id, getByIdResponse.id) &&
                Objects.equals(text, getByIdResponse.text) &&
                Objects.equals(textWiki, getByIdResponse.textWiki) &&
                Objects.equals(title, getByIdResponse.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetByIdResponse{");
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
