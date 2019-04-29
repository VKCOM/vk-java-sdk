package com.vk.api.sdk.objects.notes;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * NoteComment object
 */
public class NoteComment {
    /**
     * Date when the comment has beed added in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Comment ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Comment text
     */
    @SerializedName("message")
    private String message;

    /**
     * Note ID
     */
    @SerializedName("nid")
    private Integer nid;

    /**
     * Note ID
     */
    @SerializedName("oid")
    private Integer oid;

    /**
     * ID of replied comment 
     */
    @SerializedName("reply_to")
    private Integer replyTo;

    /**
     * Comment author's ID
     */
    @SerializedName("uid")
    private Integer uid;

    public Integer getDate() {
        return date;
    }

    public NoteComment setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public NoteComment setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public NoteComment setMessage(String message) {
        this.message = message;
        return this;
    }

    public Integer getNid() {
        return nid;
    }

    public NoteComment setNid(Integer nid) {
        this.nid = nid;
        return this;
    }

    public Integer getOid() {
        return oid;
    }

    public NoteComment setOid(Integer oid) {
        this.oid = oid;
        return this;
    }

    public Integer getReplyTo() {
        return replyTo;
    }

    public NoteComment setReplyTo(Integer replyTo) {
        this.replyTo = replyTo;
        return this;
    }

    public Integer getUid() {
        return uid;
    }

    public NoteComment setUid(Integer uid) {
        this.uid = uid;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, uid, replyTo, nid, id, oid, message);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteComment noteComment = (NoteComment) o;
        return Objects.equals(date, noteComment.date) &&
                Objects.equals(uid, noteComment.uid) &&
                Objects.equals(replyTo, noteComment.replyTo) &&
                Objects.equals(nid, noteComment.nid) &&
                Objects.equals(id, noteComment.id) &&
                Objects.equals(oid, noteComment.oid) &&
                Objects.equals(message, noteComment.message);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("NoteComment{");
        sb.append("date=").append(date);
        sb.append(", uid=").append(uid);
        sb.append(", replyTo=").append(replyTo);
        sb.append(", nid=").append(nid);
        sb.append(", id=").append(id);
        sb.append(", oid=").append(oid);
        sb.append(", message='").append(message).append("'");
        sb.append('}');
        return sb.toString();
    }
}
