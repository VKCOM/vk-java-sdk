package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.responses.GetTargetingStatsResponse;
import com.vk.api.sdk.objects.enums.AdsAdFormat;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.getTargetingStats method
 */
public class AdsGetTargetingStatsQuery extends AbstractQueryBuilder<AdsGetTargetingStatsQuery, GetTargetingStatsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param accountId value of "account id" parameter.
     * @param linkUrl value of "link url" parameter.
     */
    public AdsGetTargetingStatsQuery(VkApiClient client, UserActor actor, int accountId,
            String linkUrl) {
        super(client, "ads.getTargetingStats", GetTargetingStatsResponse.class);
        accessToken(actor.getAccessToken());
        accountId(accountId);
        linkUrl(linkUrl);
    }

    /**
     * Advertising account ID.
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetTargetingStatsQuery accountId(int value) {
        return unsafeParam("account_id", value);
    }

    /**
     * Set client id
     *
     * @param value value of "client id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetTargetingStatsQuery clientId(Integer value) {
        return unsafeParam("client_id", value);
    }

    /**
     * Serialized JSON object that describes targeting parameters. Description of 'criteria' object see below.
     *
     * @param value value of "criteria" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetTargetingStatsQuery criteria(String value) {
        return unsafeParam("criteria", value);
    }

    /**
     * ID of an ad which targeting parameters shall be analyzed.
     *
     * @param value value of "ad id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetTargetingStatsQuery adId(Integer value) {
        return unsafeParam("ad_id", value);
    }

    /**
     * Ad format. Possible values: *'1' — image and text,, *'2' — big image,, *'3' — exclusive format,, *'4' — community, square image,, *'7' — special app format,, *'8' — special community format,, *'9' — post in community,, *'10' — app board.
     *
     * @param value value of "ad format" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetTargetingStatsQuery adFormat(AdsAdFormat value) {
        return unsafeParam("ad_format", value);
    }

    /**
     * Platforms to use for ad showing. Possible values: (for 'ad_format' = '1'), *'0' — VK and partner sites,, *'1' — VK only. (for 'ad_format' = '9'), *'all' — all platforms,, *'desktop' — desktop version,, *'mobile' — mobile version and apps.
     *
     * @param value value of "ad platform" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetTargetingStatsQuery adPlatform(String value) {
        return unsafeParam("ad_platform", value);
    }

    /**
     * Set ad platform no wall
     *
     * @param value value of "ad platform no wall" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetTargetingStatsQuery adPlatformNoWall(String value) {
        return unsafeParam("ad_platform_no_wall", value);
    }

    /**
     * Set ad platform no ad network
     *
     * @param value value of "ad platform no ad network" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetTargetingStatsQuery adPlatformNoAdNetwork(String value) {
        return unsafeParam("ad_platform_no_ad_network", value);
    }

    /**
     * URL for the advertised object.
     *
     * @param value value of "link url" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetTargetingStatsQuery linkUrl(String value) {
        return unsafeParam("link_url", value);
    }

    /**
     * Domain of the advertised object.
     *
     * @param value value of "link domain" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetTargetingStatsQuery linkDomain(String value) {
        return unsafeParam("link_domain", value);
    }

    /**
     * Additionally return recommended cpc and cpm to reach 5,10..95 percents of audience.
     *
     * @param value value of "need precise" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetTargetingStatsQuery needPrecise(Boolean value) {
        return unsafeParam("need_precise", value);
    }

    /**
     * Impressions limit period in seconds, must be a multiple of 86400(day)
     *
     * @param value value of "impressions limit period" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetTargetingStatsQuery impressionsLimitPeriod(Integer value) {
        return unsafeParam("impressions_limit_period", value);
    }

    @Override
    protected AdsGetTargetingStatsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("link_url", "account_id", "access_token");
    }
}
