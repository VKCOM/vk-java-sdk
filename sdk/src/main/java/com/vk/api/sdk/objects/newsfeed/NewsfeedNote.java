package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * NewsfeedNote object
 */
public class NewsfeedNote implements Validable {
    /**
     * Comments Number
     */
    @SerializedName("comments")
    private Integer comments;

    /**
     * Note ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * integer
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Note title
     */
    @SerializedName("title")
    private String title;

    public Integer getComments() {
        return comments;
    }

    public NewsfeedNote setComments(Integer comments) {
        this.comments = comments;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public NewsfeedNote setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public NewsfeedNote setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public NewsfeedNote setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(comments, id, ownerId, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsfeedNote newsfeedNote = (NewsfeedNote) o;
        return Objects.equals(comments, newsfeedNote.comments) &&
                Objects.equals(ownerId, newsfeedNote.ownerId) &&
                Objects.equals(id, newsfeedNote.id) &&
                Objects.equals(title, newsfeedNote.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("NewsfeedNote{");
        sb.append("comments=").append(comments);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
