package com.vk.api.sdk.queries.account;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.account.responses.GetBannedResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Account.getBanned method
 */
public class AccountGetBannedQuery extends AbstractQueryBuilder<AccountGetBannedQuery, GetBannedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public AccountGetBannedQuery(VkApiClient client, UserActor actor) {
        super(client, "account.getBanned", GetBannedResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Offset required to select a certain subset of users. By default - 0.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountGetBannedQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of users, information of which shall be returned.
     *
     * @param value value of "count" parameter. Maximum is 200. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountGetBannedQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected AccountGetBannedQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
