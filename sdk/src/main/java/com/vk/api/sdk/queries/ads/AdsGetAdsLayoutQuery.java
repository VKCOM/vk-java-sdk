package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.AdLayout;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.getAdsLayout method
 */
public class AdsGetAdsLayoutQuery extends AbstractQueryBuilder<AdsGetAdsLayoutQuery, List<AdLayout>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param accountId value of "account id" parameter.
     */
    public AdsGetAdsLayoutQuery(VkApiClient client, UserActor actor, int accountId) {
        super(client, "ads.getAdsLayout", Utils.buildParametrizedType(List.class, AdLayout.class));
        accessToken(actor.getAccessToken());
        accountId(accountId);
    }

    /**
     * Advertising account ID.
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetAdsLayoutQuery accountId(int value) {
        return unsafeParam("account_id", value);
    }

    /**
     * "For advertising agencies." ID of the client ads are retrieved from.
     *
     * @param value value of "client id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetAdsLayoutQuery clientId(Integer value) {
        return unsafeParam("client_id", value);
    }

    /**
     * Flag that specifies whether archived ads shall be shown.
     * '0' - show only active ads;
     * '1' - show all ads.
     *
     * @param value value of "include deleted" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetAdsLayoutQuery includeDeleted(Boolean value) {
        return unsafeParam("include_deleted", value);
    }

    /**
     * Filter by advertising campaigns.
     * Serialized JSON array with campaign IDs. If the parameter is 'null', ads of all campaigns will be shown.
     *
     * @param value value of "campaign ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetAdsLayoutQuery campaignIds(String value) {
        return unsafeParam("campaign_ids", value);
    }

    /**
     * Filter by ads.
     * Serialized JSON array with ad IDs. If the parameter is 'null', all ads will be shown.
     *
     * @param value value of "ad ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetAdsLayoutQuery adIds(String value) {
        return unsafeParam("ad_ids", value);
    }

    /**
     * Limit of number of returned ads. Used only if "ad_ids" parameter is 'null', and "campaign_ids" parameter contains ID of only one campaign.
     *
     * @param value value of "limit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetAdsLayoutQuery limit(Integer value) {
        return unsafeParam("limit", value);
    }

    /**
     * Offset. Used in the same cases as "limit" parameter.
     *
     * @param value value of "offset" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetAdsLayoutQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    @Override
    protected AdsGetAdsLayoutQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("account_id", "access_token");
    }
}
