package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.messages.responses.SearchResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.search method
 */
public class MessagesSearchQuery extends AbstractQueryBuilder<MessagesSearchQuery, SearchResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public MessagesSearchQuery(VkApiClient client, UserActor actor) {
        super(client, "messages.search", SearchResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public MessagesSearchQuery(VkApiClient client, GroupActor actor) {
        super(client, "messages.search", SearchResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Search query string.
     *
     * @param value value of "q" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSearchQuery q(String value) {
        return unsafeParam("q", value);
    }

    /**
     * Set peer id
     *
     * @param value value of "peer id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSearchQuery peerId(Integer value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * Set date
     *
     * @param value value of "date" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSearchQuery date(Integer value) {
        return unsafeParam("date", value);
    }

    /**
     * Number of messages to return.
     *
     * @param value value of "count" parameter. Maximum is 100. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSearchQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected MessagesSearchQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
