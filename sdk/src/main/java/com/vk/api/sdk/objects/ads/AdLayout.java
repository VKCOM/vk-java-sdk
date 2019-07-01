package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import java.net.URL;
import java.util.Objects;

/**
 * AdLayout object
 */
public class AdLayout implements Validable {
    /**
     * Ad format
     */
    @SerializedName("ad_format")
    private Integer adFormat;

    /**
     * Campaign ID
     */
    @SerializedName("campaign_id")
    private Integer campaignId;

    @SerializedName("cost_type")
    private AdCostType costType;

    /**
     * Ad description
     */
    @SerializedName("description")
    @Required
    private String description;

    /**
     * Ad ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Image URL
     */
    @SerializedName("image_src")
    private URL imageSrc;

    /**
     * URL of the preview image in double size
     */
    @SerializedName("image_src_2x")
    private URL imageSrc2x;

    /**
     * Domain of advertised object
     */
    @SerializedName("link_domain")
    private String linkDomain;

    /**
     * URL of advertised object
     */
    @SerializedName("link_url")
    private URL linkUrl;

    /**
     * link to preview an ad as it is shown on the website
     */
    @SerializedName("preview_link")
    private JsonObject previewLink;

    /**
     * Ad title
     */
    @SerializedName("title")
    @Required
    private String title;

    /**
     * Information whether the ad is a video
     */
    @SerializedName("video")
    private BoolInt video;

    public Integer getAdFormat() {
        return adFormat;
    }

    public AdLayout setAdFormat(Integer adFormat) {
        this.adFormat = adFormat;
        return this;
    }

    public Integer getCampaignId() {
        return campaignId;
    }

    public AdLayout setCampaignId(Integer campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    public AdCostType getCostType() {
        return costType;
    }

    public AdLayout setCostType(AdCostType costType) {
        this.costType = costType;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AdLayout setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public AdLayout setId(Integer id) {
        this.id = id;
        return this;
    }

    public URL getImageSrc() {
        return imageSrc;
    }

    public AdLayout setImageSrc(URL imageSrc) {
        this.imageSrc = imageSrc;
        return this;
    }

    public URL getImageSrc2x() {
        return imageSrc2x;
    }

    public AdLayout setImageSrc2x(URL imageSrc2x) {
        this.imageSrc2x = imageSrc2x;
        return this;
    }

    public String getLinkDomain() {
        return linkDomain;
    }

    public AdLayout setLinkDomain(String linkDomain) {
        this.linkDomain = linkDomain;
        return this;
    }

    public URL getLinkUrl() {
        return linkUrl;
    }

    public AdLayout setLinkUrl(URL linkUrl) {
        this.linkUrl = linkUrl;
        return this;
    }

    public JsonObject getPreviewLink() {
        return previewLink;
    }

    public AdLayout setPreviewLink(JsonObject previewLink) {
        this.previewLink = previewLink;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public AdLayout setTitle(String title) {
        this.title = title;
        return this;
    }

    public boolean isVideo() {
        return video == BoolInt.YES;
    }

    public BoolInt getVideo() {
        return video;
    }

    @Override
    public int hashCode() {
        return Objects.hash(campaignId, previewLink, costType, linkUrl, imageSrc2x, description, imageSrc, id, video, adFormat, title, linkDomain);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdLayout adLayout = (AdLayout) o;
        return Objects.equals(adFormat, adLayout.adFormat) &&
                Objects.equals(previewLink, adLayout.previewLink) &&
                Objects.equals(costType, adLayout.costType) &&
                Objects.equals(imageSrc2x, adLayout.imageSrc2x) &&
                Objects.equals(description, adLayout.description) &&
                Objects.equals(linkUrl, adLayout.linkUrl) &&
                Objects.equals(id, adLayout.id) &&
                Objects.equals(video, adLayout.video) &&
                Objects.equals(title, adLayout.title) &&
                Objects.equals(imageSrc, adLayout.imageSrc) &&
                Objects.equals(linkDomain, adLayout.linkDomain) &&
                Objects.equals(campaignId, adLayout.campaignId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("AdLayout{");
        sb.append("adFormat=").append(adFormat);
        sb.append(", previewLink=").append(previewLink);
        sb.append(", costType=").append(costType);
        sb.append(", imageSrc2x=").append(imageSrc2x);
        sb.append(", description='").append(description).append("'");
        sb.append(", linkUrl=").append(linkUrl);
        sb.append(", id=").append(id);
        sb.append(", video=").append(video);
        sb.append(", title='").append(title).append("'");
        sb.append(", imageSrc=").append(imageSrc);
        sb.append(", linkDomain='").append(linkDomain).append("'");
        sb.append(", campaignId=").append(campaignId);
        sb.append('}');
        return sb.toString();
    }
}
