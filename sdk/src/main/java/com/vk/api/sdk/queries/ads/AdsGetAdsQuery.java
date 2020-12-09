package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.responses.GetAdsResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.getAds method
 */
public class AdsGetAdsQuery extends AbstractQueryBuilder<AdsGetAdsQuery, List<GetAdsResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param accountId value of "account id" parameter.
     */
    public AdsGetAdsQuery(VkApiClient client, UserActor actor, int accountId) {
        super(client, "ads.getAds", Utils.buildParametrizedType(List.class, GetAdsResponse.class));
        accessToken(actor.getAccessToken());
        accountId(accountId);
    }

    /**
     * Advertising account ID.
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetAdsQuery accountId(int value) {
        return unsafeParam("account_id", value);
    }

    /**
     * Filter by ads. Serialized JSON array with ad IDs. If the parameter is null, all ads will be shown.
     *
     * @param value value of "ad ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetAdsQuery adIds(String value) {
        return unsafeParam("ad_ids", value);
    }

    /**
     * Filter by advertising campaigns. Serialized JSON array with campaign IDs. If the parameter is null, ads of all campaigns will be shown.
     *
     * @param value value of "campaign ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetAdsQuery campaignIds(String value) {
        return unsafeParam("campaign_ids", value);
    }

    /**
     * 'Available and required for advertising agencies.' ID of the client ads are retrieved from.
     *
     * @param value value of "client id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetAdsQuery clientId(Integer value) {
        return unsafeParam("client_id", value);
    }

    /**
     * Flag that specifies whether archived ads shall be shown: *0 — show only active ads,, *1 — show all ads.
     *
     * @param value value of "include deleted" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetAdsQuery includeDeleted(Boolean value) {
        return unsafeParam("include_deleted", value);
    }

    /**
     * Flag that specifies whether to show only archived ads: *0 — show all ads,, *1 — show only archived ads. Available when include_deleted flag is *1
     *
     * @param value value of "only deleted" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetAdsQuery onlyDeleted(Boolean value) {
        return unsafeParam("only_deleted", value);
    }

    /**
     * Limit of number of returned ads. Used only if ad_ids parameter is null, and 'campaign_ids' parameter contains ID of only one campaign.
     *
     * @param value value of "limit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetAdsQuery limit(Integer value) {
        return unsafeParam("limit", value);
    }

    /**
     * Offset. Used in the same cases as 'limit' parameter.
     *
     * @param value value of "offset" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetAdsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    @Override
    protected AdsGetAdsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("account_id", "access_token");
    }
}
