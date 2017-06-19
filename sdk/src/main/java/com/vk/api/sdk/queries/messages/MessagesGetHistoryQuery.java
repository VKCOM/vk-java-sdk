package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.messages.responses.GetHistoryResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getHistory method
 */
public class MessagesGetHistoryQuery extends AbstractQueryBuilder<MessagesGetHistoryQuery, GetHistoryResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public MessagesGetHistoryQuery(VkApiClient client, UserActor actor) {
        super(client, "messages.getHistory", GetHistoryResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public MessagesGetHistoryQuery(VkApiClient client, GroupActor actor) {
        super(client, "messages.getHistory", GetHistoryResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Offset needed to return a specific subset of messages.
     *
     * @param value value of "offset" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetHistoryQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of messages to return.
     *
     * @param value value of "count" parameter. Maximum is 200. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetHistoryQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * ID of the user whose message history you want to return.
     *
     * @param value value of "user id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetHistoryQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Set peer id
     *
     * @param value value of "peer id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetHistoryQuery peerId(Integer value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * Starting message ID from which to return history.
     *
     * @param value value of "start message id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetHistoryQuery startMessageId(Integer value) {
        return unsafeParam("start_message_id", value);
    }

    /**
     * Return messages in chronological order.
     *
     * @param value value of "rev" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetHistoryQuery rev(Boolean value) {
        return unsafeParam("rev", value);
    }

    @Override
    protected MessagesGetHistoryQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
