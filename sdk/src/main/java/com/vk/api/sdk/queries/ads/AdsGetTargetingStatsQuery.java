package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.TargStats;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.getTargetingStats method
 */
public class AdsGetTargetingStatsQuery extends AbstractQueryBuilder<AdsGetTargetingStatsQuery, TargStats> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param accountId value of "account id" parameter.
     * @param linkUrl   value of "link url" parameter.
     */
    public AdsGetTargetingStatsQuery(VkApiClient client, UserActor actor, int accountId, String linkUrl) {
        super(client, "ads.getTargetingStats", TargStats.class);
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
     * Serialized JSON object that describes targeting parameters. Description of "criteria" object see below.
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
     * Set ad format
     *
     * @param value value of "ad format" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetTargetingStatsQuery adFormat(Integer value) {
        return unsafeParam("ad_format", value);
    }

    /**
     * Set ad platform
     *
     * @param value value of "ad platform" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetTargetingStatsQuery adPlatform(String value) {
        return unsafeParam("ad_platform", value);
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

    @Override
    protected AdsGetTargetingStatsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("link_url", "account_id", "access_token");
    }
}
