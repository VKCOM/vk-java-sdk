package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Apps.getScore method
 */
public class AppsGetScoreQuery extends AbstractQueryBuilder<AppsGetScoreQuery, Integer> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param userId value of "user id" parameter. Minimum is 0.
     */
    public AppsGetScoreQuery(VkApiClient client, UserActor actor, int userId) {
        super(client, "apps.getScore", Integer.class);
        accessToken(actor.getAccessToken());
        userId(userId);
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AppsGetScoreQuery userId(int value) {
        return unsafeParam("user_id", value);
    }

    @Override
    protected AppsGetScoreQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("user_id", "access_token");
    }
}
