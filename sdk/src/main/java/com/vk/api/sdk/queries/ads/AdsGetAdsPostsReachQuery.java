package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.PostStats;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.getAdsPostsReach method
 */
public class AdsGetAdsPostsReachQuery extends AbstractQueryBuilder<AdsGetAdsPostsReachQuery, List<PostStats>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param accountId value of "account id" parameter.
     * @param adsIds    value of "ads ids" parameter.
     */
    public AdsGetAdsPostsReachQuery(VkApiClient client, UserActor actor, int accountId, String adsIds) {
        super(client, "ads.getAdsPostsReach", Utils.buildParametrizedType(List.class, PostStats.class));
        accessToken(actor.getAccessToken());
        accountId(accountId);
        adsIds(adsIds);
    }

    /**
     * Account ID.
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetAdsPostsReachQuery accountId(int value) {
        return unsafeParam("account_id", value);
    }

    /**
     * Ads IDS separated by comma.
     *
     * @param value value of "ads ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetAdsPostsReachQuery adsIds(String value) {
        return unsafeParam("ads_ids", value);
    }

    @Override
    protected AdsGetAdsPostsReachQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("ads_ids", "account_id", "access_token");
    }
}
