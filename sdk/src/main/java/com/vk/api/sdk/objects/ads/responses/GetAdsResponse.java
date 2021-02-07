package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.Gson;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.ads.AdApproved;
import com.vk.api.sdk.objects.ads.AdCostType;
import com.vk.api.sdk.objects.ads.AdStatus;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * GetAdsResponse object
 */
public class GetAdsResponse implements Validable {
    /**
     * Ad format
     */
    @SerializedName("ad_format")
    private Integer adFormat;

    /**
     * Ad platform
     */
    @SerializedName("ad_platform")
    private JsonPrimitive adPlatform;

    /**
     * Total limit
     */
    @SerializedName("all_limit")
    private Integer allLimit;

    @SerializedName("approved")
    @Required
    private AdApproved approved;

    /**
     * Campaign ID
     */
    @SerializedName("campaign_id")
    private Integer campaignId;

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
     * Cost of an action, kopecks
     */
    @SerializedName("cpa")
    private Integer cpa;

    /**
     * Cost of 1000 impressions optimized, kopecks
     */
    @SerializedName("ocpm")
    private Integer ocpm;

    /**
     * Max cost of target actions for autobidding, kopecks
     */
    @SerializedName("autobidding_max_cost")
    private Integer autobiddingMaxCost;

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

    /**
     * Ad ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

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
     * Ad title
     */
    @SerializedName("name")
    @Required
    private String name;

    @SerializedName("status")
    @Required
    private AdStatus status;

    /**
     * Information whether the ad is a video
     */
    @SerializedName("video")
    private BoolInt video;

    public Integer getAdFormat() {
        return adFormat;
    }

    public GetAdsResponse setAdFormat(Integer adFormat) {
        this.adFormat = adFormat;
        return this;
    }

    public JsonPrimitive getAdPlatform() {
        return adPlatform;
    }

    public GetAdsResponse setAdPlatform(JsonPrimitive adPlatform) {
        this.adPlatform = adPlatform;
        return this;
    }

    public Integer getAllLimit() {
        return allLimit;
    }

    public GetAdsResponse setAllLimit(Integer allLimit) {
        this.allLimit = allLimit;
        return this;
    }

    public AdApproved getApproved() {
        return approved;
    }

    public GetAdsResponse setApproved(AdApproved approved) {
        this.approved = approved;
        return this;
    }

    public Integer getCampaignId() {
        return campaignId;
    }

    public GetAdsResponse setCampaignId(Integer campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    public Integer getCategory1Id() {
        return category1Id;
    }

    public GetAdsResponse setCategory1Id(Integer category1Id) {
        this.category1Id = category1Id;
        return this;
    }

    public Integer getCategory2Id() {
        return category2Id;
    }

    public GetAdsResponse setCategory2Id(Integer category2Id) {
        this.category2Id = category2Id;
        return this;
    }

    public AdCostType getCostType() {
        return costType;
    }

    public GetAdsResponse setCostType(AdCostType costType) {
        this.costType = costType;
        return this;
    }

    public Integer getCpc() {
        return cpc;
    }

    public GetAdsResponse setCpc(Integer cpc) {
        this.cpc = cpc;
        return this;
    }

    public Integer getCpm() {
        return cpm;
    }

    public GetAdsResponse setCpm(Integer cpm) {
        this.cpm = cpm;
        return this;
    }

    public Integer getCpa() {
        return cpa;
    }

    public GetAdsResponse setCpa(Integer cpa) {
        this.cpa = cpa;
        return this;
    }

    public Integer getOcpm() {
        return ocpm;
    }

    public GetAdsResponse setOcpm(Integer ocpm) {
        this.ocpm = ocpm;
        return this;
    }

    public Integer getAutobiddingMaxCost() {
        return autobiddingMaxCost;
    }

    public GetAdsResponse setAutobiddingMaxCost(Integer autobiddingMaxCost) {
        this.autobiddingMaxCost = autobiddingMaxCost;
        return this;
    }

    public boolean isDisclaimerMedical() {
        return disclaimerMedical == BoolInt.YES;
    }

    public BoolInt getDisclaimerMedical() {
        return disclaimerMedical;
    }

    public boolean isDisclaimerSpecialist() {
        return disclaimerSpecialist == BoolInt.YES;
    }

    public BoolInt getDisclaimerSpecialist() {
        return disclaimerSpecialist;
    }

    public boolean isDisclaimerSupplements() {
        return disclaimerSupplements == BoolInt.YES;
    }

    public BoolInt getDisclaimerSupplements() {
        return disclaimerSupplements;
    }

    public Integer getId() {
        return id;
    }

    public GetAdsResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getImpressionsLimit() {
        return impressionsLimit;
    }

    public GetAdsResponse setImpressionsLimit(Integer impressionsLimit) {
        this.impressionsLimit = impressionsLimit;
        return this;
    }

    public boolean isImpressionsLimited() {
        return impressionsLimited == BoolInt.YES;
    }

    public BoolInt getImpressionsLimited() {
        return impressionsLimited;
    }

    public String getName() {
        return name;
    }

    public GetAdsResponse setName(String name) {
        this.name = name;
        return this;
    }

    public AdStatus getStatus() {
        return status;
    }

    public GetAdsResponse setStatus(AdStatus status) {
        this.status = status;
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
        return Objects.hash(autobiddingMaxCost, cpm, impressionsLimit, ocpm, allLimit, campaignId, category2Id, disclaimerMedical, category1Id, disclaimerSpecialist, video, disclaimerSupplements, adPlatform, approved, impressionsLimited, cpa, costType, cpc, name, id, adFormat, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAdsResponse getAdsResponse = (GetAdsResponse) o;
        return Objects.equals(adFormat, getAdsResponse.adFormat) &&
                Objects.equals(cpm, getAdsResponse.cpm) &&
                Objects.equals(ocpm, getAdsResponse.ocpm) &&
                Objects.equals(autobiddingMaxCost, getAdsResponse.autobiddingMaxCost) &&
                Objects.equals(costType, getAdsResponse.costType) &&
                Objects.equals(video, getAdsResponse.video) &&
                Objects.equals(allLimit, getAdsResponse.allLimit) &&
                Objects.equals(category1Id, getAdsResponse.category1Id) &&
                Objects.equals(impressionsLimited, getAdsResponse.impressionsLimited) &&
                Objects.equals(approved, getAdsResponse.approved) &&
                Objects.equals(disclaimerSpecialist, getAdsResponse.disclaimerSpecialist) &&
                Objects.equals(adPlatform, getAdsResponse.adPlatform) &&
                Objects.equals(cpa, getAdsResponse.cpa) &&
                Objects.equals(cpc, getAdsResponse.cpc) &&
                Objects.equals(impressionsLimit, getAdsResponse.impressionsLimit) &&
                Objects.equals(name, getAdsResponse.name) &&
                Objects.equals(id, getAdsResponse.id) &&
                Objects.equals(disclaimerSupplements, getAdsResponse.disclaimerSupplements) &&
                Objects.equals(campaignId, getAdsResponse.campaignId) &&
                Objects.equals(category2Id, getAdsResponse.category2Id) &&
                Objects.equals(disclaimerMedical, getAdsResponse.disclaimerMedical) &&
                Objects.equals(status, getAdsResponse.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetAdsResponse{");
        sb.append("adFormat=").append(adFormat);
        sb.append(", cpm=").append(cpm);
        sb.append(", ocpm=").append(ocpm);
        sb.append(", autobiddingMaxCost=").append(autobiddingMaxCost);
        sb.append(", costType=").append(costType);
        sb.append(", video=").append(video);
        sb.append(", allLimit=").append(allLimit);
        sb.append(", category1Id=").append(category1Id);
        sb.append(", impressionsLimited=").append(impressionsLimited);
        sb.append(", approved=").append(approved);
        sb.append(", disclaimerSpecialist=").append(disclaimerSpecialist);
        sb.append(", adPlatform=").append(adPlatform);
        sb.append(", cpa=").append(cpa);
        sb.append(", cpc=").append(cpc);
        sb.append(", impressionsLimit=").append(impressionsLimit);
        sb.append(", name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append(", disclaimerSupplements=").append(disclaimerSupplements);
        sb.append(", campaignId=").append(campaignId);
        sb.append(", category2Id=").append(category2Id);
        sb.append(", disclaimerMedical=").append(disclaimerMedical);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
