package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.responses.GetLookalikeRequestsResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.getLookalikeRequests method
 */
public class AdsGetLookalikeRequestsQuery extends AbstractQueryBuilder<AdsGetLookalikeRequestsQuery, GetLookalikeRequestsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param accountId value of "account id" parameter.
     */
    public AdsGetLookalikeRequestsQuery(VkApiClient client, UserActor actor, int accountId) {
        super(client, "ads.getLookalikeRequests", GetLookalikeRequestsResponse.class);
        accessToken(actor.getAccessToken());
        accountId(accountId);
    }

    /**
     * Set account id
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetLookalikeRequestsQuery accountId(int value) {
        return unsafeParam("account_id", value);
    }

    /**
     * Set client id
     *
     * @param value value of "client id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetLookalikeRequestsQuery clientId(Integer value) {
        return unsafeParam("client_id", value);
    }

    /**
     * Set requests ids
     *
     * @param value value of "requests ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetLookalikeRequestsQuery requestsIds(String value) {
        return unsafeParam("requests_ids", value);
    }

    /**
     * Set offset
     *
     * @param value value of "offset" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetLookalikeRequestsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Set limit
     *
     * @param value value of "limit" parameter. Maximum is 200. Minimum is 0. By default 10.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetLookalikeRequestsQuery limit(Integer value) {
        return unsafeParam("limit", value);
    }

    /**
     * Set sort by
     *
     * @param value value of "sort by" parameter. By default id.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetLookalikeRequestsQuery sortBy(String value) {
        return unsafeParam("sort_by", value);
    }

    @Override
    protected AdsGetLookalikeRequestsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("account_id", "access_token");
    }
}
