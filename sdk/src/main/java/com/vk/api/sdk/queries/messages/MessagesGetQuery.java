package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.messages.responses.GetResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.get method
 */
public class MessagesGetQuery extends AbstractQueryBuilder<MessagesGetQuery, GetResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public MessagesGetQuery(VkApiClient client, UserActor actor) {
        super(client, "messages.get", GetResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public MessagesGetQuery(VkApiClient client, GroupActor actor) {
        super(client, "messages.get", GetResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Offset needed to return a specific subset of messages.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of messages to return.
     *
     * @param value value of "count" parameter. Maximum is 200. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Filter messages
     *
     * @param value value of "filters" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetQuery filters(Integer value) {
        return unsafeParam("filters", value);
    }

    /**
     * Maximum time since a message was sent, in seconds. To return messages without a time limitation, set as "0".
     *
     * @param value value of "time offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetQuery timeOffset(Integer value) {
        return unsafeParam("time_offset", value);
    }

    /**
     * Number of characters after which to truncate a previewed message. To preview the full message, specify "0".
     * NOTE: Messages are not truncated by default. Messages are truncated by words.
     *
     * @param value value of "preview length" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetQuery previewLength(Integer value) {
        return unsafeParam("preview_length", value);
    }

    /**
     * ID of the message received before the message that will be returned last (provided that no more than "count" messages were received before it; otherwise "offset" parameter shall be used).
     *
     * @param value value of "last message id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetQuery lastMessageId(Integer value) {
        return unsafeParam("last_message_id", value);
    }

    @Override
    protected MessagesGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
