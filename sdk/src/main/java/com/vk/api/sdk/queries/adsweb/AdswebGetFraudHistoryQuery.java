package com.vk.api.sdk.queries.adsweb;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.adsweb.responses.GetFraudHistoryResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Adsweb.getFraudHistory method
 */
public class AdswebGetFraudHistoryQuery extends AbstractQueryBuilder<AdswebGetFraudHistoryQuery, GetFraudHistoryResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param officeId value of "office id" parameter.
     */
    public AdswebGetFraudHistoryQuery(VkApiClient client, UserActor actor, int officeId) {
        super(client, "adsweb.getFraudHistory", GetFraudHistoryResponse.class);
        accessToken(actor.getAccessToken());
        officeId(officeId);
    }

    /**
     * Set office id
     *
     * @param value value of "office id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdswebGetFraudHistoryQuery officeId(int value) {
        return unsafeParam("office_id", value);
    }

    /**
     * Set sites ids
     *
     * @param value value of "sites ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdswebGetFraudHistoryQuery sitesIds(String value) {
        return unsafeParam("sites_ids", value);
    }

    /**
     * Set limit
     *
     * @param value value of "limit" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdswebGetFraudHistoryQuery limit(Integer value) {
        return unsafeParam("limit", value);
    }

    /**
     * Set offset
     *
     * @param value value of "offset" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdswebGetFraudHistoryQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    @Override
    protected AdswebGetFraudHistoryQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("office_id", "access_token");
    }
}
