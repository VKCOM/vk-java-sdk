package com.vk.api.sdk.objects.account.responses;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.List;
import java.util.Objects;

/**
 * GetInfoResponse object
 */
public class GetInfoResponse implements Validable {
    @SerializedName("wishlists_ae_promo_banner_show")
    private BoolInt wishlistsAePromoBannerShow;

    /**
     * Two factor authentication is enabled
     */
    @SerializedName("2fa_required")
    private BoolInt _2faRequired;

    /**
     * Country code
     */
    @SerializedName("country")
    private String country;

    /**
     * Information whether HTTPS-only is enabled
     */
    @SerializedName("https_required")
    private BoolInt httpsRequired;

    /**
     * Information whether user has been processed intro
     */
    @SerializedName("intro")
    private BoolInt intro;

    @SerializedName("show_vk_apps_intro")
    private Boolean showVkAppsIntro;

    /**
     * Ads slot id for MyTarget
     */
    @SerializedName("mini_apps_ads_slot_id")
    private Integer miniAppsAdsSlotId;

    @SerializedName("qr_promotion")
    private Integer qrPromotion;

    @SerializedName("link_redirects")
    private JsonObject linkRedirects;

    /**
     * Language ID
     */
    @SerializedName("lang")
    private Integer lang;

    /**
     * Information whether wall comments should be hidden
     */
    @SerializedName("no_wall_replies")
    private BoolInt noWallReplies;

    /**
     * Information whether only owners posts should be shown
     */
    @SerializedName("own_posts_default")
    private BoolInt ownPostsDefault;

    @SerializedName("subscriptions")
    private List<Integer> subscriptions;

    public boolean isWishlistsAePromoBannerShow() {
        return wishlistsAePromoBannerShow == BoolInt.YES;
    }

    public BoolInt getWishlistsAePromoBannerShow() {
        return wishlistsAePromoBannerShow;
    }

    public boolean is_2faRequired() {
        return _2faRequired == BoolInt.YES;
    }

    public BoolInt get_2faRequired() {
        return _2faRequired;
    }

    public String getCountry() {
        return country;
    }

    public GetInfoResponse setCountry(String country) {
        this.country = country;
        return this;
    }

    public boolean isHttpsRequired() {
        return httpsRequired == BoolInt.YES;
    }

    public BoolInt getHttpsRequired() {
        return httpsRequired;
    }

    public boolean isIntro() {
        return intro == BoolInt.YES;
    }

    public BoolInt getIntro() {
        return intro;
    }

    public Boolean getShowVkAppsIntro() {
        return showVkAppsIntro;
    }

    public GetInfoResponse setShowVkAppsIntro(Boolean showVkAppsIntro) {
        this.showVkAppsIntro = showVkAppsIntro;
        return this;
    }

    public Integer getMiniAppsAdsSlotId() {
        return miniAppsAdsSlotId;
    }

    public GetInfoResponse setMiniAppsAdsSlotId(Integer miniAppsAdsSlotId) {
        this.miniAppsAdsSlotId = miniAppsAdsSlotId;
        return this;
    }

    public Integer getQrPromotion() {
        return qrPromotion;
    }

    public GetInfoResponse setQrPromotion(Integer qrPromotion) {
        this.qrPromotion = qrPromotion;
        return this;
    }

    public JsonObject getLinkRedirects() {
        return linkRedirects;
    }

    public GetInfoResponse setLinkRedirects(JsonObject linkRedirects) {
        this.linkRedirects = linkRedirects;
        return this;
    }

    public Integer getLang() {
        return lang;
    }

    public GetInfoResponse setLang(Integer lang) {
        this.lang = lang;
        return this;
    }

    public boolean isNoWallReplies() {
        return noWallReplies == BoolInt.YES;
    }

    public BoolInt getNoWallReplies() {
        return noWallReplies;
    }

    public boolean isOwnPostsDefault() {
        return ownPostsDefault == BoolInt.YES;
    }

    public BoolInt getOwnPostsDefault() {
        return ownPostsDefault;
    }

    public List<Integer> getSubscriptions() {
        return subscriptions;
    }

    public GetInfoResponse setSubscriptions(List<Integer> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(showVkAppsIntro, country, subscriptions, noWallReplies, httpsRequired, linkRedirects, qrPromotion, intro, miniAppsAdsSlotId, lang, ownPostsDefault, _2faRequired, wishlistsAePromoBannerShow);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetInfoResponse getInfoResponse = (GetInfoResponse) o;
        return Objects.equals(country, getInfoResponse.country) &&
                Objects.equals(showVkAppsIntro, getInfoResponse.showVkAppsIntro) &&
                Objects.equals(subscriptions, getInfoResponse.subscriptions) &&
                Objects.equals(noWallReplies, getInfoResponse.noWallReplies) &&
                Objects.equals(httpsRequired, getInfoResponse.httpsRequired) &&
                Objects.equals(_2faRequired, getInfoResponse._2faRequired) &&
                Objects.equals(wishlistsAePromoBannerShow, getInfoResponse.wishlistsAePromoBannerShow) &&
                Objects.equals(linkRedirects, getInfoResponse.linkRedirects) &&
                Objects.equals(miniAppsAdsSlotId, getInfoResponse.miniAppsAdsSlotId) &&
                Objects.equals(ownPostsDefault, getInfoResponse.ownPostsDefault) &&
                Objects.equals(intro, getInfoResponse.intro) &&
                Objects.equals(qrPromotion, getInfoResponse.qrPromotion) &&
                Objects.equals(lang, getInfoResponse.lang);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetInfoResponse{");
        sb.append("country='").append(country).append("'");
        sb.append(", showVkAppsIntro=").append(showVkAppsIntro);
        sb.append(", subscriptions=").append(subscriptions);
        sb.append(", noWallReplies=").append(noWallReplies);
        sb.append(", httpsRequired=").append(httpsRequired);
        sb.append(", _2faRequired=").append(_2faRequired);
        sb.append(", wishlistsAePromoBannerShow=").append(wishlistsAePromoBannerShow);
        sb.append(", linkRedirects=").append(linkRedirects);
        sb.append(", miniAppsAdsSlotId=").append(miniAppsAdsSlotId);
        sb.append(", ownPostsDefault=").append(ownPostsDefault);
        sb.append(", intro=").append(intro);
        sb.append(", qrPromotion=").append(qrPromotion);
        sb.append(", lang=").append(lang);
        sb.append('}');
        return sb.toString();
    }
}
