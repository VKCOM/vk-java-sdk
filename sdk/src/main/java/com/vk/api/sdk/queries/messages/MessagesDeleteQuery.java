package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.delete method
 */
public class MessagesDeleteQuery extends AbstractQueryBuilder<MessagesDeleteQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public MessagesDeleteQuery(VkApiClient client, Actor actor) {
        super(client, "messages.delete", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Message IDs.
     *
     * @param value value of "message ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesDeleteQuery messageIds(Integer... value) {
        return unsafeParam("message_ids", value);
    }

    /**
     * Message IDs.
     *
     * @param value value of "message ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesDeleteQuery messageIds(List<Integer> value) {
        return unsafeParam("message_ids", value);
    }

    /**
     * Set spam
     *
     * @param value value of "spam" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesDeleteQuery spam(Boolean value) {
        return unsafeParam("spam", value);
    }

    @Override
    protected MessagesDeleteQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
