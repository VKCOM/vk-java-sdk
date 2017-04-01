package com.vk.api.sdk.queries.utils;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.utils.DomainResolved;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Utils.resolveScreenName method
 */
public class UtilsResolveScreenNameQuery extends AbstractQueryBuilder<UtilsResolveScreenNameQuery, DomainResolved> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client     VK API client
     * @param actor      actor with access token
     * @param screenName value of "screen name" parameter.
     */
    public UtilsResolveScreenNameQuery(VkApiClient client, UserActor actor, String screenName) {
        super(client, "utils.resolveScreenName", DomainResolved.class);
        accessToken(actor.getAccessToken());
        screenName(screenName);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client     VK API client
     * @param actor      actor with access token
     * @param screenName value of "screen name" parameter.
     */
    public UtilsResolveScreenNameQuery(VkApiClient client, GroupActor actor, String screenName) {
        super(client, "utils.resolveScreenName", DomainResolved.class);
        accessToken(actor.getAccessToken());
        screenName(screenName);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client     VK API client
     * @param screenName value of "screen name" parameter.
     */
    public UtilsResolveScreenNameQuery(VkApiClient client, ServiceActor actor, String screenName) {
        super(client, "utils.resolveScreenName", DomainResolved.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        screenName(screenName);
    }

    /**
     * Screen name of the user, community (e.g., "apiclub," "andrew", or "rules_of_war"), or application.
     *
     * @param value value of "screen name" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected UtilsResolveScreenNameQuery screenName(String value) {
        return unsafeParam("screen_name", value);
    }

    @Override
    protected UtilsResolveScreenNameQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("screen_name");
    }
}
