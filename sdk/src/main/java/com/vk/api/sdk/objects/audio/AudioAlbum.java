package com.vk.api.sdk.objects.audio;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * AudioAlbum object
 */
public class AudioAlbum implements Validable {
    /**
     * Album ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Album title
     */
    @SerializedName("title")
    @Required
    private String title;

    /**
     * Album owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Album access key
     */
    @SerializedName("access_key")
    private String accessKey;

    /**
     * Audio photo
     */
    @SerializedName("thumb")
    private Photo thumb;

    public Integer getId() {
        return id;
    }

    public AudioAlbum setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public AudioAlbum setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public AudioAlbum setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public AudioAlbum setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public Photo getThumb() {
        return thumb;
    }

    public AudioAlbum setThumb(Photo thumb) {
        this.thumb = thumb;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(thumb, accessKey, id, ownerId, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AudioAlbum audioAlbum = (AudioAlbum) o;
        return Objects.equals(thumb, audioAlbum.thumb) &&
                Objects.equals(ownerId, audioAlbum.ownerId) &&
                Objects.equals(accessKey, audioAlbum.accessKey) &&
                Objects.equals(id, audioAlbum.id) &&
                Objects.equals(title, audioAlbum.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("AudioAlbum{");
        sb.append("thumb=").append(thumb);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
