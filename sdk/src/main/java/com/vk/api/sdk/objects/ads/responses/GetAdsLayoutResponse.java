package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.Gson;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.ads.AdCostType;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import java.net.URI;
import java.util.Objects;

/**
 * GetAdsLayoutResponse object
 */
public class GetAdsLayoutResponse implements Validable {
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
    private String id;

    /**
     * Image URL
     */
    @SerializedName("image_src")
    private URI imageSrc;

    /**
     * URL of the preview image in double size
     */
    @SerializedName("image_src_2x")
    private URI imageSrc2x;

    /**
     * Domain of advertised object
     */
    @SerializedName("link_domain")
    private String linkDomain;

    /**
     * URL of advertised object
     */
    @SerializedName("link_url")
    private URI linkUrl;

    /**
     * link to preview an ad as it is shown on the website
     */
    @SerializedName("preview_link")
    private JsonPrimitive previewLink;

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

    public GetAdsLayoutResponse setAdFormat(Integer adFormat) {
        this.adFormat = adFormat;
        return this;
    }

    public Integer getCampaignId() {
        return campaignId;
    }

    public GetAdsLayoutResponse setCampaignId(Integer campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    public AdCostType getCostType() {
        return costType;
    }

    public GetAdsLayoutResponse setCostType(AdCostType costType) {
        this.costType = costType;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GetAdsLayoutResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getId() {
        return id;
    }

    public GetAdsLayoutResponse setId(String id) {
        this.id = id;
        return this;
    }

    public URI getImageSrc() {
        return imageSrc;
    }

    public GetAdsLayoutResponse setImageSrc(URI imageSrc) {
        this.imageSrc = imageSrc;
        return this;
    }

    public URI getImageSrc2x() {
        return imageSrc2x;
    }

    public GetAdsLayoutResponse setImageSrc2x(URI imageSrc2x) {
        this.imageSrc2x = imageSrc2x;
        return this;
    }

    public String getLinkDomain() {
        return linkDomain;
    }

    public GetAdsLayoutResponse setLinkDomain(String linkDomain) {
        this.linkDomain = linkDomain;
        return this;
    }

    public URI getLinkUrl() {
        return linkUrl;
    }

    public GetAdsLayoutResponse setLinkUrl(URI linkUrl) {
        this.linkUrl = linkUrl;
        return this;
    }

    public JsonPrimitive getPreviewLink() {
        return previewLink;
    }

    public GetAdsLayoutResponse setPreviewLink(JsonPrimitive previewLink) {
        this.previewLink = previewLink;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public GetAdsLayoutResponse setTitle(String title) {
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
        GetAdsLayoutResponse getAdsLayoutResponse = (GetAdsLayoutResponse) o;
        return Objects.equals(adFormat, getAdsLayoutResponse.adFormat) &&
                Objects.equals(previewLink, getAdsLayoutResponse.previewLink) &&
                Objects.equals(costType, getAdsLayoutResponse.costType) &&
                Objects.equals(imageSrc2x, getAdsLayoutResponse.imageSrc2x) &&
                Objects.equals(description, getAdsLayoutResponse.description) &&
                Objects.equals(linkUrl, getAdsLayoutResponse.linkUrl) &&
                Objects.equals(id, getAdsLayoutResponse.id) &&
                Objects.equals(video, getAdsLayoutResponse.video) &&
                Objects.equals(title, getAdsLayoutResponse.title) &&
                Objects.equals(imageSrc, getAdsLayoutResponse.imageSrc) &&
                Objects.equals(linkDomain, getAdsLayoutResponse.linkDomain) &&
                Objects.equals(campaignId, getAdsLayoutResponse.campaignId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetAdsLayoutResponse{");
        sb.append("adFormat=").append(adFormat);
        sb.append(", previewLink=").append(previewLink);
        sb.append(", costType=").append(costType);
        sb.append(", imageSrc2x=").append(imageSrc2x);
        sb.append(", description='").append(description).append("'");
        sb.append(", linkUrl=").append(linkUrl);
        sb.append(", id='").append(id).append("'");
        sb.append(", video=").append(video);
        sb.append(", title='").append(title).append("'");
        sb.append(", imageSrc=").append(imageSrc);
        sb.append(", linkDomain='").append(linkDomain).append("'");
        sb.append(", campaignId=").append(campaignId);
        sb.append('}');
        return sb.toString();
    }
}
