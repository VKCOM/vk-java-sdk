package com.vk.api.sdk.objects.docs;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import java.net.URL;
import java.util.Objects;

/**
 * Doc object
 */
public class Doc implements Validable {
    /**
     * Access key for the document
     */
    @SerializedName("access_key")
    private String accessKey;

    /**
     * Date when file has been uploaded in Unixtime
     */
    @SerializedName("date")
    @Required
    private Integer date;

    /**
     * File extension
     */
    @SerializedName("ext")
    @Required
    private String ext;

    /**
     * Document ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    @SerializedName("is_licensed")
    private BoolInt isLicensed;

    /**
     * Document owner ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    @SerializedName("preview")
    private DocPreview preview;

    /**
     * File size in bites
     */
    @SerializedName("size")
    @Required
    private Integer size;

    /**
     * Document title
     */
    @SerializedName("title")
    @Required
    private String title;

    /**
     * Document type
     */
    @SerializedName("type")
    @Required
    private Integer type;

    /**
     * File URL
     */
    @SerializedName("url")
    private URL url;

    public String getAccessKey() {
        return accessKey;
    }

    public Doc setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public Doc setDate(Integer date) {
        this.date = date;
        return this;
    }

    public String getExt() {
        return ext;
    }

    public Doc setExt(String ext) {
        this.ext = ext;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Doc setId(Integer id) {
        this.id = id;
        return this;
    }

    public boolean isLicensed() {
        return isLicensed == BoolInt.YES;
    }

    public BoolInt getIsLicensed() {
        return isLicensed;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Doc setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public DocPreview getPreview() {
        return preview;
    }

    public Doc setPreview(DocPreview preview) {
        this.preview = preview;
        return this;
    }

    public Integer getSize() {
        return size;
    }

    public Doc setSize(Integer size) {
        this.size = size;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Doc setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public Doc setType(Integer type) {
        this.type = type;
        return this;
    }

    public URL getUrl() {
        return url;
    }

    public Doc setUrl(URL url) {
        this.url = url;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, ext, preview, size, accessKey, isLicensed, id, ownerId, title, type, url);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doc doc = (Doc) o;
        return Objects.equals(date, doc.date) &&
                Objects.equals(ext, doc.ext) &&
                Objects.equals(preview, doc.preview) &&
                Objects.equals(size, doc.size) &&
                Objects.equals(ownerId, doc.ownerId) &&
                Objects.equals(accessKey, doc.accessKey) &&
                Objects.equals(isLicensed, doc.isLicensed) &&
                Objects.equals(id, doc.id) &&
                Objects.equals(title, doc.title) &&
                Objects.equals(type, doc.type) &&
                Objects.equals(url, doc.url);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Doc{");
        sb.append("date=").append(date);
        sb.append(", ext='").append(ext).append("'");
        sb.append(", preview=").append(preview);
        sb.append(", size=").append(size);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", isLicensed=").append(isLicensed);
        sb.append(", id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append(", type=").append(type);
        sb.append(", url=").append(url);
        sb.append('}');
        return sb.toString();
    }
}
