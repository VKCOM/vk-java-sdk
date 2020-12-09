package com.vk.api.sdk.queries.secure;

import com.vk.api.sdk.client.AbstractSecureQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.secure.responses.GetSMSHistoryResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Secure.getSMSHistory method
 */
public class SecureGetSMSHistoryQuery extends AbstractSecureQueryBuilder<SecureGetSMSHistoryQuery, List<GetSMSHistoryResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public SecureGetSMSHistoryQuery(VkApiClient client, ServiceActor actor) {
        super(client, "secure.getSMSHistory", Utils.buildParametrizedType(List.class, GetSMSHistoryResponse.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public SecureGetSMSHistoryQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Filter by start date. It is set as UNIX-time.
     *
     * @param value value of "date from" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public SecureGetSMSHistoryQuery dateFrom(Integer value) {
        return unsafeParam("date_from", value);
    }

    /**
     * Filter by end date. It is set as UNIX-time.
     *
     * @param value value of "date to" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public SecureGetSMSHistoryQuery dateTo(Integer value) {
        return unsafeParam("date_to", value);
    }

    /**
     * Number of returned posts. By default — 1000.
     *
     * @param value value of "limit" parameter. Maximum is 1000. Minimum is 0. By default 1000.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public SecureGetSMSHistoryQuery limit(Integer value) {
        return unsafeParam("limit", value);
    }

    @Override
    protected SecureGetSMSHistoryQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
