package com.vk.api.sdk.objects.docs;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import java.net.URI;
import java.util.List;
import java.util.Objects;

/**
 * Doc object
 */
public class Doc implements Validable {
    /**
     * Document ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Document owner ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Document title
     */
    @SerializedName("title")
    @Required
    private String title;

    /**
     * File size in bites
     */
    @SerializedName("size")
    @Required
    private Integer size;

    /**
     * File extension
     */
    @SerializedName("ext")
    @Required
    private String ext;

    /**
     * File URL
     */
    @SerializedName("url")
    private URI url;

    /**
     * Date when file has been uploaded in Unixtime
     */
    @SerializedName("date")
    @Required
    private Integer date;

    /**
     * Document type
     */
    @SerializedName("type")
    @Required
    private Integer type;

    @SerializedName("preview")
    private DocPreview preview;

    @SerializedName("is_licensed")
    private BoolInt isLicensed;

    /**
     * Access key for the document
     */
    @SerializedName("access_key")
    private String accessKey;

    /**
     * Document tags
     */
    @SerializedName("tags")
    private List<String> tags;

    public Integer getId() {
        return id;
    }

    public Doc setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Doc setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Doc setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getSize() {
        return size;
    }

    public Doc setSize(Integer size) {
        this.size = size;
        return this;
    }

    public String getExt() {
        return ext;
    }

    public Doc setExt(String ext) {
        this.ext = ext;
        return this;
    }

    public URI getUrl() {
        return url;
    }

    public Doc setUrl(URI url) {
        this.url = url;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public Doc setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public Doc setType(Integer type) {
        this.type = type;
        return this;
    }

    public DocPreview getPreview() {
        return preview;
    }

    public Doc setPreview(DocPreview preview) {
        this.preview = preview;
        return this;
    }

    public boolean isLicensed() {
        return isLicensed == BoolInt.YES;
    }

    public BoolInt getIsLicensed() {
        return isLicensed;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public Doc setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public List<String> getTags() {
        return tags;
    }

    public Doc setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ext, date, preview, size, accessKey, isLicensed, id, ownerId, title, type, url, tags);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doc doc = (Doc) o;
        return Objects.equals(ext, doc.ext) &&
                Objects.equals(date, doc.date) &&
                Objects.equals(preview, doc.preview) &&
                Objects.equals(size, doc.size) &&
                Objects.equals(ownerId, doc.ownerId) &&
                Objects.equals(accessKey, doc.accessKey) &&
                Objects.equals(isLicensed, doc.isLicensed) &&
                Objects.equals(id, doc.id) &&
                Objects.equals(title, doc.title) &&
                Objects.equals(type, doc.type) &&
                Objects.equals(url, doc.url) &&
                Objects.equals(tags, doc.tags);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Doc{");
        sb.append("ext='").append(ext).append("'");
        sb.append(", date=").append(date);
        sb.append(", preview=").append(preview);
        sb.append(", size=").append(size);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", isLicensed=").append(isLicensed);
        sb.append(", id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append(", type=").append(type);
        sb.append(", url=").append(url);
        sb.append(", tags='").append(tags).append("'");
        sb.append('}');
        return sb.toString();
    }
}
