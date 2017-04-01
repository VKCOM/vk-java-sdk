package com.vk.api.sdk.queries.users;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.users.responses.GetSubscriptionsExtendedResponse;

import java.util.Collections;
import java.util.List;

/**
 * Query for Users.getSubscriptions method
 */
public class UsersGetSubscriptionsQueryWithExtended extends AbstractQueryBuilder<UsersGetSubscriptionsQueryWithExtended, GetSubscriptionsExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public UsersGetSubscriptionsQueryWithExtended(VkApiClient client, UserActor actor) {
        super(client, "users.getSubscriptions", GetSubscriptionsExtendedResponse.class);
        accessToken(actor.getAccessToken());
        extended(true);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public UsersGetSubscriptionsQueryWithExtended(VkApiClient client, ServiceActor actor) {
        super(client, "users.getSubscriptions", GetSubscriptionsExtendedResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        extended(true);
    }

    /**
     * User ID.
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetSubscriptionsQueryWithExtended userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Return a combined list of users and communities
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected UsersGetSubscriptionsQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Offset needed to return a specific subset of subscriptions.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetSubscriptionsQueryWithExtended offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of users and communities to return.
     *
     * @param value value of "count" parameter. Maximum is 200. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetSubscriptionsQueryWithExtended count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetSubscriptionsQueryWithExtended fields(UserField... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetSubscriptionsQueryWithExtended fields(List<UserField> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected UsersGetSubscriptionsQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}
