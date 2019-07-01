package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * PhotoComment object
 */
public class PhotoComment implements Validable {
    @SerializedName("id")
    @Required
    private Integer id;

    @SerializedName("from_id")
    private Integer fromId;

    @SerializedName("date")
    @Required
    private Integer date;

    @SerializedName("text")
    @Required
    private String text;

    @SerializedName("photo_owner_od")
    private Integer photoOwnerOd;

    public Integer getId() {
        return id;
    }

    public PhotoComment setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getFromId() {
        return fromId;
    }

    public PhotoComment setFromId(Integer fromId) {
        this.fromId = fromId;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public PhotoComment setDate(Integer date) {
        this.date = date;
        return this;
    }

    public String getText() {
        return text;
    }

    public PhotoComment setText(String text) {
        this.text = text;
        return this;
    }

    public Integer getPhotoOwnerOd() {
        return photoOwnerOd;
    }

    public PhotoComment setPhotoOwnerOd(Integer photoOwnerOd) {
        this.photoOwnerOd = photoOwnerOd;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, id, text, fromId, photoOwnerOd);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoComment photoComment = (PhotoComment) o;
        return Objects.equals(date, photoComment.date) &&
                Objects.equals(fromId, photoComment.fromId) &&
                Objects.equals(photoOwnerOd, photoComment.photoOwnerOd) &&
                Objects.equals(id, photoComment.id) &&
                Objects.equals(text, photoComment.text);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PhotoComment{");
        sb.append("date=").append(date);
        sb.append(", fromId=").append(fromId);
        sb.append(", photoOwnerOd=").append(photoOwnerOd);
        sb.append(", id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append('}');
        return sb.toString();
    }
}
