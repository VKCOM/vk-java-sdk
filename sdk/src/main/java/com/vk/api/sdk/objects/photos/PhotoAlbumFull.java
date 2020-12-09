package com.vk.api.sdk.objects.photos;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import java.net.URI;
import java.util.List;
import java.util.Objects;

/**
 * PhotoAlbumFull object
 */
public class PhotoAlbumFull implements Validable {
    /**
     * Information whether current user can upload photo to the album
     */
    @SerializedName("can_upload")
    private BoolInt canUpload;

    /**
     * Information whether album comments are disabled
     */
    @SerializedName("comments_disabled")
    private BoolInt commentsDisabled;

    /**
     * Date when the album has been created in Unixtime
     */
    @SerializedName("created")
    @Required
    private Integer created;

    /**
     * Photo album description
     */
    @SerializedName("description")
    private String description;

    /**
     * Photo album ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Album owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Photos number
     */
    @SerializedName("size")
    @Required
    private Integer size;

    @SerializedName("sizes")
    private List<PhotoSizes> sizes;

    /**
     * Thumb photo ID
     */
    @SerializedName("thumb_id")
    private Integer thumbId;

    /**
     * Information whether the album thumb is last photo
     */
    @SerializedName("thumb_is_last")
    private BoolInt thumbIsLast;

    /**
     * URL of the thumb image
     */
    @SerializedName("thumb_src")
    private URI thumbSrc;

    /**
     * Photo album title
     */
    @SerializedName("title")
    @Required
    private String title;

    /**
     * Date when the album has been updated last time in Unixtime
     */
    @SerializedName("updated")
    @Required
    private Integer updated;

    /**
     * Information whether only community administrators can upload photos
     */
    @SerializedName("upload_by_admins_only")
    private BoolInt uploadByAdminsOnly;

    public boolean canUpload() {
        return canUpload == BoolInt.YES;
    }

    public BoolInt getCanUpload() {
        return canUpload;
    }

    public boolean isCommentsDisabled() {
        return commentsDisabled == BoolInt.YES;
    }

    public BoolInt getCommentsDisabled() {
        return commentsDisabled;
    }

    public Integer getCreated() {
        return created;
    }

    public PhotoAlbumFull setCreated(Integer created) {
        this.created = created;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public PhotoAlbumFull setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public PhotoAlbumFull setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public PhotoAlbumFull setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public Integer getSize() {
        return size;
    }

    public PhotoAlbumFull setSize(Integer size) {
        this.size = size;
        return this;
    }

    public List<PhotoSizes> getSizes() {
        return sizes;
    }

    public PhotoAlbumFull setSizes(List<PhotoSizes> sizes) {
        this.sizes = sizes;
        return this;
    }

    public Integer getThumbId() {
        return thumbId;
    }

    public PhotoAlbumFull setThumbId(Integer thumbId) {
        this.thumbId = thumbId;
        return this;
    }

    public boolean isThumbIsLast() {
        return thumbIsLast == BoolInt.YES;
    }

    public BoolInt getThumbIsLast() {
        return thumbIsLast;
    }

    public URI getThumbSrc() {
        return thumbSrc;
    }

    public PhotoAlbumFull setThumbSrc(URI thumbSrc) {
        this.thumbSrc = thumbSrc;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public PhotoAlbumFull setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getUpdated() {
        return updated;
    }

    public PhotoAlbumFull setUpdated(Integer updated) {
        this.updated = updated;
        return this;
    }

    public boolean isUploadByAdminsOnly() {
        return uploadByAdminsOnly == BoolInt.YES;
    }

    public BoolInt getUploadByAdminsOnly() {
        return uploadByAdminsOnly;
    }

    @Override
    public int hashCode() {
        return Objects.hash(created, description, thumbSrc, ownerId, title, uploadByAdminsOnly, canUpload, size, sizes, commentsDisabled, id, thumbIsLast, updated, thumbId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoAlbumFull photoAlbumFull = (PhotoAlbumFull) o;
        return Objects.equals(thumbId, photoAlbumFull.thumbId) &&
                Objects.equals(created, photoAlbumFull.created) &&
                Objects.equals(ownerId, photoAlbumFull.ownerId) &&
                Objects.equals(description, photoAlbumFull.description) &&
                Objects.equals(title, photoAlbumFull.title) &&
                Objects.equals(thumbIsLast, photoAlbumFull.thumbIsLast) &&
                Objects.equals(uploadByAdminsOnly, photoAlbumFull.uploadByAdminsOnly) &&
                Objects.equals(size, photoAlbumFull.size) &&
                Objects.equals(sizes, photoAlbumFull.sizes) &&
                Objects.equals(canUpload, photoAlbumFull.canUpload) &&
                Objects.equals(commentsDisabled, photoAlbumFull.commentsDisabled) &&
                Objects.equals(id, photoAlbumFull.id) &&
                Objects.equals(thumbSrc, photoAlbumFull.thumbSrc) &&
                Objects.equals(updated, photoAlbumFull.updated);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PhotoAlbumFull{");
        sb.append("thumbId=").append(thumbId);
        sb.append(", created=").append(created);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", description='").append(description).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append(", thumbIsLast=").append(thumbIsLast);
        sb.append(", uploadByAdminsOnly=").append(uploadByAdminsOnly);
        sb.append(", size=").append(size);
        sb.append(", sizes=").append(sizes);
        sb.append(", canUpload=").append(canUpload);
        sb.append(", commentsDisabled=").append(commentsDisabled);
        sb.append(", id=").append(id);
        sb.append(", thumbSrc=").append(thumbSrc);
        sb.append(", updated=").append(updated);
        sb.append('}');
        return sb.toString();
    }
}
