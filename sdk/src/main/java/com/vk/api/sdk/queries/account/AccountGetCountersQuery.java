package com.vk.api.sdk.queries.account;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.account.AccountCounters;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Account.getCounters method
 */
public class AccountGetCountersQuery extends AbstractQueryBuilder<AccountGetCountersQuery, AccountCounters> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public AccountGetCountersQuery(VkApiClient client, UserActor actor) {
        super(client, "account.getCounters", AccountCounters.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Counters information of which shall be returned
     *
     * @param value value of "filter" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountGetCountersQuery filter(AccountGetCountersFilter... value) {
        return unsafeParam("filter", value);
    }

    /**
     * Counters information of which shall be returned
     *
     * @param value value of "filter" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountGetCountersQuery filter(List<AccountGetCountersFilter> value) {
        return unsafeParam("filter", value);
    }

    @Override
    protected AccountGetCountersQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
