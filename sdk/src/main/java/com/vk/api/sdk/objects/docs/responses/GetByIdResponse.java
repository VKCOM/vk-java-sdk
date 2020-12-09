package com.vk.api.sdk.objects.docs.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.docs.DocPreview;
import java.net.URI;
import java.util.List;
import java.util.Objects;

/**
 * GetByIdResponse object
 */
public class GetByIdResponse implements Validable {
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

    public String getTitle() {
        return title;
    }

    public GetByIdResponse setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getSize() {
        return size;
    }

    public GetByIdResponse setSize(Integer size) {
        this.size = size;
        return this;
    }

    public String getExt() {
        return ext;
    }

    public GetByIdResponse setExt(String ext) {
        this.ext = ext;
        return this;
    }

    public URI getUrl() {
        return url;
    }

    public GetByIdResponse setUrl(URI url) {
        this.url = url;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public GetByIdResponse setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public GetByIdResponse setType(Integer type) {
        this.type = type;
        return this;
    }

    public DocPreview getPreview() {
        return preview;
    }

    public GetByIdResponse setPreview(DocPreview preview) {
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

    public GetByIdResponse setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public List<String> getTags() {
        return tags;
    }

    public GetByIdResponse setTags(List<String> tags) {
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
        GetByIdResponse getByIdResponse = (GetByIdResponse) o;
        return Objects.equals(ext, getByIdResponse.ext) &&
                Objects.equals(date, getByIdResponse.date) &&
                Objects.equals(preview, getByIdResponse.preview) &&
                Objects.equals(size, getByIdResponse.size) &&
                Objects.equals(ownerId, getByIdResponse.ownerId) &&
                Objects.equals(accessKey, getByIdResponse.accessKey) &&
                Objects.equals(isLicensed, getByIdResponse.isLicensed) &&
                Objects.equals(id, getByIdResponse.id) &&
                Objects.equals(title, getByIdResponse.title) &&
                Objects.equals(type, getByIdResponse.type) &&
                Objects.equals(url, getByIdResponse.url) &&
                Objects.equals(tags, getByIdResponse.tags);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetByIdResponse{");
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
