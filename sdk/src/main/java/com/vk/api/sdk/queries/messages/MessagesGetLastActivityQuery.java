package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.messages.LastActivity;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getLastActivity method
 */
public class MessagesGetLastActivityQuery extends AbstractQueryBuilder<MessagesGetLastActivityQuery, LastActivity> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param userId value of "user id" parameter.
     */
    public MessagesGetLastActivityQuery(VkApiClient client, UserActor actor, int userId) {
        super(client, "messages.getLastActivity", LastActivity.class);
        accessToken(actor.getAccessToken());
        userId(userId);
    }

    /**
     * User ID.
     *
     * @param value value of "user id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetLastActivityQuery userId(int value) {
        return unsafeParam("user_id", value);
    }

    @Override
    protected MessagesGetLastActivityQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("user_id", "access_token");
    }
}
