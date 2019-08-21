package com.vk.api.sdk.objects.photos.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * SaveOwnerPhotoResponse object
 */
public class SaveOwnerPhotoResponse implements Validable {
    /**
     * Photo hash
     */
    @SerializedName("photo_hash")
    private String photoHash;

    /**
     * Uploaded image url
     */
    @SerializedName("photo_src")
    private String photoSrc;

    /**
     * Uploaded image url
     */
    @SerializedName("photo_src_big")
    private String photoSrcBig;

    /**
     * Uploaded image url
     */
    @SerializedName("photo_src_small")
    private String photoSrcSmall;

    /**
     * Returns 1 if profile photo is saved
     */
    @SerializedName("saved")
    private Integer saved;

    /**
     * Created post ID
     */
    @SerializedName("post_id")
    private Integer postId;

    public String getPhotoHash() {
        return photoHash;
    }

    public SaveOwnerPhotoResponse setPhotoHash(String photoHash) {
        this.photoHash = photoHash;
        return this;
    }

    public String getPhotoSrc() {
        return photoSrc;
    }

    public SaveOwnerPhotoResponse setPhotoSrc(String photoSrc) {
        this.photoSrc = photoSrc;
        return this;
    }

    public String getPhotoSrcBig() {
        return photoSrcBig;
    }

    public SaveOwnerPhotoResponse setPhotoSrcBig(String photoSrcBig) {
        this.photoSrcBig = photoSrcBig;
        return this;
    }

    public String getPhotoSrcSmall() {
        return photoSrcSmall;
    }

    public SaveOwnerPhotoResponse setPhotoSrcSmall(String photoSrcSmall) {
        this.photoSrcSmall = photoSrcSmall;
        return this;
    }

    public Integer getSaved() {
        return saved;
    }

    public SaveOwnerPhotoResponse setSaved(Integer saved) {
        this.saved = saved;
        return this;
    }

    public Integer getPostId() {
        return postId;
    }

    public SaveOwnerPhotoResponse setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photoSrcSmall, saved, postId, photoSrcBig, photoSrc, photoHash);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveOwnerPhotoResponse saveOwnerPhotoResponse = (SaveOwnerPhotoResponse) o;
        return Objects.equals(photoHash, saveOwnerPhotoResponse.photoHash) &&
                Objects.equals(postId, saveOwnerPhotoResponse.postId) &&
                Objects.equals(saved, saveOwnerPhotoResponse.saved) &&
                Objects.equals(photoSrcBig, saveOwnerPhotoResponse.photoSrcBig) &&
                Objects.equals(photoSrcSmall, saveOwnerPhotoResponse.photoSrcSmall) &&
                Objects.equals(photoSrc, saveOwnerPhotoResponse.photoSrc);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SaveOwnerPhotoResponse{");
        sb.append("photoHash='").append(photoHash).append("'");
        sb.append(", postId=").append(postId);
        sb.append(", saved=").append(saved);
        sb.append(", photoSrcBig='").append(photoSrcBig).append("'");
        sb.append(", photoSrcSmall='").append(photoSrcSmall).append("'");
        sb.append(", photoSrc='").append(photoSrc).append("'");
        sb.append('}');
        return sb.toString();
    }
}
