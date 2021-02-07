package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.responses.GetPostsReachResponse;
import com.vk.api.sdk.objects.enums.AdsIdsType;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.getPostsReach method
 */
public class AdsGetPostsReachQuery extends AbstractQueryBuilder<AdsGetPostsReachQuery, List<GetPostsReachResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param accountId value of "account id" parameter.
     * @param idsType value of "ids type" parameter.
     * @param ids value of "ids" parameter.
     */
    public AdsGetPostsReachQuery(VkApiClient client, UserActor actor, int accountId,
            AdsIdsType idsType, String ids) {
        super(client, "ads.getPostsReach", Utils.buildParametrizedType(List.class, GetPostsReachResponse.class));
        accessToken(actor.getAccessToken());
        accountId(accountId);
        idsType(idsType);
        ids(ids);
    }

    /**
     * Advertising account ID.
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetPostsReachQuery accountId(int value) {
        return unsafeParam("account_id", value);
    }

    /**
     * Type of requested objects listed in 'ids' parameter: *ad — ads,, *campaign — campaigns.
     *
     * @param value value of "ids type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetPostsReachQuery idsType(AdsIdsType value) {
        return unsafeParam("ids_type", value);
    }

    /**
     * IDs requested ads or campaigns, separated with a comma, depending on the value set in 'ids_type'. Maximum 100 objects.
     *
     * @param value value of "ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetPostsReachQuery ids(String value) {
        return unsafeParam("ids", value);
    }

    @Override
    protected AdsGetPostsReachQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("ids_type", "ids", "account_id", "access_token");
    }
}
