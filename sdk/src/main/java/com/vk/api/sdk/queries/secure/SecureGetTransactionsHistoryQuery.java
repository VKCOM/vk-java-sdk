package com.vk.api.sdk.queries.secure;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.secure.Transaction;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Secure.getTransactionsHistory method
 */
public class SecureGetTransactionsHistoryQuery extends AbstractSecureQueryBuilder<SecureGetTransactionsHistoryQuery, List<Transaction>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public SecureGetTransactionsHistoryQuery(VkApiClient client, ServiceActor actor) {
        super(client, "secure.getTransactionsHistory", Utils.buildParametrizedType(List.class, Transaction.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    @Override
    protected SecureGetTransactionsHistoryQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token", "client_secret");
    }
}
