package com.vk.api.sdk.queries.users;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.users.responses.GetSubscriptionsResponse;

import java.util.Collections;
import java.util.List;

/**
 * Query for Users.getSubscriptions method
 */
public class UsersGetSubscriptionsQuery extends AbstractQueryBuilder<UsersGetSubscriptionsQuery, GetSubscriptionsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public UsersGetSubscriptionsQuery(VkApiClient client, UserActor actor) {
        super(client, "users.getSubscriptions", GetSubscriptionsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public UsersGetSubscriptionsQuery(VkApiClient client, ServiceActor actor) {
        super(client, "users.getSubscriptions", GetSubscriptionsResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * User ID.
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetSubscriptionsQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Offset needed to return a specific subset of subscriptions.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetSubscriptionsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of users and communities to return.
     *
     * @param value value of "count" parameter. Maximum is 200. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetSubscriptionsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected UsersGetSubscriptionsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}
