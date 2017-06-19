package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
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
    public MessagesGetByIdQuery(VkApiClient client, UserActor actor, int... messageIds) {
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
    public MessagesGetByIdQuery(VkApiClient client, GroupActor actor, int... messageIds) {
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
    public MessagesGetByIdQuery(VkApiClient client, UserActor actor, List<Integer> messageIds) {
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
    public MessagesGetByIdQuery(VkApiClient client, GroupActor actor, List<Integer> messageIds) {
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

    /**
     * Number of characters after which to truncate a previewed message. To preview the full message, specify "0".
     * NOTE: Messages are not truncated by default. Messages are truncated by words.
     *
     * @param value value of "preview length" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetByIdQuery previewLength(Integer value) {
        return unsafeParam("preview_length", value);
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
