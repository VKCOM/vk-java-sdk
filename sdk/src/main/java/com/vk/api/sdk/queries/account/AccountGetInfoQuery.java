package com.vk.api.sdk.queries.account;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.account.Info;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Account.getInfo method
 */
public class AccountGetInfoQuery extends AbstractQueryBuilder<AccountGetInfoQuery, Info> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public AccountGetInfoQuery(VkApiClient client, UserActor actor) {
        super(client, "account.getInfo", Info.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountGetInfoQuery fields(AccountGetInfoField... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountGetInfoQuery fields(List<AccountGetInfoField> value) {
        return unsafeParam("fields", value);
    }


    @Override
    protected AccountGetInfoQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
