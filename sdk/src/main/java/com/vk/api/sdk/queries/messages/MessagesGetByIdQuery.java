package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.messages.responses.GetByIdResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getById method
 */
public class MessagesGetByIdQuery extends AbstractQueryBuilder<MessagesGetByIdQuery, GetByIdResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client     VK API client
     * @param actor      actor with access token
     * @param messageIds value of "message ids" parameter.
     */
    public MessagesGetByIdQuery(VkApiClient client, Actor actor, int... messageIds) {
        super(client, "messages.getById", GetByIdResponse.class);
        accessToken(actor.getAccessToken());
        messageIds(messageIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client     VK API client
     * @param actor      actor with access token
     * @param messageIds value of "message ids" parameter.
     */
    public MessagesGetByIdQuery(VkApiClient client, Actor actor, List<Integer> messageIds) {
        super(client, "messages.getById", GetByIdResponse.class);
        accessToken(actor.getAccessToken());
        messageIds(messageIds);
    }

    /**
     * Message IDs.
     *
     * @param value value of "message ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetByIdQuery messageIds(int... value) {
        return unsafeParam("message_ids", value);
    }

    /**
     * Message IDs.
     *
     * @param value value of "message ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetByIdQuery messageIds(List<Integer> value) {
        return unsafeParam("message_ids", value);
    }

    @Override
    protected MessagesGetByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("message_ids", "access_token");
    }
}
