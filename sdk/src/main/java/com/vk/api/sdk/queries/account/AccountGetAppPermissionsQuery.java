package com.vk.api.sdk.queries.account;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Account.getAppPermissions method
 */
public class AccountGetAppPermissionsQuery extends AbstractQueryBuilder<AccountGetAppPermissionsQuery, Integer> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param userId value of "user id" parameter. Minimum is 0.
     */
    public AccountGetAppPermissionsQuery(VkApiClient client, UserActor actor, int userId) {
        super(client, "account.getAppPermissions", Integer.class);
        accessToken(actor.getAccessToken());
        userId(userId);
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AccountGetAppPermissionsQuery userId(int value) {
        return unsafeParam("user_id", value);
    }

    @Override
    protected AccountGetAppPermissionsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("user_id", "access_token");
    }
}
