package com.vk.api.sdk.objects.ads;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * AdLayout object
 */
public class AdLayout {
    /**
     * Ad ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Campaign ID
     */
    @SerializedName("campaign_id")
    private Integer campaignId;

    /**
     * Ad format
     */
    @SerializedName("ad_format ")
    private Integer adFormat;

    /**
     * Cost type
     */
    @SerializedName("cost_type")
    private AdLayoutCostType costType;

    /**
     * Information whether the ad is a video
     */
    @SerializedName("video")
    private BoolInt video;

    /**
     * Ad title
     */
    @SerializedName("title")
    private String title;

    /**
     * Ad description
     */
    @SerializedName("description ")
    private String description;

    /**
     * URL of advertised object
     */
    @SerializedName("link_url ")
    private String linkUrl;

    /**
     * Domain of advertised object
     */
    @SerializedName("link_domain")
    private String linkDomain;

    /**
     * link to preview an ad as it is shown on the website
     */
    @SerializedName("preview_link ")
    private JsonObject previewLink;

    /**
     * Image URL
     */
    @SerializedName("image_src")
    private Integer imageSrc;

    /**
     * URL of the preview image in double size
     */
    @SerializedName("image_src_2x")
    private Integer imageSrc2x;

    public Integer getId() {
        return id;
    }

    public Integer getCampaignId() {
        return campaignId;
    }

    public Integer getAdFormat() {
        return adFormat;
    }

    public AdLayoutCostType getCostType() {
        return costType;
    }

    public boolean isVideo() {
        return video == BoolInt.YES;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public String getLinkDomain() {
        return linkDomain;
    }

    public JsonObject getPreviewLink() {
        return previewLink;
    }

    public Integer getImageSrc() {
        return imageSrc;
    }

    public Integer getImageSrc2x() {
        return imageSrc2x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(campaignId, costType, previewLink, linkUrl, description, imageSrc2x, imageSrc, id, video, adFormat, title, linkDomain);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdLayout adLayout = (AdLayout) o;
        return Objects.equals(id, adLayout.id) &&
                Objects.equals(campaignId, adLayout.campaignId) &&
                Objects.equals(adFormat, adLayout.adFormat) &&
                Objects.equals(costType, adLayout.costType) &&
                Objects.equals(video, adLayout.video) &&
                Objects.equals(title, adLayout.title) &&
                Objects.equals(description, adLayout.description) &&
                Objects.equals(linkUrl, adLayout.linkUrl) &&
                Objects.equals(linkDomain, adLayout.linkDomain) &&
                Objects.equals(previewLink, adLayout.previewLink) &&
                Objects.equals(imageSrc, adLayout.imageSrc) &&
                Objects.equals(imageSrc2x, adLayout.imageSrc2x);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AdLayout{");
        sb.append("id=").append(id);
        sb.append(", campaignId=").append(campaignId);
        sb.append(", adFormat=").append(adFormat);
        sb.append(", costType=").append(costType);
        sb.append(", video=").append(video);
        sb.append(", title='").append(title).append("'");
        sb.append(", description='").append(description).append("'");
        sb.append(", linkUrl='").append(linkUrl).append("'");
        sb.append(", linkDomain='").append(linkDomain).append("'");
        sb.append(", previewLink=").append(previewLink);
        sb.append(", imageSrc=").append(imageSrc);
        sb.append(", imageSrc2x=").append(imageSrc2x);
        sb.append('}');
        return sb.toString();
    }
}
