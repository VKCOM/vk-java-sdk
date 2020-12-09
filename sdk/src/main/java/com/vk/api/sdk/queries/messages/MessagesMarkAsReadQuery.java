package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.markAsRead method
 */
public class MessagesMarkAsReadQuery extends AbstractQueryBuilder<MessagesMarkAsReadQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesMarkAsReadQuery(VkApiClient client, UserActor actor) {
        super(client, "messages.markAsRead", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesMarkAsReadQuery(VkApiClient client, GroupActor actor) {
        super(client, "messages.markAsRead", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
    }

    /**
     * Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
     *
     * @param value value of "peer id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesMarkAsReadQuery peerId(Integer value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * Message ID to start from.
     *
     * @param value value of "start message id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesMarkAsReadQuery startMessageId(Integer value) {
        return unsafeParam("start_message_id", value);
    }

    /**
     * Group ID (for group messages with user access token)
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesMarkAsReadQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set mark conversation as read
     *
     * @param value value of "mark conversation as read" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesMarkAsReadQuery markConversationAsRead(Boolean value) {
        return unsafeParam("mark_conversation_as_read", value);
    }

    /**
     * message_ids
     * IDs of messages to mark as read.
     *
     * @param value value of "message ids" parameter. By default [].
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesMarkAsReadQuery messageIds(Integer... value) {
        return unsafeParam("message_ids", value);
    }

    /**
     * IDs of messages to mark as read.
     *
     * @param value value of "message ids" parameter. By default [].
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesMarkAsReadQuery messageIds(List<Integer> value) {
        return unsafeParam("message_ids", value);
    }

    @Override
    protected MessagesMarkAsReadQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
