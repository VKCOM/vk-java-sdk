package com.vk.api.sdk.objects.ads;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * Ad object
 */
public class Ad {
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
    @SerializedName("ad_format")
    private Integer adFormat;

    /**
     * Cost type
     */
    @SerializedName("cost_type")
    private AdCostType costType;

    /**
     * Cost of a click, kopecks
     */
    @SerializedName("cpc")
    private Integer cpc;

    /**
     * Cost of 1000 impressions, kopecks
     */
    @SerializedName("cpm")
    private Integer cpm;

    /**
     * Impressions limit
     */
    @SerializedName("impressions_limit")
    private Integer impressionsLimit;

    /**
     * Information whether impressions are limited
     */
    @SerializedName("impressions_limited")
    private BoolInt impressionsLimited;

    /**
     * Ad platform
     */
    @SerializedName("ad_platform")
    private JsonObject adPlatform;

    /**
     * Total limit
     */
    @SerializedName("all_limit")
    private Integer allLimit;

    /**
     * Category ID
     */
    @SerializedName("category1_id")
    private Integer category1Id;

    /**
     * Additional category ID
     */
    @SerializedName("category2_id")
    private Integer category2Id;

    /**
     * Ad atatus
     */
    @SerializedName("status")
    private AdStatus status;

    /**
     * Ad title
     */
    @SerializedName("name")
    private String name;

    /**
     * Review status
     */
    @SerializedName("approved")
    private AdApproved approved;

    /**
     * Information whether the ad is a video
     */
    @SerializedName("video")
    private BoolInt video;

    /**
     * Information whether disclaimer is enabled
     */
    @SerializedName("disclaimer_medical")
    private BoolInt disclaimerMedical;

    /**
     * Information whether disclaimer is enabled
     */
    @SerializedName("disclaimer_specialist")
    private BoolInt disclaimerSpecialist;

    /**
     * Information whether disclaimer is enabled
     */
    @SerializedName("disclaimer_supplements")
    private BoolInt disclaimerSupplements;

    public Integer getId() {
        return id;
    }

    public Integer getCampaignId() {
        return campaignId;
    }

    public Integer getAdFormat() {
        return adFormat;
    }

    public AdCostType getCostType() {
        return costType;
    }

    public Integer getCpc() {
        return cpc;
    }

    public Integer getCpm() {
        return cpm;
    }

    public Integer getImpressionsLimit() {
        return impressionsLimit;
    }

    public boolean isImpressionsLimited() {
        return impressionsLimited == BoolInt.YES;
    }

    public JsonObject getAdPlatform() {
        return adPlatform;
    }

    public Integer getAllLimit() {
        return allLimit;
    }

    public Integer getCategory1Id() {
        return category1Id;
    }

    public Integer getCategory2Id() {
        return category2Id;
    }

    public AdStatus getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public AdApproved getApproved() {
        return approved;
    }

    public boolean isVideo() {
        return video == BoolInt.YES;
    }

    public boolean isDisclaimerMedical() {
        return disclaimerMedical == BoolInt.YES;
    }

    public boolean isDisclaimerSpecialist() {
        return disclaimerSpecialist == BoolInt.YES;
    }

    public boolean isDisclaimerSupplements() {
        return disclaimerSupplements == BoolInt.YES;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpm, impressionsLimit, allLimit, campaignId, category2Id, disclaimerMedical, category1Id, disclaimerSpecialist, video, disclaimerSupplements, adPlatform, approved, impressionsLimited, costType, cpc, name, id, adFormat, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ad ad = (Ad) o;
        return Objects.equals(id, ad.id) &&
                Objects.equals(campaignId, ad.campaignId) &&
                Objects.equals(adFormat, ad.adFormat) &&
                Objects.equals(costType, ad.costType) &&
                Objects.equals(cpc, ad.cpc) &&
                Objects.equals(cpm, ad.cpm) &&
                Objects.equals(impressionsLimit, ad.impressionsLimit) &&
                Objects.equals(impressionsLimited, ad.impressionsLimited) &&
                Objects.equals(adPlatform, ad.adPlatform) &&
                Objects.equals(allLimit, ad.allLimit) &&
                Objects.equals(category1Id, ad.category1Id) &&
                Objects.equals(category2Id, ad.category2Id) &&
                Objects.equals(status, ad.status) &&
                Objects.equals(name, ad.name) &&
                Objects.equals(approved, ad.approved) &&
                Objects.equals(video, ad.video) &&
                Objects.equals(disclaimerMedical, ad.disclaimerMedical) &&
                Objects.equals(disclaimerSpecialist, ad.disclaimerSpecialist) &&
                Objects.equals(disclaimerSupplements, ad.disclaimerSupplements);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ad{");
        sb.append("id=").append(id);
        sb.append(", campaignId=").append(campaignId);
        sb.append(", adFormat=").append(adFormat);
        sb.append(", costType=").append(costType);
        sb.append(", cpc=").append(cpc);
        sb.append(", cpm=").append(cpm);
        sb.append(", impressionsLimit=").append(impressionsLimit);
        sb.append(", impressionsLimited=").append(impressionsLimited);
        sb.append(", adPlatform=").append(adPlatform);
        sb.append(", allLimit=").append(allLimit);
        sb.append(", category1Id=").append(category1Id);
        sb.append(", category2Id=").append(category2Id);
        sb.append(", status=").append(status);
        sb.append(", name='").append(name).append("'");
        sb.append(", approved=").append(approved);
        sb.append(", video=").append(video);
        sb.append(", disclaimerMedical=").append(disclaimerMedical);
        sb.append(", disclaimerSpecialist=").append(disclaimerSpecialist);
        sb.append(", disclaimerSupplements=").append(disclaimerSupplements);
        sb.append('}');
        return sb.toString();
    }
}
