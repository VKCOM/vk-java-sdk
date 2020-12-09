package com.vk.api.sdk.queries.secure;

import com.vk.api.sdk.client.AbstractSecureQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.secure.responses.GetTransactionsHistoryResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Secure.getTransactionsHistory method
 */
public class SecureGetTransactionsHistoryQuery extends AbstractSecureQueryBuilder<SecureGetTransactionsHistoryQuery, List<GetTransactionsHistoryResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public SecureGetTransactionsHistoryQuery(VkApiClient client, ServiceActor actor) {
        super(client, "secure.getTransactionsHistory", Utils.buildParametrizedType(List.class, GetTransactionsHistoryResponse.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Set type
     *
     * @param value value of "type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public SecureGetTransactionsHistoryQuery type(Integer value) {
        return unsafeParam("type", value);
    }

    /**
     * Set uid from
     *
     * @param value value of "uid from" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public SecureGetTransactionsHistoryQuery uidFrom(Integer value) {
        return unsafeParam("uid_from", value);
    }

    /**
     * Set uid to
     *
     * @param value value of "uid to" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public SecureGetTransactionsHistoryQuery uidTo(Integer value) {
        return unsafeParam("uid_to", value);
    }

    /**
     * Set date from
     *
     * @param value value of "date from" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public SecureGetTransactionsHistoryQuery dateFrom(Integer value) {
        return unsafeParam("date_from", value);
    }

    /**
     * Set date to
     *
     * @param value value of "date to" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public SecureGetTransactionsHistoryQuery dateTo(Integer value) {
        return unsafeParam("date_to", value);
    }

    /**
     * Set limit
     *
     * @param value value of "limit" parameter. Maximum is 1000. Minimum is 0. By default 1000.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public SecureGetTransactionsHistoryQuery limit(Integer value) {
        return unsafeParam("limit", value);
    }

    @Override
    protected SecureGetTransactionsHistoryQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
