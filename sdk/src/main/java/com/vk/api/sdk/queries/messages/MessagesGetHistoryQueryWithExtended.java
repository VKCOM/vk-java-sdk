package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.enums.MessagesRev;
import com.vk.api.sdk.objects.messages.responses.GetHistoryExtendedResponse;
import com.vk.api.sdk.objects.users.Fields;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getHistory method
 */
public class MessagesGetHistoryQueryWithExtended extends AbstractQueryBuilder<MessagesGetHistoryQueryWithExtended, GetHistoryExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesGetHistoryQueryWithExtended(VkApiClient client, UserActor actor) {
        super(client, "messages.getHistory", GetHistoryExtendedResponse.class);
        accessToken(actor.getAccessToken());
        extended(true);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesGetHistoryQueryWithExtended(VkApiClient client, GroupActor actor) {
        super(client, "messages.getHistory", GetHistoryExtendedResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        extended(true);
    }

    /**
     * Offset needed to return a specific subset of messages.
     *
     * @param value value of "offset" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetHistoryQueryWithExtended offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of messages to return.
     *
     * @param value value of "count" parameter. Maximum is 200. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetHistoryQueryWithExtended count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * ID of the user whose message history you want to return.
     *
     * @param value value of "user id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetHistoryQueryWithExtended userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Set peer id
     *
     * @param value value of "peer id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetHistoryQueryWithExtended peerId(Integer value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * Starting message ID from which to return history.
     *
     * @param value value of "start message id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetHistoryQueryWithExtended startMessageId(Integer value) {
        return unsafeParam("start_message_id", value);
    }

    /**
     * Sort order: '1' — return messages in chronological order. '0' — return messages in reverse chronological order.
     *
     * @param value value of "rev" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetHistoryQueryWithExtended rev(MessagesRev value) {
        return unsafeParam("rev", value);
    }

    /**
     * Information whether the response should be extended
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetHistoryQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Group ID (for group messages with group access token)
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetHistoryQueryWithExtended groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * fields
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetHistoryQueryWithExtended fields(Fields... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetHistoryQueryWithExtended fields(List<Fields> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected MessagesGetHistoryQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
